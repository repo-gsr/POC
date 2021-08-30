# Getting Started

### Reference Documentation

* For Running Application 

    * PreRequisites 
       
       jdk 1.8
       maven any version
       
   * To run the application you need run the Application.java this is main class to start the application.
   
   * Application is using in-memory data base.

* In this sample the following apis were there

1)  Creating Payment Plan by passing some request Body

  Url :  http://localhost:8081/v1/reward

  Request Body : 

    {
    	"totalAmount": 120
    }
  
  Response :   
  
     {
		"transactionId": 2,
		"totalAmount": 120.0,
		"rewardPoints": 96
     }

 2) Get all the PaymentPlan Details  
 
  URL : http://localhost:8081/v1/reward
  
  Response :
  
  [
     {
		"transactionId": 2,
		"totalAmount": 120.0,
		"rewardPoints": 96
     }
  ]
   
     

