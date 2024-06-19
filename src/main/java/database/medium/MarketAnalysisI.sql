--https://leetcode.com/problems/market-analysis-i/

with cte as
(
    select *, case when year(order_date) = 2019 then 1 else 0 end as purchased
    from Users u
    left join Orders o
    on u.user_id = o.buyer_id
)

select user_id as buyer_id, join_date, sum(purchased) as orders_in_2019
from cte
group by buyer_id
order by buyer_id
