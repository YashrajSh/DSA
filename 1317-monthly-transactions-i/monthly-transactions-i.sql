# Write your MySQL query statement below
select date_format(trans_date,'%Y-%m') as month , country ,
count(*) as trans_count,
COUNT(CASE WHEN state = 'approved' THEN 1 END) AS approved_count,
sum(amount) as trans_total_amount , 
sum(CASE when state = 'approved' then amount else 0 END) as approved_total_amount
from transactions
GROUP BY DATE_FORMAT(trans_date, '%Y-%m'), country;
