## How to install Kafka using Docker 
[docker-compose-file-for-single-kafka-broker](https://github.com/iamsurajitmishra/KAFKA-PRODUCER-CONSUMER-SERVICE/blob/master/docker-compose.yml) 

[docker-compose-file-for-multiple-kafka-broker](https://github.com/iamsurajitmishra/KAFKA-PRODUCER-CONSUMER-SERVICE/blob/master/kafka-single-multiple.yml) 
## installation-command


```
Run docker compose command -

* For multiple kafka server-

=> docker-compose -f kafka-single-multiple.yml up -d

* For single kafka server-

=> docker-compose -f docker-compose.yml up -d

```

```
Run kafka -
docker exec -it kafka /bin/sh

```

```
Read kafka events -

cd /bin

kafka-console-consumer.sh --topic kafka_topic1 --from-beginning --bootstrap-server localhost:9092

```

```
Check list of topics for for each kafka server - [we can test if topic replica created]

kafka-topics --list  --bootstrap-server  <external/internal-host>:<external/internal-port>
```
