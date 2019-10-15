
#添加order and product 表
CREATE TABLE spring_practice.order(
id                      int(12)                not null auto_increment,
customer_id             bigint                 not null,
created_time            timestamp              NOT NULL DEFAULT now(),
last_modified_time      timestamp              NOT NULL DEFAULT now(),

constraint order_pk primary key(id)
);


ALTER TABLE spring_practice.order COMMENT '订单表表';
ALTER TABLE spring_practice.order MODIFY COLUMN id int(12) COMMENT '订单id';
ALTER TABLE spring_practice.order MODIFY COLUMN customer_id bigint COMMENT '顾客id';
ALTER TABLE spring_practice.order MODIFY COLUMN created_time bigint COMMENT '订单创建时间';
ALTER TABLE spring_practice.order MODIFY COLUMN last_modified_time bigint COMMENT '订单最后修改时间';


CREATE TABLE IF NOT EXISTS spring_practice.product(
id                      int(12)                      NOT NULL auto_increment,
name                    varchar(32)                 NOT NULL,
price                   int(10)                     NOT NULL,
order_id                bigint                      NOT NULL,
created_time            timestamp                   NOT NULL DEFAULT now(),
last_modified_time      timestamp                   NOT NULL DEFAULT now(),

constraint product_pk primary key(id)
);

ALTER TABLE spring_practice.product COMMENT '销售品信息表';
ALTER TABLE spring_practice.product MODIFY COLUMN id int(12) COMMENT '销售品id';
ALTER TABLE spring_practice.product MODIFY COLUMN name bigint COMMENT '销售品名称';
ALTER TABLE spring_practice.product MODIFY COLUMN price bigint COMMENT '销售品加个';
ALTER TABLE spring_practice.product MODIFY COLUMN order_id bigint COMMENT '订单id';
ALTER TABLE spring_practice.product MODIFY COLUMN created_time bigint COMMENT '销售品创建时间';
ALTER TABLE spring_practice.product MODIFY COLUMN last_modified_time bigint COMMENT '销售品最后修改时间';