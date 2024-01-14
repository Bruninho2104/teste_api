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

- #### [`Validar envio de requisição completa`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L18)
- #### [`Validar requisição sem enviar nenhum campo.`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L40)
- #### [`Validar requisição com campo "name" em branco`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L57)
- #### [`Validar se campo "name" aceita números`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L79)
- #### [`Validar o envio da requisição sem campo "name"`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L101)
- #### [`Validar requisição com campo "job" em branco`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L121)
- #### [`Validar se campo "job" aceita números`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L143)
- #### [`Validar o envio da requisição sem campo "job"`](https://github.com/Bruninho2104/teste_api/blob/main/src/test/java/teste/api/ValidarMetodoPost.java#L165)
