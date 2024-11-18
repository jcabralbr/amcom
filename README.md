# amcom
Projeto que gera OrderDTO a cada dez segundos e coloca numa fila do kafka.
Para executar o projeto, siga os seguintes passos:

1 - execute o comando docker-compose up -d para subir o kafka

2 - start da classe OrderProducerApplication

Projeto que gera OrderDTO a cada dez segundos e coloca numa fila do kafka.

Para executar o projeto, siga os seguintes passos:

1 - execute o comando docker-compose up -d para subir o kafka, no diretório raiz do projeto, onde se encontra
o arquivo docker-compose.yml.

2 - start da classe em OrderProducerApplication

comandos kafka
==============

Comandos para entrar no container docker do Kafka, criar novos tópicos e consumir mensagens nos tópicos.

1) entrar no container: 
kafka-console-consumer --topic purchase_order --bootstrap-server localhost:9092 --from-beginning

2) criar topicos:
kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3 --topic purchase_order
kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3 --topic dlq_duplicate_orders

3) listar topicos:
kafka-console-consumer --topic purchase_order --bootstrap-server localhost:9092 --from-beginning
kafka-console-consumer --topic dlq_duplicate_orders --bootstrap-server localhost:9092 --from-beginning
