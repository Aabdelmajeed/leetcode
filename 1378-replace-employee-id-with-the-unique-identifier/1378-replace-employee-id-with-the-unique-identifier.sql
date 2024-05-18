# Write your MySQL query statement below
select e.unique_id ,l.name from EmployeeUNI e
right Join Employees l
on
l.id = e.id;