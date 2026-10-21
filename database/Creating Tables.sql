create table patients(
id int auto_increment primary key,
Name varchar(255) Not Null,
Age int  not null,
Gender varchar(19) not null
);

create table DOCTORS(
id int auto_increment primary key,
Name varchar(255) Not Null,
Specialization varchar(255) not null,
Gender varchar(19) not null
);

create table APPOINTMENTS(
Id int auto_increment primary key,
Patient_id INT not null,
Doctor_id int not null,
Appointment_Date date not null,
foreign key (Patient_id) References patients(id),
foreign key (Doctor_id) references doctors(id)
);

show tables;