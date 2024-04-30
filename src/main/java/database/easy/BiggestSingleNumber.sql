--https://leetcode.com/problems/biggest-single-number/description/

select ifnull(
(select num from MyNumbers
group by num
having count(*) = 1
order by num desc
limit 1), null) num