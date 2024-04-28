--https://leetcode.com/problems/sales-person/


select name
from   salesperson
where  sales_id not in (select sales_id
                        from   orders
                        where  com_id in (select com_id
                                          from   company
                                          where  name = 'red'))


--solution #2
with cte
     as (select s.name
         from   orders o
                left join salesperson s
                       on s.sales_id = o.sales_id
                left join company c
                       on c.com_id = o.com_id
         where  c.name = 'red')

select name
from   salesperson
where  name not in (select *
                    from   cte)
