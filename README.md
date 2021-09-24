# spring-boot-kafka-demo
 Demo with Kafka producer and cosumer in Spring Boot. Convert messages from POJOs to JSON and vice versa.
 
### Structure:

A HTTP request can be send to following endpoints:

- api/kafka/car/{name}/{brand}
- api/kafka/film/{name}/{releaseYear}

After receiving a request via WebMVC it gets forwarded to the Kafka topic.
There is an listener active which checks if a new message is comming to the topics.