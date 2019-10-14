

use spring_practice;

CREATE TABLE IF NOT EXISTS public.customer(
  id             BIGSERIAL                   NOT NULL,
  name           varchar(32)                 NOT NULL,
  mobile         varchar(16)                 NOT NULL,
  address        varchar(100)                NOT NULL
)


COMMENT ON TABLE public.customer
    IS '顾客信息表';
COMMENT ON COLUMN public.customer.id
    IS '顾客id序列号';
COMMENT ON COLUMN public.customer.name
    IS '顾客名字';
COMMENT ON COLUMN public.customer.mobile
    IS '顾客手机号';
COMMENT ON COLUMN public.customer.address
    IS '顾客地址';