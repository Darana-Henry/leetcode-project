--https://leetcode.com/problems/not-boring-movies/description/
select * from Cinema
where description != 'boring'
and id % 2 != 0
order by rating desc