# My own site which describes myself.

I'm going to push It to heroku as soon as At least some of features will be implemented.

But now, If You want to try - You can start it locally. I'll Explain how - later.

## What is ready?
Google OAuth2.0

## What is planned?
Google mail sender(config is ready)

Some features (Maybe some game or few more services. Perhaps chat bot?)

Field to left comments

Fill information and describe Myself

## List of technologies
Java8

Spring boot

Spring core

Spring security

Spring cloud (for OAuth2)

Postgresql (will be used later to store comments. 
To tell the truth I realy don't know yet whethter I would use PSQL or mongo. But Perhaps I will try PSQL first)

Hibernate

HickariCP(Connection pull I usually use for PSQL)

HTML

CSS(bootstrap)

JS

Angular

## How to run

### Change properties to your own  in 

application.properties (Mail, PSQL, server port(default is 8080 i prefere 9000)

application.yml (Google client ID and token)

### From folder with project

```sh
$ mvn spring-boot:start
```
