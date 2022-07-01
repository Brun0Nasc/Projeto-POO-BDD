create database transportadora;
use transportadora;

create table caminhoes(

	id_caminhao int primary key auto_increment,
    cod_licenca int unique,
    capacidade double

);
create table viagem(

	id_viagem int primary key auto_increment,
    numero_viagem int unique,
    peso double,
    fk_caminhoes int,
    foreign key (fk_caminhoes) references caminhoes(id_caminhao) on delete cascade

);
create table armazem(

	id_armazem int primary key auto_increment,
    endereco varchar(60) unique,
    numero_caminhoes int,
    capacidade double

);
create table deposito(

	id_deposito int primary key auto_increment,
    capacidade int,
    endereco varchar(60) unique

);
create table remessas(

	id_remessas int primary key auto_increment,
    numero_remessa int unique,
    volume double,
    peso double,
    destino varchar(60),
    fk_armazem int,
    fk_caminhoes int,
    fk_deposito int,
    foreign key(fk_armazem) references armazem(id_armazem) on delete cascade,
    foreign key(fk_caminhoes) references caminhoes(id_caminhao) on delete cascade,
    foreign key(fk_deposito) references deposito(id_deposito) on delete cascade

);
create table viagem_deposito(

	id_viagem_deposito int primary key auto_increment,
    fk_viagem int,
    fk_deposito int,
	foreign key(fk_viagem) references viagem(id_viagem) on delete cascade,
    foreign key(fk_deposito) references deposito(id_deposito) on delete cascade

);
