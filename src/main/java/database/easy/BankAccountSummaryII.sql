--https://leetcode.com/problems/bank-account-summary-ii/


select name, sum(amount) as balance
from Users u
left join Transactions t
on u.account = t.account
group by u.account
having sum(amount) > 10000