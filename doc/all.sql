drop table if exists `test`;

create table `test` (
    `id` bigint not null comment 'id',
    `username` varchar(50) comment '用户名',
    `password` varchar(50) comment '密码',
    primary key (`id`)
) engine = innodb default charset = utf8mb4 comment = '测试'


drop table if exists `demo`;

create table `demo` (
                        `id` bigint not null comment 'id',
                        `username` varchar(50) comment '用户名',
                        primary key (`id`)
) engine = innodb default charset = utf8mb4 comment = '测试'