--https://leetcode.com/problems/swap-salary/description/

--Solution #1
update salary set sex = if(sex = "m", "f", "m")

--Solution #2
update salary set sex = case when sex = "m" then "f" else "m" end