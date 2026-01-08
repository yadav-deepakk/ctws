## Diagrams

<caption>
Payment Integration System Block Diagram
<img alt="Payment Integration System" src = "./res/md-res/images/payment-integration-system.png"/>
</caption>

<caption> Stripe PSP Sequence Diagram
<img alt="Squence Diagram" src = "./res/md-res/images/stripe-psp-sequence.png"/>
</caption>

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

