
# Nome do Projeto
<h1 align="center">Ficticius Clean</h1>



## Descrição do Projeto
<p align="center">Criar uma API para realizar o cálculo de previsão de gastos, retornando uma lista ranqueada dos veículos da empresa levando em consideração o valor gasto com combustível</p>


### Features

- [x] Cadastro de veiculos
- [x] Calculo de combustivel
- [x] Calculo de total gasto com combustível


### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

[Git](https://git-scm.com), [Docker](https://www.docker.com/products/docker-desktop).
Além disto é bom ter um editor para trabalhar com o código como [intellij idea community](https://www.jetbrains.com/pt-br/idea/download/#section=windows).



### Rodando o Back End (servidor)

```bash
# Clone este repositório
$ git clone <https://github.com/mauriciolsr28/FicticiusClean.git>


# Acesse a pasta do projeto no terminal/cmd

- pelo terminal da IDE/Windows abra a pasta resource e execute o comando abaixo:
- docker compose up -d
- docker-compose up -d

-docker ps -----verificar funcionamento do serviço
 
 Acessar no navegador 
 1. http://localhost:16543/
 2. login e senha
	2.1 user: ficticius@mock.com
	2.2 pass:ficticius@dmin
	
	
 Config no PgAdmin 
 
	1.0 criar um server
		1.1 General > name > "postgres-ficticius"
		1.2.1 Connection > Host Name > "postgres-ficticius"
		1.2.2 Connection > Port > "5432"
		1.2.3 Connection > Maintence DB > "ficticius_clean"
		1.2.4 Connection > Username > "ficticius_clean_adm"
		1.2.5 Connection > Password > "ficticius@dmin"
	
	2.0 Confirmar "SAVE"
	
 Expandir no PgAdmin
	1.0 Servers > Postgres-ficticius > Databases > ficticius_clean
		1.1 Clicar com botão direto do mouse em "Schemas" e selecionar "Query Tool"


Criar uma tabela
	1. rodar script
	
	CREATE TABLE IF NOT EXISTS cars (
	id serial PRIMARY KEY,
	name VARCHAR (80) NOT NULL,
	brand VARCHAR (80) NOT NULL,
	model VARCHAR (80) NOT NULL,
    manufacturing_date VARCHAR (4) NOT NULL,
	city_consumption FLOAT NOT NULL,
	highway_consumption FLOAT NOT NULL
);


****Em anexo no projeto segue o import para testar atraves do postman*****
Ficticius Clean.postman_collection.json

### Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

	-Java 11
	-SpringBoot
	-Spring JPA
	-Spring Web
	-PostgreSQL
	-Docker
	