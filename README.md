# Tictactoe
Repositório do trabalho final sobre Spring Boot de João Vitor dos Santos - Turma B - 4ºPerído da turma de Engenharia de Software - Professor Elenilton.


Este projeto é uma implementação do clássico jogo da velha, utilizando a arquitetura MVC (Model-View-Controller) com Spring Boot. O projeto também faz uso de outras ferramentas como Postman para testar as APIs REST e PgAdmin4 para gerenciar o banco de dados PostgreSQL.

Estrutura do Projeto O projeto segue a estrutura padrão de um projeto Spring Boot MVC e é dividido em várias pastas principais:

Model: Esta pasta contém as classes de modelo que representam as entidades do banco de dados. No caso deste projeto, temos a classe TictactoeModel que representa um jogo da velha.

View: Como este é um projeto de API REST, não temos uma visualização no sentido tradicional. Em vez disso, os clientes interagem com o aplicativo por meio de endpoints REST.

Controller: A pasta controllers contém a classe TictactoeController que lida com todas as solicitações HTTP e respostas. Ela usa o serviço TictactoeService para realizar operações de negócios.

Service: A pasta service contém a classe TictactoeService que contém a lógica de negócios e interage com o repositório para operações de banco de dados.

Repository: A pasta repositories contém a interface TictactoeRepository que estende a interface JpaRepository do Spring Data JPA para fornecer operações de banco de dados CRUD.

Como Usar - Para usar este projeto, você precisa ter o Java e o Maven instalados em seu sistema. Além disso, você precisará do Postman para testar os endpoints da API e do PgAdmin4 para gerenciar o banco de dados.

Clone o repositório para o seu sistema. Navegue até a pasta do projeto e execute o comando mvn spring-boot:run para iniciar o aplicativo. O aplicativo agora estará rodando na porta 8080. Você pode usar o Postman para enviar solicitações para http://localhost:8080/tictactoe-game. Use o PgAdmin4 para visualizar e gerenciar o banco de dados.

Tecnologias Utilizadas -

Java 17

Spring Boot

Spring Data JPA

PostgreSQL

END POINTS

POST /tictactoe-game

Cria um novo jogo.

GET //tictactoe-game

Mostra a lista de todos jogos salvos.

GET /tictactoe-game/{id}

Mostra um jogo específico de acordo com o ID.

PUT /tictactoe-game/{id}

Atualiza os dados, como nome do jogador e pontuação de um jogo existente.

DELETE /tictactoe-game/{id}

Exclui um jogo específico de acordo com o ID.
