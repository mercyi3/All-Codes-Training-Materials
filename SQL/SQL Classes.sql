-- Creating database
show databases;
create database innovative;
use innovative;
select database();
drop database innovative;

use academy;
show tables;
desc student;

-- creating table 
create table t1(c1 int, c2 varchar(100), c3 date, c4 double);
desc t1;

create table employee(e_id int, e_name varchar(20) not null, 
e_salary double not null, DOJ date not null, primary key(e_id));
desc employee;
-- ************************************************************************************

-- Inserting Query
use academy;
insert into t1(c1,c2,c3,c4) values(101, 'rose', '2025/10/23', 2.15);  
insert into t1 values(102, 'abc', '2025-10-22', 3.14);
insert into t1(c1,c2) values(107, 'dft');

-- multiple records inserting
insert into t1 values(103, 'abcd', '2025-10-02', 5.14),(104, 'aabc', '2025-10-20', 8.4),
(105, 'trabc', '2025-10-25', 5.10), (106, 'abcde', '2025-10-12', 4.56); 

create database practice;
 use practice;
 
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
 
 update customers set city ="San Jose" where cnum=2006;
 update customers set rating = 500 where cnum= 2004;
 
 delete from customers where cnum=2007;
 delete from customers where cnum=2008;
 
--  **************** Excercise on Operators ******************* --

-- Select customers from London with a rating greater than 100: 
select * from customers where city='London' and rating >= 100;

-- Select salespeople with commission greater than 0.1 in London or New York:
select * from salespeople where comm > 0.1 and city in ('London', 'new york');

-- Select orders placed on October 3rd, 1996 with an amount greater than 1000:
select * from orders where odate='1996/03/10' and amt>1000;

-- Select customers with a rating of 200 and not from London:
select * from customers where rating=200 and city <> 'London';

-- Select orders placed by customer number 2008 with an amount greater than 1000:
select * from orders where cnum=2008 and amt>1000; 

-- ***********************************************************************************
-- Excercise on UPDATE & DELETE

use practice;
-- Select orders with amount between 1000 and 2000:
 SELECT * FROM orders WHERE amt BETWEEN 1000 AND 2000;

-- Select customers whose name starts with 'C' and are from cities other than London:
SELECT * FROM customers WHERE cname LIKE 'C%' AND city <> 'London';

-- Update customers name for customer number 2001:
update customers set cname='Robin' where cnum=2001;

--  Increase commission by 0.05 for salespeople from London:
update salespeople set comm = comm +0.05 where city='london';

-- Change the rating to 150 for customers from Rome:
update customers set rating=150 where city='rome';

--  Update order amount to 2000 for orders with ONUM 3001:
update orders set amt=2000 where onum=3001;
 
-- Delete customer with customer number 2001:
delete from customers where cnum=2001; 

--  Delete orders with order number 3001:
delete from orders where onum=3001;

-- Delete customer from San Jose:
delete from customers where city='San Jose';

--  Delete orders placed on October 3rd, 1996:
delete from orders where odate='1996/03/10';

-- ********************** Practice END **********************

create database alterex;
use alterex;
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2) -- 2000000000.00
);

insert into employees values(101, 'rose', 'sana', 30000.6);

--  Add a new column 'department'
alter table employees add column department varchar(20);
desc employees;

-- Modify the 'salary' column to increase its size and add a NOT NULL constraint
alter table employees modify column salary decimal(15,2) not null;
desc employees; 

--  Drop the 'department' column
alter table employees drop column department;

-- Add a new column 'email' and add a UNIQUE constraint to it
alter table employees add column email varchar(20) unique; 

-- Dropping a PRIMARY KEY
alter table employees drop primary key; 

-- Rename the table 'employees' to 'staff'
alter table employees rename to staff;

--  Rename the 'first_name' column to 'fname'
alter table staff rename column first_name to fname;
alter table staff rename column last_name to lname; 
desc staff; 

-- Add Constraints for fname and lname as not null
alter table staff add constraint primary key(emp_id);
alter table staff add constraint `uniq` unique(lname);

alter table staff drop constraint `uniq` ;

use practice;
alter table customers add check( rating>=100);
insert into customers(rating) values(50); -- violated check constraint
desc customers;

