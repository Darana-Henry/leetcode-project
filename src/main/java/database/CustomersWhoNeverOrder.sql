select name as Customers
from Customers
left join Orders on Customers.Id = Orders.Id
Where CustomerId is null