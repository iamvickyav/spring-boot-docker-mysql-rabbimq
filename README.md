# SpringBoot App with MySQL RabbitMQ using Docker

In this sample application, I have used Docker to setup RabbitMQ & MySQL database. You can find the docker-compose.yml file below

[docker-compose.yml File for MySQL & RabbitMQ](https://github.com/iamvickyav/SpringBoot_Docker_MySQL_RabbitMQ/blob/master/src/main/docker/docker-compose.yml "Docker File for MySQL & RabbitMQ")

When application starts, [SpringBoot CommandLineRunner](https://github.com/iamvickyav/SpringBoot_Docker_MySQL_RabbitMQ/blob/master/src/main/java/com/iamvickyav/sbootdocker/rabbit/RabbitRunner.java) will post an [Order](https://github.com/iamvickyav/SpringBoot_Docker_MySQL_RabbitMQ/blob/master/src/main/java/com/iamvickyav/sbootdocker/db/Order.java) in RabbitMQ. 

For sample purpose, I have kept both RabbitMQ sender & receiver in this same application.

[RabbitMQ Receiver](https://github.com/iamvickyav/SpringBoot_Docker_MySQL_RabbitMQ/blob/master/src/main/java/com/iamvickyav/sbootdocker/rabbit/RabbitReceiver.java) class will read the Order object from Queue & insert the Order details in MySQL table
