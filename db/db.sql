CREATE TABLE customer(
id INT PRIMARY KEY,
cus_name VARCHAR(50),
cus_age INT
)


SELECT * FROM customer

INSERT INTO customer (id,cus_name,cus_age) VALUES (1,'zhangsan',18)

UPDATE customer  SET cus_age = 30,cus_name='xiaoqiang' WHERE id =1


CREATE TABLE orders(
order_id INT PRIMARY KEY,
order_no VARCHAR(100),
order_price FLOAT
)



