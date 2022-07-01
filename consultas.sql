select * from caminhoes;

select * from viagem;

select * from deposito;

select * from viagem_deposito;


/*Consulta para saber as viagens de um caminhão, usando ID de caminhão
como parâmetro para a pesquisa*/

select c.id_caminhao, c.cod_licenca, v.numero_viagem, v.peso, d.endereco 
from caminhoes as c 
inner join viagem as v on v.fk_caminhoes = c.id_caminhao 
inner join viagem_deposito as vd on vd.fk_viagem = v.id_viagem 
inner join deposito as d on d.id_deposito = vd.fk_deposito
where v.id_viagem = 1;
