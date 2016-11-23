create table user(
	id int(10) AUTO_INCREMENT,
	username varchar(20),
	password varchar(20),
	PRIMARY KEY(id)
);

insert into user(username,password) values('zhuangjinxin','123');