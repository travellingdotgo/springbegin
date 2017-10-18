

remote mysql config for MyBatis:

- - - - - - - - 建库 - - - - - - - - - - 
mysql> CREATE DATABASE dbspringbegin;
mysql> show databases;
mysql> use dbspringbegin;

- - - - - - - - 建表 - - - - - - - - - - 
mysql> 

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
`id` int(11) unsigned NOT NULL AUTO_INCREMENT,
`first_name` varchar(11) DEFAULT NULL,
`last_name` varchar(11) DEFAULT NULL,
`username` varchar(11) DEFAULT NULL,
`created` datetime DEFAULT NULL,
`updated` datetime DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

LOCK TABLES `user` WRITE;

INSERT INTO `user` (`id`, `first_name`, `last_name`, `username`, `created`, `updated`)
VALUES
(1,'DAMITH','GANEGODA','test','2017-02-22 00:00:00','2017-02-22 00:00:00');


- - - - - - - - 数据库状态检测 - - - - - - - - - - 
bandwagonhost_mysql.exp
#!/usr/bin/expect -f

set IPADDR 	172.93.47.138
set USER 	root
set PORT	3306
set PASSWORD	dxygcbddmmb
set timeout 	300
spawn mysql -h 172.93.47.138 -u root -p -P $PORT
expect {
    "*yes/no" { send "yes\r"; exp_continue}
    "*assword:" { send "$PASSWORD\r" }
}

interact


- - - - - - - - loombok - - - - - - - - - - 
@Data 标签，生成getter/setter toString()等方法 
@NonNull : 让你不在担忧并且爱上NullPointerException 
@CleanUp : 自动资源管理：不用再在finally中添加资源的close方法 
@Setter/@Getter : 自动生成set和get方法 
@ToString : 自动生成toString方法 
@EqualsAndHashcode : 从对象的字段中生成hashCode和equals的实现 
@NoArgsConstructor/@RequiredArgsConstructor/@AllArgsConstructor 
自动生成构造方法 
@Data : 自动生成set/get方法，toString方法，equals方法，hashCode方法，不带参数的构造方法 
@Value : 用于注解final类 
@Builder : 产生复杂的构建器api类 
@SneakyThrows : 异常处理（谨慎使用） 
@Synchronized : 同步方法安全的转化 
@Getter(lazy=true) : 
@Log : 支持各种logger对象，使用时用对应的注解，如：@Log4j