## Estrutura do Projeto

```
checkout-api
└───gradle
└───docker
    │
    └───kafka
      │
      └───kafkainit-topics.sh                   # Scripts do kafka
    └───docker-compose.yml                      # Arquivo com as dependencias para os contairnes do docker
└───src
    │   
    └───main
        └───java
            └───com.wellington.ecommerce.checkout
            └───config                            # Configuração do Projeto
            └───resource                          # Controllers do Projeto
            └───entity                            # Entidades/Classes/Model do projeto
            └───repository                        # Repository
            └───service                           # Services
            └───CheckoutApplication.java          # Arquivo principal de execução
        └───resources
            └───avro
                └───CheckoutCreated.avsc          # Arquivo de configuração do avro checkout
                └───PaymentCreated.avsc           # Arquivo de configuração do avro payment
            └───application.yml                     # Váriaveis de ambiente
            └───bootstrap.yml                     
    └───test
        └───java
            └───com.wellington.ecommerce.checkout
                └───CheckoutApplicationTests.java    # Teste do arquivo de execução do projeto
└───gitignore
└───build.gradle
└───gradlew
└───gradlew.bat
└───HELP.md
└───README.md
```

## Docker
  No arquivo `docker-compose.yml` está toda a configuração para utilizar o banco de dados postgres, o zookeeper, o kafka e o schema-registry.
### RUN
  Para utilizar é necessário ter o docker intalado e depois executar o comando para iniciar os containers:
 `docker-compose up --build -d`
 
 para fazer o down é necessário executar:
 `docker-compose down`
 
 ## Database
 Com o banco de dados ativo, é necessário executar o seguinte escript de criação de tabela:
 ```
 create table checkout_entity
(
    id     serial not null
        constraint checkout_entity_pk
            primary key,
    code   varchar,
    status varchar
);
 ```
