create table person(
	id varchar2(20) primary key,
	name varchar2(30) not null
);

insert into person values('hong123','홍길동');

select * from person