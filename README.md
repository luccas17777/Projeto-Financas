# API Mensais 


# Sobre o projeto

Este projeto, API mensais, é um projeto API Restful com springboot, construido para a avaliação final da trilha de Java da IBM, mais especificamente da conta do ITAÚ.

A aplicação consiste em ler, salvar e apresentar dados das expectativas de mercado para os principais indicadores macroeconômicos do catálogo de dados abertos do sistema financeiro nacional (DASFN) 
do Banco Central do Brasil. 
 
Fonte de dados: 
https://dadosabertos.bcb.gov.br/dataset/expectativas-mercado 
Documentação API: 
https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/documentacao 
Documentação Swagger: 
https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/swagger-ui3#/ 
Self-service API: 
https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/aplicacao#!/recursos/Ex
pectativaMercadoMensais 

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Banco de dados: MySQL Workbenck

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

End-points da minha api

Get
Get dados da API
/financas

Get dados do Banco de Dados
/financas/getAll

Get dados pelo ID
/financas/id/{id}

Get dados pela data de referencia
/financas/dataReferencia

Post
Salvar dados da Api
/financas/salvarAPI

Salvar novos dados no banco
/financas/salvar
Body: Json exmplo:
```
[
{
"numeroRespondentes": 1,
	"baseCalculo": 0,
	"Indicador": "Testando novamente",
	"Data": "2022-12-02",
	"DataReferencia": "05/2022",
	"Media": 0.3,
	"Mediana": 0.3,
	"DesvioPadrao": 0.9,
	"Minimo": 0.1,
	"Maximo": 0.7
}
]
```

Put
Atualizar Finança
/financas/atualizar/id/{id}
Body: Json exemplo:
```
{
"numeroRespondentes": 1,
	"baseCalculo": 0,
	"Indicador": "Testando retorno de update definitivo",
	"Data": "2022-12-02",
	"DataReferencia": "05/2022",
	"Media": 0.3,
	"Mediana": 0.3,
	"DesvioPadrao": 0.9,
	"Minimo": 0.1,
	"Maximo": 0.7
}
```

Delete
Deletar pelo ID
/financas/delete/{id}


# Autor

Luccas Eduardo Louzada de Morais / luccas.eduardo@ibm.com

https://www.linkedin.com/in/luccas-eduardo/

