

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