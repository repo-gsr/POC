# Getting Started

### Reference Documentation

* For Running Application 

    * PreRequisites 
       
       jdk 1.8
       maven any version
       
   * To run the application you need run the Application.java this is main class to start the application.
   
   * Application is using in-memory data base.

* In this sample the following apis were there

1)  Creating User alongo with Transaction

  Url :  http://localhost:8081/v1/reward

  Request Body : 

    {
    "userName": "Subbareddy",
    "transactions": [
        {
            "totalAmount": 56
        }
    ]
  }
  
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

 2) Get all the Users With Transaction Details  
 
  URL : http://localhost:8081/v1/reward
  
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

3) Get User Transaction by UserId

   URL :  http://localhost:8081/v1/reward/2
   
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
   
     

