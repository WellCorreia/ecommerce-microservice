## Estrutura do Projeto

```
payment-api
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
            └───com.wellington.ecommerce.payment
            └───config                            # Configuração do Projeto
            └───listener                          # Escuta de modificação do checkout
            └───streaming                         # Streaming
            └───PaymentApplication.java           # Arquivo principal de execução
        └───resources
            └───avro
                └───CheckoutCreated.avsc          # Aquivo de configuração do avro para o checkout
                └───PaymentCreated.avsc           # Aquivo de configuração do avro para o payment
            └───application.yml                   # Váriaveis de ambiente
            └───bootstrap.yml                     
    └───test
        └───java
            └───com.wellington.ecommerce.payment
                └───PaymentApplicationTests.java    # Teste do arquivo de execução do projeto
└───gitignore
└───build.gradle
└───gradlew
└───gradlew.bat
└───HELP.md
└───README.md
```
