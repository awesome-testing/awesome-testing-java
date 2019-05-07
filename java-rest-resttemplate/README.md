# REST with RestTemplate
> This project is maintained [Awesome Testing Open Source Organization](https://github.com/awesome-testing) and part of [awesome-testing-java](https://github.com/awesome-testing/awesome-testing-java).

## Contents

- [Description](#description)
- [Requirements](#requirements)
- [Toolset](#toolset)
- [Setup](#setup)
- [Running tests](#running-tests)

### Description

This is intended to show one way for setting up project thats aimed at test REST API.  
In order to cover as many cases as possible we won't be testing real REST API, but instead [JSON Server](https://github.com/typicode/json-server) will be used.  
To make things more object oriented each API object will get it's own model class.  
And to make things a bit less obvious we'll use [lombok](https://projectlombok.org/)

### Requirements

Every test project should be created based on requirements, in case of this on those are:

- ability to run test classes in parallel
- ability to change configuration during invocation

### Toolset

We'll be using:

- json-server
- lombok
- gradle
- junit5
- restTemplate

### Setup

- Install [JSON Server](https://github.com/typicode/json-server): 

```bash
npm install -g json-server
```

- Use routes definition file:

```bash
json-server --watch api.json
```

### Running tests

- running all tests:  

```bash
./gradlew test
```

- running one test class:  

```bash
./gradlew test --tests "com.github.awesometesting.resttemplate.TestingGetMethods"
```

- running one test method:

```bash
./gradlew test --tests "usersListShouldContainExpectedElements"
```