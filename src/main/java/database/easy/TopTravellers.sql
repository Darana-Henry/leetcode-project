--https://leetcode.com/problems/top-travellers/

select name, coalesce(sum(distance),0) as travelled_distance
from Users u
left join Rides r
on u.id = r.user_id
group by user_id
order by sum(distance) desc, name asc