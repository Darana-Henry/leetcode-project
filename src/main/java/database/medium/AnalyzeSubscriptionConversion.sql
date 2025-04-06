--https://leetcode.com/problems/analyze-subscription-conversion/

SELECT   ft.user_id,   Round(ft.avg_trail, 2) AS trial_avg_duration,   Round(pt.avg_paid, 2) AS paid_avg_duration
FROM
  (
    SELECT       user_id,       Avg(activity_duration) AS avg_trail
    FROM       useractivity
    WHERE       activity_type = 'free_trial'
    GROUP BY       user_id
  ) AS ft
  JOIN (
    SELECT       user_id,       Avg(activity_duration) AS avg_paid
    FROM       useractivity
    WHERE      activity_type = 'paid'
    GROUP BY       user_id
  ) AS pt
  ON ft.user_id = pt.user_id
ORDER BY   ft.user_id;
