#!/usr/bin/env bash

set -e

#test stripe provider
STRIPE_PROVIDER_PORT=8080
TXN_REF="txn123424"

testStripeProvider() {
  echo "testing stripe provider"
  set -x
  curl -X GET "http://localhost:$STRIPE_PROVIDER_PORT/api/v1/payment?ref=$TXN_REF"
  curl -X POST "http://localhost:$STRIPE_PROVIDER_PORT/api/v1/payment" \
    -H "Content-Type: application/json" \
    -d '{"field1":"fieldVal1","field2":"fieldVal2","field3":"fieldVal3","field4":"fieldVal4"}'
  curl -X POST "http://localhost:$STRIPE_PROVIDER_PORT/api/v1/payment/expire?ref=$TXN_REF"
  set +x
  echo "end testing stripe provider"
}

testStripeProvider

