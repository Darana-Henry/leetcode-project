select b.id as Id
from Weather a join Weather b
on datediff(b.recordDate, a.recordDate) = 1
and b.temperature > a.temperature