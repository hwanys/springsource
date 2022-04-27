package com.study.myapp.dao;

import static com.study.myapp.dao.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.myapp.dto.BookDTO;

@Repository //객체생성 -> singleton 방식으로 가지게 됨(한번만 생성하면 계속 사용가능)
public class BookDAO {
 	
	@Autowired
	private DataSource ds;
	
	public List<BookDTO> select(){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;								//h
		List<BookDTO> list = new ArrayList<BookDTO>();
		String sql = "select * from booktbl";
		try {
			con = ds.getConnection();						//H
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
			close(con);
		}	
		
		return list;
	}
	
	public int insert(BookDTO insertDto) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		Connection con = null;
		String sql = "insert into booktbl values(?,?,?,?)";
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, insertDto.getCode());
			pstmt.setString(2, insertDto.getTitle());
			pstmt.setString(3, insertDto.getWriter());
			pstmt.setInt(4, insertDto.getPrice());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		return result;
	}
}







