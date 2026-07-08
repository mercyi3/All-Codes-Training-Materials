-- 10-06-2025 
show databases;
create database demo;
use demo;
select database();

-- Creating Table --
create table t1(c1 int, c2 varchar(20), c3 date); 

show tables;
desc t1;
-- Inserting Data into table t1 --

insert into t1(c1, c2, c3) values(1, 'rose', '2025-05-03'); 

insert into t1 values(2, 'sam', '2025-05-05'),(3, 'dev', '2025-05-08'), (5, 'bob', '2025-05-12'); 

insert into t1(c2, c3) values('sanam', '2025-05-15');

 --  11-06-2025 

 create database alter_cmd;
 use alter_cmd;
 
 create table customers( cnum int, cname varchar(20), 
 city varchar(20), rating int, snum int);
 
 insert into customers values(2001, 'Hoffman', 'London' , 100, 1001), 
 ( 2002, 'Giovanni', 'Rome' ,2100, 1003),
 ( 2003, 'Liu', 'San Jose' , 200, 1002), (2004, 'Grass', 'Berlin' , 300, 1002), 
 ( 2006, 'Clemens', 'London' , 100, 1001),
 ( 2008, 'Cisneros', 'San Jose' , 300, 1007), 
 ( 2007, 'Pereira', 'Rome' , 100, 1004);
 
 create table salespeople (snum int, sname varchar(20), 
 city varchar(20), comm double);
 
  insert into salespeople values(1001, 'Peel', 'London' , 0.12), 
 ( 1002, 'Serres', 'San Jose' ,0.13),
 ( 1004, 'Motika', 'London' , 0.11), 
 ( 1007, 'Rifkin', 'Barcelona' , 0.15), 
 ( 1003, 'AxelRod', 'New York' , 0.10),
 ( 1005, 'Fran', 'London' , 0.26);
 
  create table orders (onum int, amt double, odate date, cnum int, snum int);
  
  insert into orders values(3001, 18.69, '1996/03/10' , 2008, 1007), 
 ( 3003, 767.19, '1996/03/10' ,2001, 1001),
 ( 3002, 1900.10, '1996/03/10' , 2007, 1004), 
 ( 3005, 5160.45, '1996/03/10' , 2003, 1002), 
 ( 3006, 1098.16, '1996/03/10' , 2008, 1007),
 ( 3009, 1713.23, '1996/04/10' , 2002, 1003), 
 ( 3007, 75.75, '1996/04/10' , 2002, 1003),
 ( 3008, 4723.00, '1996/05/10' , 2006, 1001),
 ( 3010, 1309.95, '1996/06/10' , 2004, 1002),
 ( 3011, 9891.88, '1996/06/10' , 2006, 1001);
 
 -- Updating Query
 use alter_cmd;
 update customers set city ="San Jose" where snum=2004;
 
 -- 12-06-2025 --
 update salespeople set city="Berlin" where snum=1005;
 
 -- Deleting a row
 delete from orders where snum=1001;
 
 -- Alter Commands --
 alter table customers add column age int;
 
 alter table orders modify column amt int;
 desc orders;
 
 alter table customers drop column age;
 
 alter table orders add constraint primary key(onum);
 desc orders;
 alter table salespeople add constraint primary key(snum);
 desc salespeople;
 
 alter table orders add constraint foreign key(snum) references salespeople(snum);

 alter table customers add constraint primary key(cnum);
 desc customers;
alter table orders add constraint `fk_value` foreign key(cnum) references customers(cnum);
desc orders;

alter table salespeople add constraint `uniq` unique(sname, comm);
desc salespeople;

insert into salespeople values(1006, 'devid', 'New York', 0.56),(1009, 'devid', 'New Jersey', 0.56);

alter table salespeople drop constraint `uniq`;
desc salespeople;

-- alter table orders drop foreign key;

alter table salespeople rename to salesperson;
select * from salesperson;

alter table salesperson rename column comm to commision;
select * from salesperson;

--  Excercise on Operators --
-- Select customers from London with a rating greater than or equal to 100: 
select * from alter_cmd.customers where city='London' and rating >= 100;

-- Select salespeople with commission greater than 0.1 in London or New York:
select * from salesperson where commision > 0.1 
and city in ('London', 'new york');

-- Select orders placed on October 3rd, 1996 with an amount greater than 1000:
select * from orders where odate='1996/03/10' and amt>1000;

-- Select customers with a rating of 200 and not from London:
select * from customers where rating=200 and city <> 'London';

-- Select orders placed by customer number 2008 with an amount greater than 1000:
select * from orders where cnum=2008 and amt>1000;

-- Update customer name for customer number 2001:
update customers set cname='Robin' where cnum=2001;

--  Increase commission by 0.05 for salespeople from London:
update salesperson set commision= commision+0.05 where city='london';

-- Change the rating to 150 for customers from Rome:
update customers set rating=150 where city='rome';

--  Update order amount to 2000 for orders with ONUM 3001:
update orders set amt=2000 where onum=3001;

create table customer(cnum int, cname varchar(20), city varchar(20), rating int);
insert into customer values(2001, 'Hoffman', 'London' , 100), 
 ( 2002, 'Giovanni', 'Rome' ,2100),
 ( 2003, 'Liu', 'San Jose' , 200), ( 2004, 'Grass', 'Berlin' , 300), 
 ( 2006, 'Clemens', 'London' , 100);
 
-- Delete customer with customer number 2001:
delete from customer where cnum=2001; 

--  Delete orders with order number 3001:
delete from orders where onum=3001;

-- Delete customer from London:
delete from customer where city='London';

--  Delete orders placed on October 3rd, 1996:
delete from orders where odate='1996/03/10';

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2)
);

insert into employees values(105, 'rashmi', 'sanam', 35000.456);

--  Add a new column 'department'
alter table employees add column department varchar(20);

-- Modify the 'salary' column to increase its size and add a NOT NULL constraint
alter table employees modify column salary decimal(15,2) not null;
desc employees; 

--  Drop the 'department' column
alter table employees drop column department;

-- Add a new column 'email' and add a UNIQUE constraint to it
alter table employees add column email varchar(20) unique; 
desc employees;

-- Dropping a PRIMARY KEY
alter table employees drop primary key; 
desc employees;

-- Rename the table 'employees' to 'staff'
alter table employees rename to staff;

--  Rename the 'first_name' column to 'fname'
alter table staff rename column first_name to fname;
alter table staff rename column last_name to lname; 

-- 09-09-2025 Contraints

use alter_cmd;
alter table customers add check(rating>=100);
insert into customers values(2009, 'Sana', 'San Jose', 50, 1007); -- violated

alter table customers modify city varchar(20) default 'London';
insert into customers(cnum, cname, rating, snum) values(2010, 'Sana', 150, 1007);

-- Truncate & Delete

delete from salesperson where city='London';

truncate table salesperson; -- violated
truncate table customer;
desc customer;

drop table customer;

-- create practicle database and demo table
SELECT * FROM practicle.demo;

insert into practicle.demo(name) values('kumariii'),('Hamthaaa');
SELECT * FROM practicle.demo;

delete from practicle.demo where id=4;
SELECT * FROM practicle.demo;

truncate table practicle.demo;
SELECT * FROM practicle.demo;

-- Select query practices

-- select customer name who have more than 200 rating
select cname from customers where rating>200;

-- select customer name and cnum who is from san jose
select cnum, cname, city from customers where city='san jose';




 

 
 
 
  
 
