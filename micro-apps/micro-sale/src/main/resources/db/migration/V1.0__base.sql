/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/2/9 16:12:04                            */
/*==============================================================*/


drop table if exists sale_order;

drop table if exists sale_order_line;

/*==============================================================*/
/* Table: sale_order                                            */
/*==============================================================*/
create table sale_order
(
   id                   int not null auto_increment comment '主键',
   name                 char(20) comment '订单号',
   customer_name        char(50) comment '客户名称',
   customer_id          int comment '客户ID',
   company_name         char(50) comment '所属公司名称',
   company_id           int comment '所属公司ID',
   warehouse_name       char(50) comment '发货仓库',
   warehouse_id         int comment '发货仓库ID',
   shipping_address     char(100) comment '送货地址',
   state                char(20) default 'DRAFT' comment '订单状态',
   amount_total         decimal(10,2) comment '订单金额',
   remarks              text comment '订单备注',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id)
);

alter table sale_order comment '订单';

/*==============================================================*/
/* Index: name_index                                            */
/*==============================================================*/
create unique index name_index on sale_order
(
   name
);

/*==============================================================*/
/* Index: customer_name_index                                   */
/*==============================================================*/
create index customer_name_index on sale_order
(
   customer_name
);

/*==============================================================*/
/* Index: customer_id_index                                     */
/*==============================================================*/
create index customer_id_index on sale_order
(
   customer_id
);

/*==============================================================*/
/* Table: sale_order_line                                       */
/*==============================================================*/
create table sale_order_line
(
   id                   int not null auto_increment comment '主键',
   order_id             int comment '订单号',
   product_name         char(100) comment '产品名称',
   product_code         char(20) comment '产品编码',
   product_id           int comment '产品ID',
   count                int comment '数量',
   company_name         char(50) comment '所属公司名称',
   company_id           int comment '所属公司ID',
   warehouse_name       char(50) comment '发货仓库',
   state                int default 0 comment '订单状态 -1:异常,0:草稿 1:确认 2:支付 3:分拣 4:发货 5：收货',
   warehouse_id         int comment '发货仓库ID',
   price_total          decimal(10,2) comment '金额合计',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id),
   constraint FK_order_line_rel_order foreign key (order_id)
      references sale_order (id) on delete restrict on update restrict
);

alter table sale_order_line comment '订单明细';

