--https://leetcode.com/problems/calculate-special-bonus/description/

-- Professional's Solution
select employee_id,
    case
        when employee_id % 2 <> 0 and name not like 'M%' then salary
        else 0
    end as bonus
from Employees
order by employee_id asc





-- Beginner's Solution
select employee_id, salary as bonus
from Employees
where employee_id%2 = 1
and name not like 'M%'
union
select employee_id, 0 as bonus
from Employees
where (employee_id%2 =0)
or (employee_id%2 = 1 and name like 'M%')
order by employee_id asc