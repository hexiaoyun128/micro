/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/2/23 14:05:29                           */
/*==============================================================*/


drop table if exists company;

drop table if exists department;

drop table if exists position;

drop table if exists user;

drop table if exists user_info;

/*==============================================================*/
/* Table: company                                               */
/*==============================================================*/
create table company
(
   id                   int not null auto_increment comment '主键',
   name                 char(100) comment '公司名称',
   parent_id            int comment '母公司',
   province             char(20) comment '省份',
   city                 char(20) comment '城市',
   district             char(20) comment '区县',
   street               char(100) comment '街道',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id),
   constraint FK_parent_id_rel foreign key (parent_id)
      references company (id) on delete restrict on update restrict
);

alter table company comment '公司';

/*==============================================================*/
/* Index: name_index                                            */
/*==============================================================*/
create unique index name_index on company
(
   name
);

/*==============================================================*/
/* Table: department                                            */
/*==============================================================*/
create table department
(
   id                   int not null auto_increment comment '主键',
   name                 char(50) comment '部门名称',
   parent_id            int comment '上级部门',
   company_id           int comment '所属公司',
   manager_id           int comment '部门经理ID(用户)',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id),
   constraint FK_department_rel_company foreign key (company_id)
      references company (id) on delete restrict on update restrict,
   constraint FK_parent_rel foreign key (parent_id)
      references department (id) on delete restrict on update restrict
);

alter table department comment '部门';

/*==============================================================*/
/* Index: name_index                                            */
/*==============================================================*/
create unique index name_index on department
(
   name
);

/*==============================================================*/
/* Table: position                                              */
/*==============================================================*/
create table position
(
   id                   int not null auto_increment comment '主键',
   name                 char(20) comment '职位名称',
   description          text comment '职位说明',
   department_id        int comment '部门',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id),
   constraint FK_position_rel_department foreign key (department_id)
      references department (id) on delete restrict on update restrict
);

alter table position comment '职位';

/*==============================================================*/
/* Index: name_index                                            */
/*==============================================================*/
create unique index name_index on position
(
   name
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment comment '主键',
   username             char(50) comment '用户名',
   alias                char(50) comment '别名',
   email                char(50) comment '邮箱',
   password             char(100) comment '密码',
   active               bool default 1 comment '有效',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id)
);

alter table user comment '系统用户';

/*==============================================================*/
/* Index: username_index                                        */
/*==============================================================*/
create unique index username_index on user
(
   username
);

/*==============================================================*/
/* Index: email_index                                           */
/*==============================================================*/
create unique index email_index on user
(
   email
);

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   int not null comment '主键',
   alias                char(20) comment '别名',
   is_company           bool default 1 comment '公司用户',
   is_supplier          bool default 0 comment '供应商用户',
   is_customer          bool default 0 comment '客户用户',
   company_supper       bool default 0 comment '公司管理员',
   system_supper        bool default 0 comment '系统管理员',
   tel_phone            char(20) comment '电话号码',
   mobile_phone         char(20) comment '手机号码',
   qq                   char(20) comment 'QQ',
   wechat               char(20) comment '微信',
   company_id           int comment '所属公司',
   user_id              int comment '用户ID',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id),
   constraint FK_user_info_rel_user foreign key (user_id)
      references user (id) on delete restrict on update restrict,
   constraint FK_Reference_6 foreign key (company_id)
      references company (id) on delete restrict on update restrict
);

alter table user_info comment '用户信息表';

/*==============================================================*/
/* Index: user_id_index                                         */
/*==============================================================*/
create unique index user_id_index on user_info
(
   user_id
);