alter table customers modify city varchar(20) default 'London';
insert into customers(cnum, cname, rating) values(1001, 'Jessy', 250);
desc customers;

-- ***********************************************************************************
-- Data violation using forign key

use alterex;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

INSERT INTO departments (department_id, department_name) VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance'),
(4, 'Marketing');

select * from departments;

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO employees VALUES
(1, 'Alice', 'Smith', 1),
(2, 'Bob', 'Johnson', 2),
(3, 'Charlie', 'Brown', 3),
(4, 'David', 'Davis', 4),
(5, 'Eve', 'Miller', 2);

select * from employees;

INSERT INTO employees values(6, 'Harish', 'Raj', 5); -- data violation

delete from departments where department_id=1; -- violation

insert into departments values(5,"Sales");
delete from departments where department_id=5; -- not violated

-- Delete, Truncate  & Drop Example(DML)

delete from staff where emp_id=102;
select * from staff;

truncate table staff;
desc staff;

drop table staff;

-- Selecting perticular columns from table(DRL)
select first_name, last_name from employees;
select amt as highest_amount from orders where amt>2000;

-- Grant Example(DCL)
GRANT SELECT, INSERT, UPDATE, DELETE ON alterex.employees TO 'Admin'@'localhost';

-- Rovoke Example:
REVOKE SELECT, INSERT, UPDATE, DELETE ON alterex.employees FROM 'Admin'@'localhost';

-- TCL Example: (TCL)
use practice;
start transaction;

select * from customers;

delete from customers where cnum= 1001;
delete from customers where rating=150;

rollback;

truncate table salespeople; -- truncate cannot rollback 
rollback;

update customers set cname='Sana' where cnum=2001; -- violated bcz of primary key
update customers set cname='Sana' where snum=1001; -- accepted

select * from customers;
commit;
rollback; -- violated will not work

-- *******************************************************************************
-- SQL Joins

create database joins;
use joins;

create table t1(c1 varchar(10));
insert into t1 values('a'),('b'),('c'),('g'),('h');

create table t2(c2 varchar(10));
insert into t2 values('a'),('b'),('c'),('d'),('e');

select * from t1 inner join t2 on t1.c1=t2.c2;

select t1.c1,t2.c2  from t1 left join t2 on t1.c1=t2.c2;

select t1.c1,t2.c2  from t1 right join t2 on t1.c1=t2.c2;

select t1.c1,t2.c2  from t1 cross join t2;

select * from t1 union select * from t2;
select * from t1 union all select * from t2;

-- *************** Practice of Joins *********************************

use joins;

CREATE TABLE departments (
dept_id INT PRIMARY KEY,
dept_name VARCHAR(50)
);

CREATE TABLE employees (
emp_id INT PRIMARY KEY,
emp_name VARCHAR(50),
dept_id INT,
salary DECIMAL(10, 2),
FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);

INSERT INTO departments VALUES
(1, 'HR'),
(2, 'Finance'),
(3, 'Engineering'),
(4, 'Marketing');

INSERT INTO employees VALUES
(1, 'Alice', 1, 50000),
(2, 'Bob', 2, 60000),
(3, 'Charlie', 3, 70000),
(4, 'David', 3, 75000),
(5, 'Eve', NULL, 55000);

-- column alias example
select emp_name as "Employee Name", salary*12 as "CTC" from employees;

-- self join, table alias example 
SELECT a.emp_id, b.emp_name as EARNS_HIGHER, a.emp_name as EARNS_LESS, 
			b.SALARY as Higher_SALARY FROM employees a, employees b 
			WHERE a.SALARY < b.SALARY;
            
select e.emp_name, d.dept_name from employees e left join 
	departments d on e.dept_id= d.dept_id;
    
select e.emp_name, d.dept_name from employees e right join 
	departments d on e.dept_id= d.dept_id;
 
select e.emp_name, d.dept_name from employees e 
	right join departments d on e.dept_id= d.dept_id 
union
select e.emp_name, d.dept_name from employees e 
    left join departments d on e.dept_id= d.dept_id;

select e.emp_name, d.dept_name from employees e join departments d
where e.dept_id=d.dept_id; 

-- find employee name and department who all are having more than 60000 salary:
select e.emp_name, d.dept_name, salary from employees e join departments d 
	on e.dept_id = d.dept_id where salary > 60000;
    
