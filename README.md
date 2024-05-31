## How to install Kafka using Docker 
[docker-compose-file](https://github.com/iamsurajitmishra/KAFKA-PRODUCER-CONSUMER-SERVICE/blob/master/docker-compose.yml) 

## installation-command


```
Run docker compose command -
docker-compose -f docker-compose.yml up -d

```

```
Run kafka -
docker exec -it kafka /bin/sh
cd opt
ls
```

```
Read kafka events -
cd opt
cd /opt/kafka_2.13-2.8.1/bin
kafka-console-consumer.sh --topic kafka_topic1 --from-beginning --bootstrap-server localhost:9092

```
