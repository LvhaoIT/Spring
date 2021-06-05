DROP table if exists sale;
create table sale (
id int(11) key primary key auto_increment,
gid int(11) not null ,
nums int(11)
);

DROP table if exists goods;
create table goods (
id int(11) PRIMARY key,
name varchar(100) ,
amount int(11) ,
price decimal(9,2)
);

insert into goods values
(1001,'笔记本',10,15),
(1002,'手机',20,3000);