# ProjetoCompraEVendaFATESG

Atividades
1. 	Considere o diagrama de classes do domínio da aplicação abaixo:

<img src="https://imageup.me/gvp">

2. 	Faça uma aplicação API REST baseada no diagrama apresentado acima. Essa
aplicação precisa ter as seguintes características:
a. Implementar:
	 i. Camada de domínio:
	    1. Todas as classes listadas no diagrama de classe.
	 ii.	Uma camada de repositório (DAO).
	 iii. Uma camada de serviço.
	 iv. Controller - padrão MVC.
	 v. Adicionar as anotações JPA no modelo de domínio.
b. Utilizar o framework Spring MVC para as requisições REST.
c. Utilizar o banco de dados H2.
d. Utilizar o Spring Data JPA para realizar operações no banco de dados H2.
e. Tratamento de exceções das requisições REST utilizando o Framework
Spring MVC - Global Handler.

3.	f.	Validação dos dados das entidades.
Os seguintes recursos devem ser mapeados:

Método HTTP	Endpoint REST	Descrição
GET	/produtos/{id}	Retorna os detalhes do produto com {id} fornecido
GET	/produtos	Retorna uma lista de produtos
POST	/produtos	Cria um novo produto
PUT	/produtos	Atualiza os detalhes do produto {id} fornecido
DELETE	/produtos/{id}	Exclui um produto por um {id} fornecido
PATCH	/produtos/{id}/categorias	Atualiza as categorias do produto {id} fornecido

Método HTTP	Endpoint REST	Descrição
GET	/categorias/{id}	Retorna os detalhes da categoria com {id} fornecido
GET	/categorias	Retorna uma lista de categorias
POST	/categorias	Cria uma nova categoria
PUT	/categorias	Atualiza os detalhes da categoria {id} fornecido
DELETE	/categorias/{id}	Exclui uma categoria por um {id} fornecido
PATCH	/categorias/{id}/produtos	Atualiza os produtos do categorias {id} fornecido

Método HTTP	Endpoint REST	Descrição
GET	/clientes/{id}	Retorna os detalhes do cliente com {id} fornecido
GET	/clientes	Retorna uma lista de clientes
POST	/clientes	Cria um novo cliente
PUT	/clientes	Atualiza os detalhes do cliente {id} fornecido
DELETE	/clientes/{id}	Exclui um cliente por um {id} fornecido
PATCH	/clientes/{id}/enderecos	Atualiza os endereços do cliente {id} fornecido



