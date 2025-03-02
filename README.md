# springboot-resilience4j

Testing order service 
http://localhost:9191/orders

http://localhost:9191/orders/electronics

UserService

http://localhost:9292/user-service/displayOrders?category

Testing the circuitbreaker methods is working fine or not 
1.Stop the catalog service.
2.hit this ur http://localhost:9292/user-service/displayOrders?category
3.Then check http://localhost:9292/actuator/health  it should count increase for this failedCalls=1 or 2 or 3