-- find employee name, department and salary who is from hr department
select e.emp_name, d.dept_name, salary from employees e join departments d 
	on e.dept_id = d.dept_id where dept_name='hr';   
    
-- find employee details who have null as employee id
 select * from employees e right join departments d
	on e.dept_id = d.dept_id where emp_id is NULL;

-- find employee details with department whose name startinh with A:
 select * from employees e left join departments d
	on e.dept_id = d.dept_id where e.emp_name like 'A%';

-- *************************************************************************************
--  Aggregate & Clauses Examples

 create database clauses;
 use clauses;
 
 CREATE TABLE sales (
    transaction_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    salesperson_name VARCHAR(50),
    amount DECIMAL(10, 2)
);

INSERT INTO sales VALUES
(1, 'Laptop', 'Alice', 1200.00),
(2, 'Smartphone', 'Bob', 800.00),
(3, 'Tablet', 'Alice', 500.00),
(4, 'Laptop', 'Charlie', 1300.00),
(5, 'Smartphone', 'Alice', 900.00),
(6, 'Laptop', 'Bob', 1400.00),
(7, 'Tablet', 'Charlie', 600.00),
(8, 'Smartphone', 'Alice', 850.00),
(9, 'Laptop', 'Alice', 1500.00),
(10, 'Tablet', 'Bob', 700.00);

-- ******************* Aggregate Function Example ********************

select count(*) as total_row from sales;

select product_name,count(product_name) as total_products from sales 
where product_name='laptop';

select product_name, sum(amount) as total_amount from sales 
where product_name='tablet';

select product_name, avg(amount) as avg_sales from sales 
where product_name='laptop';

select product_name, max(amount) as max_amount from sales 
where product_name='Smartphone';

select min(product_name) as max_product from sales ;
-- max for varchar will take last appeared data
-- min for varchar will take fist appeared data

-- ********************** GROUP BY Examples ***********************

use clauses;

select product_name, max(amount) as max_product_sale from sales
group by product_name; 

select product_name, min(amount) as min_product_sale from sales
group by product_name; 

-- Total Sales Amount by Salesperson
 SELECT salesperson_name, SUM(amount) AS total_sales
	FROM sales GROUP BY salesperson_name;

-- Average Sales Amount by Product
  SELECT product_name, AVG(amount) AS average_sales
	FROM sales GROUP BY product_name;

-- Number of Sales Transactions by Salesperson
SELECT salesperson_name, COUNT(*) AS num_transactions
	FROM sales GROUP BY salesperson_name;
    
SELECT salesperson_name, min(transaction_id)
	FROM sales GROUP BY salesperson_name;

-- Total Sales Amount by Salesperson and Product with product count
  SELECT salesperson_name, product_name, count(product_name) as quantity, 
  SUM(amount) AS total_sales FROM sales 
  GROUP BY salesperson_name, product_name;

-- ************************ Having Examples ******************************

-- Salespersons with Total Sales Over 2000
SELECT salesperson_name, SUM(amount) AS total_sales FROM sales
	GROUP BY salesperson_name HAVING SUM(amount) > 2000;
 
-- supported bcz filter not affects group
SELECT salesperson_name, SUM(amount) AS total_sales FROM sales
where product_name='laptop' GROUP BY salesperson_name ; 

-- violated bcz filt affects grouping
SELECT salesperson_name, SUM(amount) AS total_sales FROM sales
	WHERE SUM(amount) > 2000 GROUP BY salesperson_name ; 

-- Products with Average Sales Amount Over 800
  SELECT product_name, AVG(amount) AS average_sales FROM sales
	GROUP BY product_name HAVING AVG(amount) > 800;

-- Salespersons with More Than 2 Transactions
  SELECT salesperson_name, COUNT(*) AS num_transactions FROM sales
	GROUP BY salesperson_name HAVING COUNT(*) > 2;

-- Products with Maximum Sales Amount Over 1000
  SELECT product_name, MAX(amount) AS max_sales FROM sales
	GROUP BY product_name HAVING MAX(amount) > 1000;

-- Salespersons with Total Sales Over 1000 for Laptops
SELECT salesperson_name, product_name, SUM(amount) AS total_sales FROM sales
	GROUP BY salesperson_name, product_name
	HAVING product_name = 'Laptop' AND SUM(amount) > 1000;
    
