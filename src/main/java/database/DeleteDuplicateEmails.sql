delete p2
from person p1
join person p2
on p1.Email = p2.Email
and p1.Id < p2.Id