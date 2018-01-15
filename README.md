# voos
Sistema para listar Voos
# Atech Voos - API e Frontend

Sistema de informação de voos.
Backend desenvolvido em Java e Frontend desenvolvido em AngularJS.

# Tecnologias e Requisitos

- Java 1.8
- AngularJS
- Bootstrap
- Spring Boot 1.5
- Maven 3.5.0
- JPA
- H2
- JUnit

# Documentação

As telas (frontend) podem ser visualizadas em:

- Lista: [http://localhost:8080/#/voo](http://localhost:8080/#/voo)
- Detalhes: [http://localhost:8080/#/voo/{id}](http://localhost:8080/#/voo/{id})

# API

*Lista*

- *GET* [http://localhost:8080/api/voos](http://localhost:8080/api/voos)
- *Accept:* application/json
- *Content-Type:* application/json

*Resultado:*
{content:[{id:1,numero:0093,horarioSaida:06:45:00,horarioChegada:10:45:00,cidadeOrigem:{id:2,nome:Sao Paulo,sigla:SP},cidadeDestino:{id:5,nome:Belo Horizonte,sigla:BH},aeronave:{id:2,nome:Airbus A300,identificador:null},piloto:{id:5,nome:Joao Ribeiro de Barros,identificador:JRB},status:{id:3,nome:Atrasado,sigla:AT}},{id:2,numero:7656,horarioSaida:16:30:00,horarioChegada:18:30:00,cidadeOrigem:{id:2,nome:Sao Paulo,sigla:SP},cidadeDestino:{id:9,nome:Porto Alegre,sigla:RS},aeronave:{id:4,nome:Boeing 757,identificador:null},piloto:{id:6,nome:Ricardo Kirk,identificador:RK},status:{id:1,nome:Decolado,sigla:DC}},{id:3,numero:1582,horarioSaida:06:10:00,horarioChegada:09:35:00,cidadeOrigem:{id:2,nome:Sao Paulo,sigla:SP},cidadeDestino:{id:4,nome:Salvador,sigla:SA},aeronave:{id:5,nome:Embraer ERJ-190,identificador:null},piloto:{id:4,nome:Gabriel Voisin,identificador:GV},status:{id:2,nome:Partindo,sigla:PT}},{id:4,numero:6424,horarioSaida:10:25:00,horarioChegada:14:35:00,cidadeOrigem:{id:2,nome:Sao Paulo,sigla:SP},cidadeDestino:{id:6,nome:Natal,sigla:RN},aeronave:{id:1,nome:Airbus A320,identificador:null},piloto:{id:8,nome:Jose Costa,identificador:JC},status:{id:2,nome:Partindo,sigla:PT}},{id:5,numero:2897,horarioSaida:06:45:00,horarioChegada:10:35:00,cidadeOrigem:{id:2,nome:Sao Paulo,sigla:SP},cidadeDestino:{id:3,nome:Rio de Janeiro,sigla:RJ},aeronave:{id:8,nome:Boeing 767,identificador:null},piloto:{id:3,nome:Doru Davidovici,identificador:DD},status:{id:1,nome:Decolado,sigla:DC}},{id:6,numero:3456,horarioSaida:07:30:00,horarioChegada:07:50:00,cidadeOrigem:{id:2,nome:Sao Paulo,sigla:SP},cidadeDestino:{id:1,nome:Brasilia,sigla:DF},aeronave:{id:3,nome:Boeing 707,identificador:null},piloto:{id:2,nome:Steve Harris,identificador:SH},status:{id:1,nome:Decolado,sigla:DC}}],last:true,totalPages:1,totalElements:6,size:20,number:0,sort:null,numberOfElements:6,first:true}


*Detalhes*

- **GET** [http://localhost:8080/api/voos/{id}](http://localhost:8080/api/voos/{id})
- **Accept:** application/json
- **Content-Type:** application/json

*Resultado:*
{id:1,numero:0093,horarioSaida:06:45:00,horarioChegada:10:45:00,cidadeOrigem:{id:2,nome:Sao Paulo,sigla:SP},cidadeDestino:{id:5,nome:Belo Horizonte,sigla:BH},aeronave:{id:2,nome:Airbus A300,identificador:null},piloto:{id:5,nome:Joao Ribeiro de Barros,identificador:JRB},status:{id:3,nome:Atrasado,sigla:AT}}

# Listar voos

O Sistema exibe a lista de todos os voos cadastrados,pode-se filtrar pela Cidade de Origem, Cidade Destino, Status.

Ao clicar em detalhes, exibe mais informações sobre o voo selecionado.