-- ************* Order By ***********************

select * from sales order by salesperson_name;

SELECT * FROM sales ORDER BY amount ASC;

SELECT * FROM sales ORDER BY amount DESC;

SELECT * FROM sales ORDER BY amount DESC, salesperson_name ASC;
insert into sales values(11, 'Tablet','Charlie', 1200);

SELECT salesperson_name, SUM(amount) AS total_sales FROM sales
	GROUP BY salesperson_name ORDER BY salesperson_name DESC;

SELECT product_name, AVG(amount) AS average_sales FROM sales
	GROUP BY product_name ORDER BY average_sales ASC;

-- **********************************************************************************
-- DISTINCT, LIMIT, OFFSET

use clauses;

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    city VARCHAR(50),
    age INT
);

INSERT INTO customers VALUES
(1, 'Alice', 'Smith', 'New York', 30),
(2, 'Bob', 'Johnson', 'Los Angeles', 25),
(3, 'Charlie', 'Brown', 'Chicago', 35),
(4, 'David', 'Davis', 'New York', 28),
(5, 'Eve', 'Miller', 'Houston', 22),
(6, 'Frank', 'Wilson', 'Chicago', 30),
(7, 'Grace', 'Taylor', 'Phoenix', 25),
(8, 'Henry', 'Anderson', 'Los Angeles', 35),
(9, 'Ivy', 'Clark', 'Houston', 28),
(10, 'Jack', 'Moore', 'Phoenix', 22);

-- select age category from customers
select distinct age from customers;

-- select number of city showing in customers table
select count(distinct city) as unique_cities from customers;

select distinct first_name, last_name from customers;

-- select unique lastname of customer who is having greater than 22 age 
select distinct last_name from customers where age>22;

-- find number of cities which having less than 30 age people
select count(distinct city) as cities_under_30 from customers where age<30;

-- find the age category people of los angles and phoenix city
select distinct age from customers where city in ('los angeles', 'phoenix');

select distinct first_name, city from customers;

select distinct last_name from customers where city='chicago';

-- find the unique age and city of the customer 
select distinct age, city from customers;

-- find unique row count of city and age together
select count(distinct age, city) as unique_age_city_comb  from customers;

-- find unique firstname of a customer from new york city
select distinct first_name from customers where city = 'new york';

-- ******************** LIMIT & OFFSET *****************************
-- LIMIT & OFFSET
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT
);

INSERT INTO students (student_id, first_name, last_name, age) VALUES
(1, 'Alice', 'Smith', 20),
(2, 'Bob', 'Johnson', 22),
(3, 'Charlie', 'Brown', 21),
(4, 'David', 'Davis', 23),
(5, 'Eve', 'Miller', 20),
(6, 'Frank', 'Wilson', 22),
(7, 'Grace', 'Taylor', 21),
(8, 'Henry', 'Anderson', 23),
(9, 'Ivy', 'Clark', 20),
(10, 'Jack', 'Moore', 22);

-- find student details who all are having age less than 22
select * from students where age< 22;

-- find only 2 student details who all are having age less than 22
select * from students where age< 22 limit 2;

select * from students where age< 22 order by age desc;
select * from students where age< 22 order by age desc limit 2;

-- find the second largest age of student
select distinct age from students order by age desc limit 1 offset 1;

select * from students limit 3 offset 2;

-- ******************* String Function ********************
select ASCII('*');
select char_length('hello');
select character_length('syed') as char_length;
select concat('Roshni',' Syed') as concatenated_string;
select format(12345.6787665, 3) As formatted_number;
select insert('hello World', 7, 4, 'Everyone') as inserted_string;
select lcase('HELLO WORLD') as lower_case;
select lower('HELLO WORLD') as lower_case;
select left('Hello World', 7) as left_String;
select right('Hello World', 7) as rightside;
select length('hello') as length_b;
select locate('World', 'Hello World') as position;
select position('world' in 'hello world') as position;
select lpad('hello', 7, '&') as lpad;
select ltrim('  Hello') as triming;
select rtrim('hello  ') as righttrim;
select REPEAT('hello', 3) as repeated;
select replace('hello world', 'world', 'Everyone') as replaced_string;
select reverse('hello') as reversed;
select space(5) as spacestr;
select concat('hello', space(5), 'world') as space_concat;
select mid('hello world', 7, 4) as mid; 
select substr('hello world', 7, 4) as sub_string;
select substring('hello world', 5, 7) as sub_string;
select concat(first_name, space(2), last_name) as fullName from students;

