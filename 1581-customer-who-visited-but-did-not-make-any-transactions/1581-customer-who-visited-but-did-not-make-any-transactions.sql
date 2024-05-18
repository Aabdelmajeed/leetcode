# Write your MySQL query statement below
SELECT v.customer_id , count(v.customer_id) as count_no_trans
from
 Visits v 
left join Transactions t
on v.visit_id = t.visit_id
where t.visit_id is null
Group by customer_id;