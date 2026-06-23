# Write your MySQL query statement below
select a.name , b.unique_id
from employees a
left join employeeuni b
on a.id=b.id;
