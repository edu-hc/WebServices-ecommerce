# 🛒 E-commerce API

![Java](https://img.shields.io/badge/Java-17-blue)
![SpringBoot](https://img.shields.io/badge/Spring%20Boot-3.0-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue)
![Heroku](https://img.shields.io/badge/Deploy-Heroku-purple)

## 📌 Sobre o Projeto

Esta é uma **API RESTful** para um sistema de e-commerce, desenvolvida com **Spring Boot** e **JPA/Hibernate**. A aplicação permite o gerenciamento de usuários, produtos, pedidos e pagamentos, garantindo uma estrutura robusta e escalável.

## 🛠 Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Hibernate
- PostgreSQL
- Heroku (Deploy)
- Maven

## 🚀 Como Executar o Projeto

### 🔧 Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/)

### 🏃‍♂️ Rodando o Projeto Localmente

1. Clone o repositório

   ```sh
   git clone https://github.com/seu-usuario/ecommerce-api.git
   cd ecommerce-api
2. Configure o banco de dados

No arquivo src/main/resources/application.properties, edite as credenciais do PostgreSQL:



spring.datasource.url=jdbc:postgresql://localhost:5432/seu-banco
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha

3. Execute a aplicação

   ```sh
    mvn spring-boot:run

4. Acesse a API

A API estará disponível em http://localhost:8080.


### 🌍 Deploy no Heroku
O projeto está implantado no Heroku. Para acessar a API em produção:

🔗 https://port-spring-ecommerce-607b1ebdb7b2.herokuapp.com/


