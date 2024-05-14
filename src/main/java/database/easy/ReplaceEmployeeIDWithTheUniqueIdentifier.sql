--https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description/

select unique_id, name
from Employees e
left join EmployeeUNI u
on e.id = u.id