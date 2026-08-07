# Write your MySQL query statement below
select product.product_name,Sales.year,Sales.price from Sales Inner join product on sales.product_id=product.product_id;