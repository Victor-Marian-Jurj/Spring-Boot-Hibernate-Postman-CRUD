create table books (
id serial primary key,
enabled bool not null,
isbn varchar(20) not null,
authors varchar(100) not null,
title varchar(100) not null,
year int
);

INSERT INTO public.books(enabled, isbn, authors, title, year)
	VALUES (true, '978-025489','Robert C. Martin', 'Clean Code', 2008);
	
INSERT INTO public.books(enabled, isbn, authors, title, year)
	VALUES (true, '978-059988','Robert C. Martin', 'Clean Architecture', 2017);
	
		
INSERT INTO public.books(enabled, isbn, authors, title, year)
	VALUES (true, '978-116688','Martin Fowler', 'Refactoring: Improving the Design of Existing Code (2nd Edition)', 2018);
	

select * from books;
	