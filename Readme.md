### Diagram
---
### Validation
---
### Core-Processing
---
### Stripe-Provider
- `service that will integrate with stripe apis and provide payment functionalities`
    - create payment (one time payment)
    - get payment details
    - expire payment

| Method | endpoint                  |  RequestBody           |RequestParams        |
|--------|---------------------------|------------------------|---------------------|
| POST   | /api/v1/payment           |  createPaymentReq      |     nil             |
| GET    | /api/v1/payment           |  nil                   |providerReference    |
| POST   | /api/v1/payment/expire    |  nil                   |providerReference    |

----
### STRIPE
[STRIPE API URL](https://docs.stripe.com/api)
`base url` - `https://api.stripe.com/`
`authentication` - `API KEY`

```bash
curl https://api.stripe.com/v1/charges -u STRIPE_API_KEY:
```
