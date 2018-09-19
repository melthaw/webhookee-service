
# Overview

> Webhookee is the webhook broker to forward the application's notification (for example: bitbucket , docker hub) to your IMs.

# Introduction

What's' in the README ?

* How to get the API Doc Online ?
* How to build the project ?
* How to test the project ?
* How to debug the project in IDE ?
* How to build the docker image ?
* How to start the project in the way of docker-compose ?

> Generally, there are 3 ENV need to cover for the project:
>
> * development
> * test
> * production
>
> We use Spring Profile to differentiate the environment , more detail please refer to `Appendix - Spring Profile`

## How to get the API Doc Online ?

Please follow the instructions to start the API doc server.

```sh
cd apidoc
gradle clean bootRun
```

Then open the browser and enter the following URL.

> http://127.0.0.1:8080/swagger-ui.html


## How to build the project ?

```sh
gradle clean build -x test
```

or 

```sh
gradlew clean build -x test
```

> remember pass `-x test` if you only want verify the source code compilation.

## How to test the project ?

The webhookee broker depends on outside server before it gets started.

* Mongodb
* RabbitMQ
* ...

So please remember start the required db before test.

```
 docker-compose -f docker-compose.dev.yml up
```

Finally start the test.


```
gradle clean test
```

or 

```
gradlew clean test
```


## How to debug the project in IDE ?

The webhookee broker depends on outside server before it gets started.

* Mongodb
* RabbitMQ
* ...

So please remember start the required db before debug.

```
docker-compose -f docker-compose.dev.yml up
```


Add new Gradle configuration in IDE , and run it in debug mode.

> The configuration should match the following CMDs.

```
cd broker
gradle clean bootRun -PjvmArgs="-Dspring.profiles.active=dev"
```

or
 
```
cd broker
../gradlew clean bootRun -PjvmArgs="-Dspring.profiles.active=dev"
```

