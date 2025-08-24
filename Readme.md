## Layered application ##
@SpringBootApplication Annotation has below annotations
1. @EnableAutoConfiguration
	This feature lets spring automatically look for the beans in class path and register them. 
2. @Configuration
	It helps to configure the spring application based on dependencies, propert files, yml files, env vars, 
	and commandline arguments to externalise configuration.
3. @ComponentScan
	This is used to define packages where to look for beans 

---

## Stripe Demo Project ##
StripeProviderController - 
	webhook - end point to accept events/notifications of the payment from stripe-api. 
---