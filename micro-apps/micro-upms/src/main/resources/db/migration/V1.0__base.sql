/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/3/5 17:09:39                            */
/*==============================================================*/


drop table if exists company;

drop table if exists department;

drop table if exists group_role;

drop table if exists groups;

drop table if exists menu;

drop table if exists operation;

drop table if exists position;

drop table if exists role;

drop table if exists role_menu;

drop table if exists role_model;

drop table if exists role_operation;

drop table if exists table_entity;

drop table if exists user;

drop table if exists user_group;

drop table if exists user_role;

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
/* Index: name                                                  */
/*==============================================================*/
create unique index name on company
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
/* Index: name                                                  */
/*==============================================================*/
create unique index name on department
(
   name
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   int not null auto_increment comment '主键',
   name                 char(50) comment '角色名',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id)
);

alter table role comment '角色';

/*==============================================================*/
/* Table: groups                                                */
/*==============================================================*/
create table groups
(
   id                   int not null auto_increment comment '主键',
   name                 char(50) comment '用户组名',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id)
);

alter table groups comment '用户组';

/*==============================================================*/
/* Table: group_role                                            */
/*==============================================================*/
create table group_role
(
   role_id              int comment '角色',
   id                   int comment '主键',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   constraint FK_Reference_14 foreign key (role_id)
      references role (id) on delete restrict on update restrict,
   constraint FK_Reference_21 foreign key (id)
      references groups (id) on delete restrict on update restrict
);

alter table group_role comment '用户组_角色';

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   id                   int not null auto_increment comment '主键',
   parent_id            int comment '父菜单',
   name                 char(50) comment '菜单名称',
   path                 char(10) comment '菜单路径',
   clazz                char(20) comment 'web体现为class',
   sequence             int comment '排列序号',
   type                 char(20) comment '类型',
   active               bool default 1 comment '有效',
   remark               char(50) comment '备注',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id),
   constraint FK_Reference_16 foreign key (parent_id)
      references menu (id) on delete restrict on update restrict
);

alter table menu comment '菜单';

/*==============================================================*/
/* Table: operation                                             */
/*==============================================================*/
create table operation
(
   id                   int not null comment '主键',
   code                 char(10) comment '操作编号',
   name                 char(50) comment '操作名称',
   menu_id              int comment '所属菜单',
   active               bool comment '有效',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id),
   constraint FK_Reference_17 foreign key (menu_id)
      references menu (id) on delete restrict on update restrict
);

alter table operation comment '可以进行的操作';

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
/* Index: name                                                  */
/*==============================================================*/
create unique index name on position
(
   name
);

/*==============================================================*/
/* Table: role_menu                                             */
/*==============================================================*/
create table role_menu
(
   role_id              int comment '角色',
   menu_id              int comment '菜单',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   constraint FK_Reference_24 foreign key (role_id)
      references role (id) on delete restrict on update restrict,
   constraint FK_Reference_25 foreign key (menu_id)
      references menu (id) on delete restrict on update restrict
);

alter table role_menu comment '角色可以展示的菜单';

/*==============================================================*/
/* Table: table_entity                                          */
/*==============================================================*/
create table table_entity
(
   id                   int not null auto_increment comment '主键',
   name                 char(50) comment '实体名称',
   package_path         char(200) comment '包路径',
   remark               text comment '备注',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   primary key (id)
);

alter table table_entity comment '主要针对数据库的表';

/*==============================================================*/
/* Table: role_model                                            */
/*==============================================================*/
create table role_model
(
   entity_id            int comment '实体',
   role_id              int comment '角色',
   create_ok            bool default 1 comment '增加',
   delete_ok            bool default 1 comment '删除',
   update_ok            bool default 1 comment '修改',
   read_ok              bool default 1 comment '查询',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   constraint FK_Reference_22 foreign key (role_id)
      references role (id) on delete restrict on update restrict,
   constraint FK_Reference_23 foreign key (entity_id)
      references table_entity (id) on delete restrict on update restrict
);

alter table role_model comment '角色可操作的实体';

/*==============================================================*/
/* Table: role_operation                                        */
/*==============================================================*/
create table role_operation
(
   role_id              int comment '角色',
   operation_id         int comment '操作',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   constraint FK_Reference_18 foreign key (role_id)
      references role (id) on delete restrict on update restrict,
   constraint FK_Reference_19 foreign key (operation_id)
      references operation (id) on delete restrict on update restrict
);

alter table role_operation comment '角色_操作';

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
   department_id        int comment '所属部门',
   position_id          int comment '职位',
   primary key (id),
   constraint FK_Reference_5 foreign key (company_id)
      references company (id) on delete restrict on update restrict,
   constraint FK_Reference_6 foreign key (department_id)
      references department (id) on delete restrict on update restrict,
   constraint FK_Reference_9 foreign key (position_id)
      references position (id) on delete restrict on update restrict
);

alter table user comment '系统用户';

/*==============================================================*/
/* Index: username                                              */
/*==============================================================*/
create unique index username on user
(
   username
);

/*==============================================================*/
/* Index: email                                                 */
/*==============================================================*/
create unique index email on user
(
   email
);

/*==============================================================*/
/* Table: user_group                                            */
/*==============================================================*/
create table user_group
(
   user_id              int comment '用户',
   group_id             int comment '用户组',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   constraint FK_Reference_10 foreign key (user_id)
      references user (id) on delete restrict on update restrict,
   constraint FK_Reference_20 foreign key (group_id)
      references groups (id) on delete restrict on update restrict
);

alter table user_group comment '用户_用户组';

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   user_id              int comment '用户',
   role_id              int comment '角色',
   create_time          timestamp default CURRENT_TIMESTAMP comment '创建时间',
   create_uid           int comment '创建者',
   update_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   update_uid           int comment '更新者',
   constraint FK_Reference_12 foreign key (user_id)
      references user (id) on delete restrict on update restrict,
   constraint FK_Reference_13 foreign key (role_id)
      references role (id) on delete restrict on update restrict
);

alter table user_role comment '用户_角色';