-- *************** Numeric Functions *****************
select abs(-5.2) as abs_value; -- to find absolute number
select ceil(4.2) as ceil_value;
select ceiling(4.0);
select floor(4.7) ;
select round(4.3) ;
select round(4.8);
select 9 div 4 as div_result;
select Mod(10, 3) as modulus; 
select pi() as pi_value;
select pow(2, 3) ;
select power(3, 4);
select round(4.567, 2) ;
select sign(5) ;
select sign(0);
select sqrt(6);

-- ******************* Date & Time Function ********************

select curdate();
select current_date();
select current_time();
select current_timestamp();
select curtime();
select date('2024-05-30 14:35:35') as dates;
select datediff('2025-11-06', '1999-08-01');
select dayname('1999-07-01') ;
select dayofweek('2025-11-06') ;
select dayofyear('2025-11-06'); 
select extract(year from '2024-05-30'); -- year , month, day
select from_Days(730332) ; -- 01-01-01
select hour('2024-05-30 14:35:20');
select last_day('2025-02-06'); -- '2024-09-30'
select localtime();
select localtimestamp();
select maketime(14, 35, 20); -- 14:35:20
select microsecond('2024-05-30 14:35:20.123456'); -- 123456
select monthname('2024-11-30');
select now();
select period_add(202405, 5); -- 202410
select period_diff(202405, 202304); -- 13(months)
select quarter('2024-11-28'); -- 2
select sec_to_time(5665); -- 01:01:05
select str_to_date('30-may-2020', '%d-%b-%y');
select subtime('14:35:20', '01:30:00');
select to_days('2025-11-06') as days;
select week('2025-11-06') as weeks; -- finished weeks
select weekofyear('2025-11-06') as weeks; -- current week
select yearweek('2025-11-06') as weeks;

-- ******************* SubQuery **************************

create database subqueries;
use subqueries;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL
);
INSERT INTO departments (department_id, department_name) VALUES
(1, 'Human Resources'),
(2, 'Finance'),
(3, 'Engineering'),
(4, 'Marketing');

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);
INSERT INTO employees (employee_id, first_name, last_name, salary, department_id) VALUES
(1, 'John', 'Doe', 50000, 1),
(2, 'Jane', 'Smith', 60000, 2),
(3, 'Jim', 'Brown', 70000, 3),
(4, 'Jake', 'White', 80000, 4),
(5, 'Julia', 'Black', 55000, 1),
(6, 'Jill', 'Green', 62000, 2),
(7, 'James', 'Grey', 75000, 3),
(8, 'Judy', 'Blue', 81000, 4),
(9, 'Jack', 'Red', 53000, 1),
(10, 'Janet', 'Orange', 63000, 2);

select department_id from departments where department_name = "engineering";

-- 1. Select Employee Names in a department enginneering:
select first_name , last_name from employees where department_id = 
(select department_id from departments where department_name= "engineering");

-- 2.  Find Employee names with a salary greater than averge salary:
select first_name , last_name, salary from employees where salary >
	(select avg(salary) from employees);
    
-- select avg(salary) from employees;

--  3. Get the department name of an employee Jim:
select department_name from departments where department_id =
    (select department_id from employees where first_name = 'Jim');
    
-- 4. Find employees in department with more than 2 employees:
select department_id, count(department_id) from employees
	group by department_id;

-- SubQuery 
-- select department_id from employees group by department_id having count(department_id)>2;
     
-- Using IN Clause:
select * from employees where department_id in
	(select department_id from employees group by department_id 
    having count(department_id)>2);

-- Using ANY Clause:
select * from employees where department_id = any
	(select department_id from employees group by department_id 
    having count(department_id)>2);

-- 5.Select Employee with Highest Salary:
select first_name, last_name, salary as highest_salary from employees 
 where salary = (select max(salary) from employees);
     
select * from employees order by salary desc limit 1;

-- 6. Get Department with average salary over 60000:
 select department_id, avg(salary) from employees 
	group by department_id having avg(salary)>60000;
    
 select department_name from departments where department_id = any
     (select department_id from employees group by department_id
     having avg(salary)>60000);

