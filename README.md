# Article
1- Insert Role in Role Table ;
    insert into role values(1,"User");
	insert into role values(2,"Admin");
	
	POSTMAN Request
	---------------
2- SIGNUP USER :  http://localhost:8080/api/auth/signup :POST
                   Request Body: {
										"name":"prateek",
										"username":"pks12345",
										"email":"pks12345@gmail.com",
										"role":["user","admin"],
										"password":"12345678",
										"address":"bangalore"

										
								}	
				  Response Body : {User registered successfully}
				  
3- SIGNIN USER :  http://localhost:8080/api/auth/signin	: POST

                   Request Body : {
									  "username":"pks12345",
									  "password":"12345678"
									}		
					Response : {
									"accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwa3MxMjM0NSIsImlhdCI6MTU2MTAxNjk1NiwiZXhwIjoxNTYxMTAzMzU2fQ.uILWIpkkrOwxbQ9tD0Fv4X5k5PLRW-fc4u0gCh3XOahN-8R9Q0aU9P-RxzG4_tG-6TLs0mq0qiia_3ABTjhgyg",
									"tokenType": "Bearer"
								}				
								
4- CREATE ARTICLES : http://localhost:8080/api/auth/articles : POST

                    Request Body : {
										"title":"My 7th Blog",
										"body":"Hey,I am fine!!",
										"author":"Prateek Singh"
									}	
                    With Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwa3MxMjM0NSIsImlhdCI6MTU2MTAxNjk1NiwiZXhwIjoxNTYxMTAzMzU2fQ.uILWIpkkrOwxbQ9tD0Fv4X5k5PLRW-fc4u0gCh3XOahN-8R9Q0aU9P-RxzG4_tG-6TLs0mq0qiia_3ABTjhgyg
									
					Response : 				{Article created successfully!}
					
5- GET ARTICLES : http://localhost:8080/api/auth/articles : GET
                  
				  With Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwa3MxMjM0NSIsImlhdCI6MTU2MTAxNjk1NiwiZXhwIjoxNTYxMTAzMzU2fQ.uILWIpkkrOwxbQ9tD0Fv4X5k5PLRW-fc4u0gCh3XOahN-8R9Q0aU9P-RxzG4_tG-6TLs0mq0qiia_3ABTjhgyg	

                   Response :[
								{
									"articleId": 1,
									"title": "My First Blog",
									"body": "Hello How are You!!",
									"author": "Prateek Singh"
								},
								{
									"articleId": 2,
									"title": "My Second Blog",
									"body": "I am fine and good!!",
									"author": "Prateek Singh 2"
								},
								{
									"articleId": 3,
									"title": "My third Blog",
									"body": "Hey,I am ok!!",
									"author": "Prateek Singh 3"
								},
								{
									"articleId": 4,
									"title": "My 4th Blog",
									"body": "Hey,I am fine!!",
									"author": "Prateek Singh 4"
								},
								{
									"articleId": 5,
									"title": "My 5th Blog",
									"body": "Hey,I am fine!!",
									"author": "Prateek Singh 5"
								},
								{
									"articleId": 6,
									"title": "My 6th Blog",
									"body": "Hey,I am fine!!",
									"author": "Prateek Singh 6"
								},
								{
									"articleId": 7,
									"title": "My 7th Blog",
									"body": "Hey,I am fine!!",
									"author": "Prateek Singh"
								}
							]				  
