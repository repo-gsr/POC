# Getting Started
## Reference Documentation

This is sample application which has some api to add users along with the transactions related to that user.

### Scenario : 

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

 

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

## Features

- User able to create the new user along with transactions.
- User able to get the all Users information alongo with transactions details with reward Points.
- User able to get User by Id.

## Tech Skils Used

This App uses all OpenSource Technologies:

- [Java 1.8 ] - Java 1.8.
- [Maven] - Maven as a Build Tool.
- [Spring Boot] - Spring boot Framework.
- [H2-DataBase] - Used In-Memory DataBase.
- [Hibernate] - Hibernate as a Persistence.

## How to run Application

Used Maven As a Build Tool do the following steps.

```sh
cd AppFolder
mvn clean install
mvn spring-boot:run
```

## Use Postman to hit api's

1. Post Api(to create the user alongo with transaction)
   
    Url :  http://localhost:8081/v1/reward 

```sh
   Request Body : 

    {
    "userName": "Subbareddy",
    "transactions": [
        {
            "totalAmount": 56
        }
      ]
     }
```
```sh
  Response :   
  
     {
    "userId": 1,
    "userName": "Subbareddy",
    "transaction": [
        {
            "transactionId": 4,
            "totalAmount": 56.0,
            "rewardPoints": 6
        }
    ]
}
```

2. Get all the Users With Transaction Details

    Url : URL : http://localhost:8081/v1/reward
    
```sh
Response :
  
  [
    {
        "userId": 1,
        "userName": "Subbareddy",
        "transaction": [
            {
                "transactionId": 1,
                "totalAmount": 56.0,
                "rewardPoints": 6
            }
        ]
    },
    {
        "userId": 2,
        "userName": "Subbareddy",
        "transaction": [
            {
                "transactionId": 2,
                "totalAmount": 56.0,
                "rewardPoints": 6
            }
        ]
    },
    {
        "userId": 3,
        "userName": "Subbareddy",
        "transaction": [
            {
                "transactionId": 3,
                "totalAmount": 56.0,
                "rewardPoints": 6
            }
        ]
    }
]
```
3. Get User Transaction and reward points by UserId
 
    Url : http://localhost:8081/v1/reward/2

```sh
Response :
   
   {
    "userId": 2,
    "userName": "Subbareddy",
    "transaction": [
        {
            "transactionId": 2,
            "totalAmount": 56.0,
            "rewardPoints": 6
        }
    ]
}  
```    