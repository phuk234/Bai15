use master
create database Bai15

 use Bai15

create table riversidecars(
id int IDENTITY(1,1) PRIMARY KEY,
 carname nvarchar(50), 
 price money, 
 modelyear int, 
 cardescription nvarchar(50)
 )


 insert riversidecars
 values('xe 1',5000,2000,'new')
 insert riversidecars
 values('xe 3',5000,2000,'new')
 insert riversidecars
 values('xe 4',5000,2000,'new')
 insert riversidecars
 values('xe 5',5000,2000,'new')
 insert riversidecars
 values('xe 6',5000,2000,'new')
 insert riversidecars
 values('xe 7',5000,2000,'new')