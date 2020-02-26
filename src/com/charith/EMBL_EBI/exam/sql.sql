 SELECT AVG(SUM(traffic.time_spent)) OVER
      (ORDER BY traffic.visited_on ROWS BETWEEN 3 PRECEDING AND CURRENT ROW)
      AS moving_average
    FROM traffic traffic, users users
    where traffic.user_id = users.id
    and users.user_type = 'user'
    group by traffic.visited_on
    ORDER BY traffic.visited_on;