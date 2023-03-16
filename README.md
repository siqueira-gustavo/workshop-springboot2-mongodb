# Workshop Spring Boot MongoDB

Este é um projeto de workshop sobre Spring Boot e MongoDB criado pelo professor Nelio Alves no curso de Java da Udemy.

## Sobre o projeto

O projeto consiste em uma API RESTful que permite realizar operações CRUD (Create, Read, Update e Delete) em uma coleção de posts e seus comentários. O projeto usa o Spring Boot como framework web e o MongoDB como banco de dados NoSQL.

## Como executar o projeto

Para executar o projeto localmente, você precisa ter instalado:

- Java 8 ou superior
- Maven 3.6.3 ou superior
- MongoDB 4.4 ou superior

Depois de clonar o repositório, você pode executar os seguintes comandos na raiz do projeto:

## Para compilar e empacotar o projeto

```bash
mvn clean package
```

## Para executar o projeto

```bash
java -jar target/workshop-springboot2-mongodb-0.0.1-SNAPSHOT.jar
```

Ou se preferir, você pode usar sua IDE favorita para importar e executar o projeto como uma aplicação Spring Boot.

## Como testar o projeto

O projeto expõe uma série de endpoints REST que podem ser testados usando ferramentas como Postman ou Insomnia. Os endpoints disponíveis são:

- GET /posts : Retorna todos os posts cadastrados no banco de dados
- GET /posts/{id} : Retorna um post pelo seu id
- POST /posts : Cria um novo post no banco de dados
- PUT /posts/{id} : Atualiza um post existente pelo seu id
- DELETE /posts/{id} : Deleta um post existente pelo seu id
- GET /posts/titlesearch?text={text} : Retorna todos os posts que contêm um texto no título
- GET /posts/fullsearch?text={text}&minDate={minDate}&maxDate={maxDate} : Retorna todos os posts que satisfazem uma busca por texto no título ou corpo do post e por intervalo de datas

Os parâmetros text, minDate e maxDate são opcionais.

Os dados enviados e recebidos pelos endpoints devem estar no formato JSON (JavaScript Object Notation). Um exemplo de JSON válido para criar ou atualizar um post é:

```json
{
  "date": "2021-10-01T12:00:00Z",
  "title": "Meu primeiro post",
  "body": "Este é o meu primeiro post usando Spring Boot e MongoDB",
  "author": {
    "id": "6156a7f9c8d5c34f8a9b7d5f",
    "name": "Gustavo Siqueira"
  }
}
```

Um exemplo de JSON válido para criar ou atualizar um comentário em um post é:

```json
{
  "date": "2021-10-02T10:00:00Z",
  "text": "Parabéns pelo post!",
  "author": {
    "id": "6156a7fac8d5c34f8a9b7d60",
    "name": "Maria Silva"
  }
}
```

## Como contribuir para o projeto

Se você quiser contribuir para este projeto, seja corrigindo bugs, adicionando novas funcionalidades ou melhorando a documentação, você pode seguir os seguintes passos:

1. Faça um fork deste repositório em <https://github.com/siqueira-gustavo/workshop-springboot2-mongodb>
1. Crie uma branch com o nome da sua funcionalidade ou correção (por exemplo, feature/nova-funcionalidade ou fix/bug-corrigido).
1. Faça as alterações necessárias no código e nos testes.
1. Faça um commit e push das suas alterações para a sua branch.
1. Abra um pull request para a branch master do repositório original.
1. Aguarde a revisão do seu pull request e responda aos comentários se necessário.
1. Se o seu pull request for aceito, ele será mesclado na branch master do repositório original.

Obrigado pela sua colaboração!
