--https://leetcode.com/problems/classes-more-than-5-students/
select class
from Courses
group by class
having count(distinct student) >= 5