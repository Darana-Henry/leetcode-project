--https://leetcode.com/problems/percentage-of-users-attended-a-contest/description/

select contest_id, round(count(distinct user_id)/ (select count(distinct user_id) from Users),4)*100 as percentage
from Register
group by contest_id
order by  percentage desc, contest_id asc