select * from caminhoes;

select * from viagem;

select * from deposito;

select * from viagem_deposito;

insert into viagem (numero_viagem, peso, volume, fk_caminhoes) values(123, 112, 20, 1);

insert into viagem_deposito (fk_viagem, fk_deposito) values(1, 2);

insert into deposito (capacidade, endereco) values (225, 'Rua Xerxenhe, 77, Bairro Pripri');

select c.id_caminhao, c.cod_licenca, v.numero_viagem, v.peso, d.endereco 
from caminhoes as c 
inner join viagem as v on v.fk_caminhoes = c.id_caminhao 
inner join viagem_deposito as vd on vd.fk_viagem = v.id_viagem 
inner join deposito as d on d.id_deposito = vd.fk_deposito
where v.id_viagem = 1
