# Spring Boot 3, MongoDB, Redis

### Spring Boot 3, MVC, MongoDB (_with MongoRepository_), Redis (_for caching_), Docker

_For testing purposes a MongoDB database is created and deployed to the MongoDB cloud.
The **books-db** consists of 2 collections: **books**._

Steps:

1) Run the redis container:

```
docker compose up
```

2) Start the application

**API Documentation**: http://localhost:8080/swagger-ui/index.html#/
