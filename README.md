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

*Detalhes*

- **GET** [http://localhost:8080/api/voos/{id}](http://localhost:8080/api/voos/{id})
- **Accept:** application/json
- **Content-Type:** application/json

# Listar voos

O Sistema exibe a lista de todos os voos cadastrados,pode-se filtrar pela Cidade de Origem, Cidade Destino, Status.

Ao clicar em detalhes, exibe mais informações sobre o voo selecionado.

