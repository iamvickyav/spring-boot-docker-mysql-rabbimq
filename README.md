# SpringBoot App with MySQL RabbitMQ using Docker

In this sample application, I have used Docker to setup RabbitMQ & MySQL database. You can find the docker-compose.yml file below

[docker-compose.yml File for MySQL & RabbitMQ](https://github.com/iamvickyav/SpringBoot_Docker_MySQL_RabbitMQ/blob/master/src/main/docker/docker-compose.yml "Docker File for MySQL & RabbitMQ")

When application starts, SpringBoot CommandLineRunner will post an Order event in RabbitMQ. For sample purpose, we have both RabbitMQ sender & receiver configured in this same application.

RabbitMQ Receiver class will read the Order object from Queue & insert the Order details in MySQL table