-- 7. Find Employees with salaries higher than those in finance department:
select max(salary) from employees where department_id = 
     (select department_id from departments where department_name='finance');
     
select first_name, last_name, salary from employees where salary >
  (select max(salary) from employees where department_id =
   (select department_id from departments where department_name='finance'));

-- 8. select employees who are not in the highest paid department 
-- Hint: To find maximun salaried department:(finding total salary then find highest salary)
select department_id, sum(salary) from employees group by department_id
     order by sum(salary) desc limit 1;

select department_id, first_name, last_name from employees 
  where department_id !=(select department_id from employees 
	group by department_id order by sum(salary) desc limit 1);
     
-- ************************ Case Statement *************************

create database cases;
use cases;

CREATE TABLE emp (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    department VARCHAR(100),
    salary DECIMAL(10, 2)
);

INSERT INTO emp (name, age, department, salary) VALUES
('Alice', 30, 'HR', 50000.00),
('Bob', 25, 'Engineering', 70000.00),
('Charlie', 28, 'Marketing', 60000.00),
('David', 35, 'Engineering', 80000.00),
('Eve', 40, 'HR', 55000.00);

-- categorizing salaryies and storing it in salary_category column.
select name, salary,
  case 
     when salary<60000 then 'low Salary'
     when salary between 60000 and 70000 then 'medium salary'
     else 'high salary'
  end as salary_category
from emp;

-- To select only medium salary category name, salary using subquery
select name, salary, salary_category from (
    select name, salary,
    case when salary<60000 then 'low Salary'
    when salary between 60000 and 70000 then 'medium salary'
    else 'high salary'
    end as salary_category
    from emp)
    as table1 where salary_category = 'medium salary';

-- select employee categorized by age-group:
 select name, age,
     case when age<30 then 'young'
    when age between 30 and 40 then 'middle aged'
     else 'senior' end as age_group from emp;

-- ********************* Windows Function **************************

 CREATE TABLE sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sales_rep VARCHAR(50),
    region VARCHAR(50),
    sales_amount DECIMAL(10, 2),
    sales_date DATE
);
 
 INSERT INTO sales (sales_rep, region, sales_amount, sales_date)
VALUES
    ('Alice', 'North', 500.00, '2024-05-01'),
    ('Bob', 'South', 600.00, '2024-05-01'),
    ('Alice', 'North', 700.00, '2024-05-02'),
    ('Bob', 'South', 800.00, '2024-05-02'),
    ('Charlie', 'East', 900.00, '2024-05-01'),
    ('Charlie', 'East', 1000.00, '2024-05-02'); 

insert into sales values(7,'Satwika','West',500,'2024-05-03'),
(8,'Raghu','West',600,'2024-05-03'),
(9,'Naveen','East',900,'2024-05-04');

-- find all employees from sales assign row_number() for salary in descending order
select id, sales_rep, region, sales_amount, row_number() 
  over(order by sales_amount desc) as row_num from sales;

select id, sales_rep, region, sales_amount, rank()
 over(order by sales_amount desc) as rank_num from sales;

select id, sales_rep, region, sales_amount, dense_rank() 
  over(order by sales_amount desc) as rankdense_num from sales;

 select sales_rep, sales_amount,
     rank() over ( order by sales_amount desc) as rank_1,
     dense_rank() over (order by sales_amount desc) as d_r,
     row_number() over (order by sales_amount desc) as row_num
     from sales;

-- *********************** Exist ************************

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50)
);
 
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
 
INSERT INTO customers (customer_id, customer_name) VALUES
(1, 'Alice'),
(2, 'Bob'),
(3, 'Charlie'),
(4, 'David'),
(5, 'Eve');

INSERT INTO orders (order_id, order_date, customer_id) VALUES
(1, '2023-01-01', 1),
(2, '2023-01-02', 1),
(3, '2023-01-03', 2),
(4, '2023-01-04', 3),
(5, '2023-01-05', 5);

-- Find  customer who have placed atleast one order
select customer_name from customers where exists(
select 1 from orders where customers.customer_id = orders.customer_id);

-- Find customers who have not placed any orders
select customer_name from customers where not exists(
select 1 from orders where customers.customer_id = orders.customer_id);

