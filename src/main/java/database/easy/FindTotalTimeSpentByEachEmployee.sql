--https://leetcode.com/problems/find-total-time-spent-by-each-employee/description/

select event_day as day, emp_id, sum(out_time - in_time) as total_time
from Employees
group by emp_id, event_day
order by event_day asc, emp_id asc