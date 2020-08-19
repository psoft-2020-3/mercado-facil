# Mercado Fácil
 
Um supermercado da cidade de Campina Grande precisa de um sistema que gerencie o estoque e venda de produtos na sua loja. Neste sistema, o administrador deve obter uma visão geral e o controle sobre o funcionamento do supermercado, por exemplo, ele deve poder adicionar novos produtos, acompanhar quantas unidades do produto estão disponíveis, alterar preços, ser notificado sobre eventos críticos, gerenciar as vendas e oferecer alguns serviços personalizados para o cliente.

## User Stories já implementadas

- Eu, como administrador, gostaria de adicionar um novo produto no sistema,
informando seu nome, código de barra, fabricante, situação, e categoria;
- Eu, como administrador, gostaria de consultar a disponibilidade e o preço de cada
produto do supermercado;
- Eu, como administrador, gostaria de atribuir um preço (R$) a um determinado
produto no sistema;
- Eu, como administrador, gostaria de criar lotes associados aos produtos,
informando a quantidade de itens disponíveis e a data de validade.

## Estrutura básica

- Um projeto: MercadoFacil;
- Um Controller RestApiController que implementa os endpoints da API Rest.
- Dois repositórios são utilizados: ProdutoRepository e LoteRepository, que são responsáveis por manipular as entidades Produto e Lote em um banco de dados em memória;
- O modelo é composto pelas classes Produto.java e Lote.java que podem ser
encontradas no pacote model;
- O pacote exceptions guarda as classes de exceções que podem ser levantadas
dentro do sistema;
- Não há implementação de frontend, mas o projeto fornece uma interface de acesso à API via swagger.

## Tecnologias
Código base gerado via [start.sprint.io](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.3.3.RELEASE&packaging=jar&jvmVersion=1.8&groupId=com.example&artifactId=EstoqueFacil&name=EstoqueFacil&description=Projeto%20Estoque%20Facil&packageName=com.example.EstoqueFacil&dependencies=web,actuator,devtools,data-jpa,h2) com as seguintes dependências:  

- Spring Web
- Spring Actuator
- Spring Boot DevTools
- Spring Data JPA
- H2 Database
