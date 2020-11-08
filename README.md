<h2>Digital Innovation One - person api project for Java Developer Bootcamp</h2>

The project consists of a company REST API for crud operations on the Person entity, the project uses the following technologies:

* Maven
* Spring Boot
* H2 database
* Lombok
* Hibernate
* Mapstruct

The project is available online in https://caiosw-peopleapi-live.herokuapp.com/api/v1/people


To execute the project on the terminal, just type:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:
After that, the following endpoint will be available:

```
http://localhost:8080/api/v1/people
```

To add a new person:
```
POST http://localhost:8080/api/v1/people

Body*:
{
    "firstName": "John",
    "lastName": "Do",
    "cpf": "123.456.789-10",
    "birthDate": "01-01-1995",
    "phones": [
        {
            "type": "MOBILE",
            "number": "(11)98765-4321"
        }
    ]
}
```

To delete a person:
```
DELETE http://localhost:8080/api/v1/people/{id}
```

To update a person:
```
PUT http://localhost:8080/api/v1/people/{id}
Body*:
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "cpf": "123.456.789-10",
    "birthDate": "01-01-1995",
    "phones": [
        {
            "id": 1,
            "type": "HOME",
            "number": "(11)4321-9876"
        }
    ]
}
```

To get a person by id:
```
GET http://localhost:8080/api/v1/people/{id}
```

Get all people:
```
GET http://localhost:8080/api/v1/people/
```

\* => cpf field must be a valid cpf