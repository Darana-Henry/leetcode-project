--https://leetcode.com/problems/confirmation-rate/

--Solution #1
select
    user_id,
    round(sum(case when action = 'confirmed' then 1 else 0 end) / count(user_id), 2) as confirmation_rate
from Confirmations
group by user_id

union

select
    user_id,
    0  as confirmation_rate
from Signups
where user_id not in
(
    select
        distinct user_id
    from Confirmations
)

--Solution #2
select
    s.user_id,
    coalesce(round(avg(action = 'confirmed'), 2),0) as confirmation_rate
from Signups s
left join Confirmations c
using(user_id)
group by s.user_id
order by s.user_id