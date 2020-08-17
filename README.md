# Estoque Fácil
 
Um supermercado da cidade de Campina Grande precisa de um sistema que gerencie o estoque de produtos vendidos na sua loja. Neste sistema, o
administrador deve obter uma visão geral e o controle sobre o funcionamento do supermercado, por exemplo, ele deve poder adicionar novos produtos, acompanhar
quantas unidades do produto estão disponíveis, alterar preços, ser notificado sobre eventos críticos, gerenciar as vendas e oferecer alguns serviços personalizados
para o cliente.

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

- Um projeto: EstoqueFacil;
- Um Controller RestApiController que implementa os endpoints da API Rest.
- Dois serviços são utilizados: ProdutoService e LoteService, cujas implementações
armazenam todos os objetos cadastrados em listas;
- O modelo é composto pelas classes Produto.java e Lote.java que podem ser
encontradas no pacote model;
- O pacote exceptions guarda as classes de exceções que podem ser levantadas
dentro do sistema;
- O frontend é implementado utilizando o framework Angular JS, e sua
implementação está no diretório src/main/webapp do projeto.
 
