--https://leetcode.com/problems/department-top-three-salaries/

select
    d.name as "Department",
    e.name as "Employee",
    e.salary as "Salary"
from
(
    select
        departmentId,
        name,
        salary,
        dense_rank() over(partition by departmentId order by salary desc) as r
    from Employee
) as e
join Department d
on d.id = e.departmentId
where r <= 3