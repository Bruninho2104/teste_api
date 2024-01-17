# teste_api

Este projeto visa desenvolver uma automação de API do site [regres.in](https://reqres.in/) utilizando o RestAssured.

## 🛠️ Ferramentas utilizadas
Para desenvolver esse projeto, utilizei:
- Eclipse IDE
- RestAssured
- JUnit
- Json-Simple

E como linguagem de programação utilizei o JAVA em um projeto Maven para facilitar no gerenciamento das dependências do projeto.

# Casos de teste
No [arquivo de testes](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java) há os seguintes casos de testes automatizados para o endpoint `CREATE` do site [regres.in](https://reqres.in/):

- #### [`Validar envio de requisição completa`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L20)
- #### [`Validar requisição sem enviar nenhum campo.`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L42)
- #### [`Validar requisição com campo "name" em branco`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L59)
- #### [`Validar se campo "name" aceita números`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L81)
- #### [`Validar o envio da requisição sem campo "name"`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L103)
- #### [`Validar requisição com campo "job" em branco`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L123)
- #### [`Validar se campo "job" aceita números`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L145)
- #### [`Validar o envio da requisição sem campo "job"`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L167)
- #### [`Validar requisição com estrutura errada`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L187)
- #### [`Validar o status code`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L205)
- #### [`Validar o contrato da API`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L224)
