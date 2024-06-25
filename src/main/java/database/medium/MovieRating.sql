--https://leetcode.com/problems/movie-rating/

(
    select name as results
    from Users u
    join MovieRating mr
    on u.user_id = mr.user_id
    group by u.user_id
    order by count(mr.movie_id) desc, name asc
    limit 1
)

union all

(
    select title as results
    from Movies m
    join MovieRating mr
    on m.movie_id = mr.movie_id
    where year(mr.created_at) = '2020'
    and month(mr.created_at) = '02'
    group by m.movie_id
    order by avg(rating) desc, title asc
    limit 1

)