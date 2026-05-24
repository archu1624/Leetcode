# Write your MySQL query statement below
select e.name,b.bonus
from bonus as b
right join employee as e
on b.empId=e.empId
where bonus< 1000 || bonus is null;