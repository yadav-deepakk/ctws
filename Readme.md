## Layered application ##
# @SpringBootApplication Annotation has below annotations #
1. @EnableAutoConfiguration:
	This feature lets spring automatically look for the beans in class path and register them. 
2. @Configuration:
	It helps to configure the spring application based on dependencies, propert files, yml files, env vars, 
	and commandline arguments to externalise configuration.
3. @ComponentScan:
	This is used to define packages where to look for beans 

There are several layers in a spring boot application to keep project loosely coupled. 
1. DTOs - used to create pojo classes to exchanage the data with upstream and downstream. 
2. Controllers - Controller is used to write all exposed end points for communication over http. 
3. Exceptions - has global exceptions that might occur during request processing. 
3. Service - Service layer will have all application/bussiness/transactions logic code 
4. DAOs/Repository - interfaces that extends the crudRepo/JpaRepository to perform db operations. 
5. Entities - classes that creates a mapping into database. 
6. Configurations - this will have all classes with @configuration which has all beans 
---

## Stripe Demo Project ##
# Stripe CLI commands #
1. for logging into the CLI dashboard use below command. 
```bash
strip login
```

2. to start listening to the server events use blelow command. 
```bash
strip listen
```

3. to enable port forwarding and sending event to local enpoint created in stripecontroller use below command.
```bash
strip listen forward-to localhost:4242/webhook
```

StripeProviderController
1. api/v1/webhooks : end point to accept events/notifications of the payment from stripe-api. 
---