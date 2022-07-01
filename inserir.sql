/*Insert de dados nas tabelas*/
insert into armazem(endereco, numero_caminhoes, capacidade) values('Rua dos Bobos, 0', 75, 120.7), ('Rua dos Gato, 73', 70, 125.2);
insert into caminhoes(cod_licenca, capacidade) values(127845, 11.5),(127847, 12),(127846, 10),(127848, 9.5);
insert into deposito(capacidade, endereco) values(125, 'Rua dos Legais, 7'), (125, 'Rua dos Feios, 95'), (125, 'Rua Bruno, 20'), (125, 'Travessa das Flores, 456');
insert into viagem(numero_viagem, peso, fk_caminhoes) values(789, 11, 1), (790, 11.5, 2), (791, 11.5, 2), (792, 5.7, 1), (792, 8, 3);
insert into viagem_deposito(fk_viagem, fk_deposito) values(1,2),(2,2),(3,1),(4,3),(5,1);
