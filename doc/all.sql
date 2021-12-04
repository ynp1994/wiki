drop table if exists `test`;

create table `test`
(
    `id`       bigint not null comment 'id',
    `username` varchar(50) comment '用户名',
    `password` varchar(50) comment '密码',
    primary key (`id`)
) engine = innodb
  default charset = utf8mb4 comment = '测试';


drop table if exists `demo`;

create table `demo`
(
    `id`       bigint not null comment 'id',
    `username` varchar(50) comment '用户名',
    primary key (`id`)
) engine = innodb
  default charset = utf8mb4 comment = '测试';


drop table if exists `ebook`;
create table `ebook`
(
    `id`           bigint not null,
    `name`         varchar(50),
    `category1_id` bigint,
    `category2_id` bigint,
    `description`  varchar(200),
    `cover`        varchar(200),
    `doc_count`    int,
    `view_count`   int,
    `vote_count`   int,
    primary key (`id`)
) engine = innodb
  default charset = utf8mb4;

insert into `ebook` (id, name, description) values(1, 'Spring boot 入门教程', '零基础入门Spring boot开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values(2, 'Vue 入门教程', '零基础入门Vue开发，企业级应用开发最佳首选框架');
insert into `ebook` (id, name, description) values(3, 'Redis入门教程', '零基础入门Redis开发，企业级应用开发最佳首选框架');