--https://leetcode.com/problems/average-selling-price/submissions/1254884040/

select p.product_id, ifnull(round(sum(u.units * p.price) / sum(u.units),2),0)  as average_price
from Prices p
left join UnitsSold u
on p.product_id = u.product_id
and u.purchase_date >= p.start_date
and u.purchase_date <= p.end_date
group by p.product_id
