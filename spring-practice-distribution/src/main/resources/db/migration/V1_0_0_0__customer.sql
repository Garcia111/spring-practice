

CREATE TABLE IF NOT EXISTS spring_practice.customer(
  id             bigint                      NOT NULL,
  name           varchar(32)                 NOT NULL,
  mobile         varchar(16)                 NOT NULL,
  address        varchar(100)                NOT NULL
);

#MySql添加个注释也太麻烦了
ALTER TABLE spring_practice.customer COMMENT '顾客信息表';
ALTER TABLE spring_practice.customer MODIFY COLUMN id bigint COMMENT '顾客id序列号';
ALTER TABLE spring_practice.customer MODIFY COLUMN name varchar(32) COMMENT '顾客名字';
ALTER TABLE spring_practice.customer MODIFY COLUMN mobile varchar(16) COMMENT '顾客手机号';
ALTER TABLE spring_practice.customer MODIFY COLUMN address varchar(100) COMMENT '顾客地址';
