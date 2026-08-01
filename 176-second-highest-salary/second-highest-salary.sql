# Write your MySQL query statement below
select(
    select distinct salary 
    from ( select salary , 
        dense_rank() over (order by salary desc) as rnk
        from employee
    ) as xyz
    where rnk =2 )
    as secondhighestsalary;