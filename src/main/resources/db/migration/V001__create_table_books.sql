create table books (
id serial primary key,
enabled bool not null,
isbn varchar(20) not null,
authors varchar(100) not null,
title varchar(100) not null,
year int
);