-- find orders by alice
select order_id, order_date from orders where exists(
select * from customers c where c.customer_id= orders.customer_id 
     and c.customer_name ='alice');

 -- find customers who placed in 2023
select customer_name from customers where exists (
select 1 from orders where customers.customer_id= orders.customer_id
     and year(order_date) = 2023);

-- ************************ Functions in SQL ******************************

DELIMITER //
CREATE FUNCTION CheckEvenOrOdd (num INT) -- num=78
RETURNS VARCHAR(40)
DETERMINISTIC
BEGIN
    RETURN IF(num%2 = 0, 'Even Number', 'Odd Number'); -- 78 % 2=0
END;
//
DELIMITER ;

SELECT CheckEvenOrOdd(78) AS result;

DELIMITER $$
CREATE FUNCTION CalculateCompoundInterest (principal DECIMAL(10, 2), 
										rate DECIMAL(5, 2), time INT, n INT)
RETURNS DECIMAL(10, 2)
DETERMINISTIC
BEGIN
    DECLARE amount DECIMAL(10, 2);
    SET amount = principal * POW((1 + rate / n), n * time); -- POW(5, 4)
    RETURN amount;
END;
$$ DELIMITER ;

SELECT CalculateCompoundInterest(1000, 0.05, 10, 4) AS amount;

SHOW FUNCTION STATUS where db='existing';

-- ************ Reads SQL Data *********************

use alter_cmd;

DELIMITER //
CREATE FUNCTION GetCustomerCount()
RETURNS INT
READS SQL DATA
BEGIN
    DECLARE customerCount INT;
    SELECT COUNT(*) INTO customerCount FROM customers;
    RETURN customerCount;
END;
// DELIMITER ;

Select GetCustomerCount() as Count;

-- *********************** No SQL *************************

DELIMITER //
CREATE FUNCTION CalculateSquare(num INT)
RETURNS INT
NO SQL
BEGIN
    RETURN num * num;
END;
//
DELIMITER ;

select CalculateSquare(9) as square;

Drop function CalculateSquare;

-- ********************* Stored Procedure ************************

-- 1. Printing name with greeting
DELIMITER $$
CREATE PROCEDURE sp_greeting(name VARCHAR(100))
BEGIN
    SELECT CONCAT('hello ', name) AS greeting;
END;
$$
DELIMITER ;

CALL sp_greeting('John Doe');

-- 2. fetching all order details
DELIMITER $$
CREATE PROCEDURE GetSalesDetails()
BEGIN
    SELECT * FROM salesperson;
END 
$$ DELIMITER ;

CALL GetSalesDetails(); 

-- 3. Stored Procedure with Input Parameter
use joins;
DELIMITER $$
CREATE PROCEDURE GetEmployeesByDepartment(IN department_id INT) 
BEGIN
    SELECT * FROM employees WHERE dept_id = department_id;
END$$
DELIMITER ;

CALL GetEmployeesByDepartment(2);

-- 4. Stored Procedure to Update an Employee's Salary

DELIMITER $$
CREATE PROCEDURE UpdateEmployeeSalary(
    IN employee_id INT,
    IN new_salary DECIMAL(10, 2)
)
BEGIN
    UPDATE employees
    SET salary = new_salary
    WHERE  emp_id = employee_id;
END$$
DELIMITER ;

CALL UpdateEmployeeSalary(2, 70000);

CALL UpdateEmployeeSalary(1, 70000);

-- 5.Stored Procedure to Delete an Employee
DELIMITER $$
CREATE PROCEDURE DeleteEmployee(IN employee_id INT)
BEGIN
    DELETE FROM employees WHERE emp_id = employee_id;
END$$
DELIMITER ;

CALL DeleteEmployee(4);

-- 6.Stored Procedure to Find the Total Salary by Department

DELIMITER $$
CREATE PROCEDURE TotalSalaryByDepartment()
BEGIN
    SELECT d.dept_name, SUM(e.salary) AS total_salary
    FROM employees e
    JOIN departments d ON e.dept_id = d.dept_id
    GROUP BY d.dept_name;
END$$
DELIMITER ;

CALL TotalSalaryByDepartment();

-- ********************** Triggers ************************

create database trig;
use trig;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT,
    salary DECIMAL(10, 2),
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO departments (department_id, department_name) VALUES
(1, 'HR'),
(2, 'Engineering'),
(3, 'Marketing');

