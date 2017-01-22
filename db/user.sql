update user set host='localhost' where host='123...'

create user itcast identified by '1234'

grant all on *.* to 'itcast'@'%' with grant option

net start mysql
net stop mysql



VBoxManage modifyhd D:\centos64\win7.vdi --resize 102400

加一列并设置成外键
alter table orders(表名) add constraint foreign key (customer_id) references customers(id);

