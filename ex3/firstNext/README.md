- It's simple example of spring security
- go to: localhost:8080/login, in headers add
  - user: john
  - password: 1234

- You will get access token, copy it and set to header to next request with: "Authorization: Bearer " and value
- Then it would be possible to go: localhost:8080/api/users
- Then, when token expired, can go to locahost:8080/api/toke/refresh and add there expired token, it will return new working token
- That's it, example of security