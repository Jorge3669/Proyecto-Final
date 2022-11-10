drop database if exists produc;
create database if not exists productos;
use productos;
create table invent(
    fechaFinal date not null,
    fechaInic date not null,
    idPr int auto_increment not null,
    primary key (cod)
);select*from produc;
create table produc(
	cod int auto_increment not null,
    nombProd varchar(30) unique not null,
    stockInc int not null,
    Compras int not null,
    Ventas int not null,
    total int not null,
    primary key (cod)
    );
    insert into produc (cod, nombProd, stockInc, Compras, ventas, total ) values(1, "Zapatos", 400, 250, 100, 150),(2, "Camisa",650, 300, 125, 175),(3, "Pantalon" ,"500", "160", "60", "100");
    select*from produc;
    select*from invent;