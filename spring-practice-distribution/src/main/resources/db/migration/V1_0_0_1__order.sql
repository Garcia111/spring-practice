
#添加order and product 表
CREATE TABLE IF NOT EXISTS spring_practice.order(
id                bigint                      NOT NULL,
customer_id       bigint                 NOT NULL
);


ALTER TABLE spring_practice.order COMMENT '订单表表';
ALTER TABLE spring_practice.order MODIFY COLUMN id bigint COMMENT '订单id';
ALTER TABLE spring_practice.order MODIFY COLUMN customer_id bigint COMMENT '顾客id';



CREATE TABLE IF NOT EXISTS spring_practice.product(
id                serial                      NOT NULL,
name              varchar(32)                 NOT NULL,
price             int(10)                     NOT NULL,
order_id          bigint
);

ALTER TABLE spring_practice.product COMMENT '销售品信息表';
ALTER TABLE spring_practice.product MODIFY COLUMN id bigint COMMENT '销售品id';
ALTER TABLE spring_practice.product MODIFY COLUMN name bigint COMMENT '销售品名称';
ALTER TABLE spring_practice.product MODIFY COLUMN price bigint COMMENT '销售品加个';
ALTER TABLE spring_practice.product MODIFY COLUMN order_id bigint COMMENT '订单id';