drop table if exists `chapter`;
create table `chapter`(
    `id` char(8) not null comment 'ID',
    `course_id` char(8) comment '课程ID',
    `name` varchar(50) comment '名称',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='大章';

insert into chapter (id, course_id, name) VALUE ('00000001','00000001','测试大章01');
insert into chapter (id, course_id, name) VALUE ('00000002','00000002','测试大章02');
insert into chapter (id, course_id, name) VALUE ('00000003','00000003','测试大章03');
insert into chapter (id, course_id, name) VALUE ('00000004','00000004','测试大章04');
insert into chapter (id, course_id, name) VALUE ('00000005','00000005','测试大章05');
insert into chapter (id, course_id, name) VALUE ('00000006','00000006','测试大章06');
insert into chapter (id, course_id, name) VALUE ('00000007','00000007','测试大章07');
insert into chapter (id, course_id, name) VALUE ('00000008','00000008','测试大章08');
insert into chapter (id, course_id, name) VALUE ('00000009','00000009','测试大章09');
insert into chapter (id, course_id, name) VALUE ('00000010','00000010','测试大章10');
insert into chapter (id, course_id, name) VALUE ('00000011','00000011','测试大章11');
insert into chapter (id, course_id, name) VALUE ('00000012','00000012','测试大章12');
insert into chapter (id, course_id, name) VALUE ('00000013','00000013','测试大章13');
insert into chapter (id, course_id, name) VALUE ('00000014','00000014','测试大章14');
insert into chapter (id, course_id, name) VALUE ('00000015','00000015','测试大章15');
insert into chapter (id, course_id, name) VALUE ('00000016','00000016','测试大章16');