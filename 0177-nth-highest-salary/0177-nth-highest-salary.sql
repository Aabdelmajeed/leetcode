CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE nHighestSalary INT;
  SET nHighestSalary = N - 1;
    RETURN(
        SELECT DISTINCT salary
        FROM employee
        ORDER BY salary DESC
        LIMIT 1
        OFFSET nHighestSalary
        );
END;


