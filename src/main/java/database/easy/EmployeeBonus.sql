select name, bonus
from Employee left join Bonus
on Employee.empId = Bonus.empId
where coalesce(bonus, 0) < 1000