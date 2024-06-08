--https://leetcode.com/problems/rank-scores/description/

--Solution #1
select score,
dense_rank() over (order by score desc) as "Rank"
from Scores

--Solution #2
 select s1.score,
 (select count(distinct s2.score) from Scores s2 where s2.score >=s1.score) as "Rank"
 from Scores s1
 order by score desc