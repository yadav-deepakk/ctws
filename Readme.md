## Diagrams

<caption>
Payment Integration System Block Diagram
<img alt="Payment Integration System" src = "./resources/md-res/images/payment-integration-system.png"/>
</caption>

<caption> Stripe PSP Sequence Diagram
<img alt="Squence Diagram" src = "./resources/md-res/images/stripe-psp-sequence.png"/>
</caption>

### Flow Explaination
1. Merchant system first sends the `order-information` to the payment integration system. This order related information will be used for further processing.
2. Payment Integration System will first `validate` the order info and saves the state information into the databse(processing) later based on provider chosen (stripe here) the reques will be send to stripe for `create-checkout-session`.
3. The Stripe provider gives the json after `checkout session creation`, this checkout session payload will have many fields out of which 2 are important fields `payment-url` and the `create-checkout-session-id`. If success fails then error code and error message will be returned.
4. same details will be transfered to the merchant system which will have two information out of all available - id and url where payment needs to be done.
5. Merchant system will be redirected to a stripe hosted page and there payment will be done.
6. on this page the payment related information will be captured by the stripe system for processing at their end.
7. when the payment succeeds two things happens -
    - Merchant will be redirected to success url and this url will notify the payment integration system about the success.
    - A webhook will be responsible to have events that will be received by the payment system and further fulfilment will start.

## Microservice Architecture
<details>
    <summary>Validation Service</summary>
</details>

<details>
    <summary>Core-Processing Service</summary>
</details>

<details>
    <summary>Stripe-Provider Service</summary>
<br />
service that will integrate with stripe apis and provide payment functionalities

| Method | endpoint                  |  RequestBody           |  RequestParams      |
|--------|---------------------------|------------------------|---------------------|
| POST   | /api/v1/payment           |CreatePaymentRequest    |nil                  |
| GET    | /api/v1/payment           |nil                     |ref                  |
| POST   | /api/v1/payment/expire    |nil                     |ref                  |

</details>

<details>
    <summary>mysql database</summary>
</details>

## Useful Links:
- [Stripe Checkout Session](https://docs.stripe.com/payments/checkout/how-checkout-works)
- [Stripe APIs](https://docs.stripe.com/api)

