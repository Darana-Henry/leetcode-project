--https://leetcode.com/problems/managers-with-at-least-5-direct-reports/

select name
from Employee
where id in
(
    select managerId
    from Employee e
    group by managerId
    having count(id) > 4
)