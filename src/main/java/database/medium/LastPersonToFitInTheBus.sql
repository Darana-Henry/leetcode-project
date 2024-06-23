--https://leetcode.com/problems/last-person-to-fit-in-the-bus/

select a.person_name
from Queue a
join Queue b
on a.turn >= b.turn
group by a.turn
having sum(b.weight) <= 1000
order by a.turn desc
limit 1