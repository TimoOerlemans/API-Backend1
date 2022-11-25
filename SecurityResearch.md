## Research

### Main question:

How to process user credentials in a secure way?

### Sub-questions

- [Which research strategy am I going to use for each sub question](#Which-research-strategy-am-I-going-to-use-for-each-sub-question)
- [Best way to send from backend to frontend](#1-best-way-to-send-from-backend-to-frontend)
- [What are some options to secure the credentials?](#2-what-are-some-options-to-secure-the-credentials)
- [What is the best option?](#3-what-is-the-best-option)
- [Conclusion](#Conclusion)


### Which research strategy am I going to use for each sub question

For each of the sub questions I am going to use a research strategy from the dot research framework. For the second question I want to use
[community research](https://ictresearchmethods.nl/Community_research). This is a strategy that
is about looking at work from other people and see what they used. The first and last question I am going to use
[document analysis](https://ictresearchmethods.nl/Document_analysis).

### 1. Best way to send from backend to frontend

You have two different type calls between frontend and backend. Those two options are Http(Hypertext Transfer Protocol) and 
Https(Hypertext Transfer Protocol Secure). What Https already says is that this is secure. Https uses TLS to encrypt normal
Http request and responses. 

Most of the internet information that is sent uses http protocol. There are request and responses. With the request when 
a user want to go to a different page the browser will send request to the server for a response. But with http everyone 
can read those request and that is not good if you send some private information. 

With https you can secure those request so that other people can't read these. Instead of the information they see just a
line of random letters and numbers. Its get secured by TLS/SSL what are protocols that secure the communication between 
computers.

### 2. What are some options to secure the credentials?

There are a few options to make sure user information can't be stolen by other people. Here are a few options: Dispose data,
use authentication and no sql injections.

Dispose Data: if you have a website or app that doesn't necessary need the credentials from a user then you can just delete them
after a period a user is offline. This way a hacker can't steal the credentials from this user because all his data is gone. You can 
do this by using sessions that hold a user data and when he logs out or leaves the site his data gets lost.

Authentication: You have all kind of authentication. By authentication, you look if the user is the person he says he is.
Some examples are that you can set different requirements on a password that should be done. Like it has to contain at least
10 characters and 1 of them must be a number. This makes it already harder for the hacker to steal someone's credentials.
But you can also use transaction authentication. This looks at the users characteristics with what is knows about the user.
For example if a user keeps logging in from a certain country and one day it is from a whole different country it sends a 
message to the user.

Sql injection: sql injection is a code injection that destroys a database. It gives a hacker an opportunity to interfere 
with the queries that make calls to the database. So can the hacker retrieve information he or she is not supposed to get.
But you can prevent this by using parameterized queries. This is a type of sql query that requires at least one parameter 
for execution.

### 3. What is the best option?

The best option is to do them all but that cost too much time and money. Some things are also a better version than another one.
Sql injection can be prevented easily, so you can always do that. 

But what type of authentication is the best and should be in every project. 

Token based authentication: this authentication requires users to obtain a token made by the computer. This is how
two-factor authentication works. So even thought a hacker hacks the username and password he also has to get access to 
the token. the pros of this is that its stateless which means that the token is not stored so the servers are a lot 
faster. The cons are that depending on the token that doesn't get stored in the database that a cookie hack is lethal.
the token can also not be deleted only expired. So if a hacker gets the token he has some time to get all the information 
he needs.

Session-based authentication: Session based looks a bit like the token based but there is a difference in the storage of the 
session/token. Because in a session based auth the information from the user such as login time and user request gets stored 
on the server.

HTTP Digest Authentication: This is a method that negotiate with the users web browser with his username or password. 
This can be used to confirm the identity of a user before sending sensitive information. the pros are that it is easy to implement,
and it is more secure than the basic auth because the password is not send in plain text. But the credentials has to be sent
each time there is a request. It also is user unfriendly because a user has to give false credentials to log out.

### Conclusion

You can never really secure the credentials there is always one vulnerability point where hackers can come in. But you can
implement multiple authentications and use https instead of http to make it safer. 


### resources
[Http https](https://www.cloudflare.com/learning/ssl/why-is-http-not-secure/#:~:text=HTTPS%20is%20HTTP%20with%20encryption,uses%20HTTPS%20has%20https%3A%2F%2F.)