INSERT INTO employees (employee_id, employee_name, department_id, salary) VALUES
(1, 'Alice', 1, 50000),
(2, 'Bob', 2, 60000),
(3, 'Charlie', 2, 70000),
(4, 'David', 3, 40000),
(5, 'Eve', 1, 45000);

CREATE TABLE audit_log (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    log_message VARCHAR(255),
    log_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$
CREATE TRIGGER BeforeInsertEmployee
BEFORE INSERT ON employees
FOR EACH ROW
BEGIN
    IF NEW.salary < 30000 THEN SET NEW.salary = 30000;
    END IF;
END
$$ DELIMITER ;

INSERT INTO employees VALUES(6, 'Alice', 1, 20000); -- salary triggered to change as 30k

-- Trigger After Insert
DELIMITER $$
CREATE TRIGGER AfterInsertEmployee
AFTER INSERT ON employees
FOR EACH ROW
BEGIN
    INSERT INTO audit_log (log_message) 
    VALUES (CONCAT('New employee added: ', NEW.employee_name));
END$$
DELIMITER ;

INSERT INTO employees VALUES(8, 'Aslam', 2, 45000);

-- Triggers before update
DELIMITER $$
CREATE TRIGGER BeforeUpdateEmployee
BEFORE UPDATE ON employees
FOR EACH ROW
BEGIN
    IF NEW.salary < OLD.salary THEN
        SET NEW.salary = OLD.salary;
    END IF;
END$$
DELIMITER ;

update employees set salary=55000 where employee_id=5;

-- Trigger After Update
DELIMITER $$
CREATE TRIGGER AfterUpdateEmployee
AFTER UPDATE ON employees
FOR EACH ROW
BEGIN
    INSERT INTO audit_log (log_message)
    VALUES (CONCAT('Employee ', NEW.employee_name, ' salary updated from ', 
		OLD.salary, ' to ', NEW.salary));
END$$
DELIMITER ;

update employees set salary=45000 where employee_id=5;

-- Trigger Before Delete
DELIMITER $$
CREATE TRIGGER BeforeDeleteEmployee
BEFORE DELETE ON employees
FOR EACH ROW
BEGIN
    IF OLD.department_id = (SELECT department_id FROM departments 
		WHERE department_name = 'Engineering') THEN
        SIGNAL SQLSTATE '45000' -- SQLSTATE '45000' is Error Code(User defined error)
		SET MESSAGE_TEXT = 'Cannot delete employees from Engineering department';
    END IF;
END$$
DELIMITER ;

delete from employees where employee_id=7;

DELIMITER $$
CREATE TRIGGER afterDeleteEmpl
AFTER DELETE ON employees
FOR EACH ROW
BEGIN
    insert into audit_log(log_message) values('Employeee is Deleted: ');
END$$
DELIMITER ;

delete from employees where employee_id= 6;

drop trigger afterDeleteEmpl;

-- ************************ Views **********************************

use trig;

-- View: EmployeeDepartments
CREATE VIEW EmployeeDepartments AS
SELECT e.employee_name, d.department_name
FROM employees e JOIN departments d ON e.department_id = d.department_id;

SELECT * FROM EmployeeDepartments;

-- View: DepartmentSalaries
CREATE VIEW DepartmentSalaries AS
SELECT d.department_name, SUM(e.salary) AS total_salary
FROM employees e JOIN departments d ON e.department_id = d.department_id
GROUP BY d.department_name;

SELECT * FROM DepartmentSalaries;

-- View: EngineeringEmployees
CREATE VIEW EngineeringEmployees AS
SELECT employee_name, salary FROM employees WHERE department_id = 
(SELECT department_id FROM departments WHERE department_name = 'Engineering');

SELECT * FROM EngineeringEmployees;

-- View: HighEarningEmployees
CREATE VIEW HighEarningEmployees AS
SELECT e.employee_name, e.salary, d.department_name
FROM employees e JOIN departments d ON e.department_id = d.department_id
WHERE e.salary > 50000;

SELECT * FROM HighEarningEmployees;

-- View: AuditLogs
CREATE VIEW AuditLogs AS
SELECT log_message, log_timestamp FROM audit_log
ORDER BY log_timestamp DESC;

SELECT * FROM AuditLogs;

