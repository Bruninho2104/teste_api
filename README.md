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

- #### `Validar envio de requisição completa`
- #### `Validar requisição sem enviar nenhum campo.`
- #### `Validar requisição com campo "name" em branco`
- #### `Validar se campo "name" aceita números`
- #### `Validar o envio da requisição sem campo "name"`
- #### `Validar requisição com campo "job" em branco`
- #### `Validar se campo "job" aceita números`
- #### `Validar o envio da requisição sem campo "job"`
