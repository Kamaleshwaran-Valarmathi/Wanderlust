# Wanderlust

Wanderlust is a travel management system that allows users to explore various travel packages, destinations, and activities. It enables passengers to sign up for activities, and provides a seamless experience for managing travel plans.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)

## Introduction

Wanderlust is a Spring Boot-based travel management system designed to assist travel agencies and customers in planning and booking travel packages. The system provides detailed information about available packages, destinations, and activities, and allows passengers to sign up for activities during their trip.

## Features

- View available travel packages and their details.
- Explore various destinations included in each package.
- Discover activities offered in each destination.
- Sign up for activities as a passenger.
- Calculate discounted prices for premium, gold, and standard members.
- Check the available capacity for each activity to avoid overbooking.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Apache Maven for building the project.
- Spring Boot and Spring Framework dependencies.

## Installation

1. Clone the Wanderlust repository to your local machine.
2. Build the project using Maven.

```bash
mvn clean install
```

3. Run the application.

```bash
mvn spring-boot:run
```

## Usage

Once the application is up and running, you can access the following endpoints:

- `/packages/{packageId}` - Get details of a specific package by its ID.
- `/packages/{packageId}/passengers` - Get a list of passengers enrolled in a specific package.
- `/activities/available` - Get a list of available activities for signing up as a passenger.
- `/passengers/{passengerId}` - Get details of a specific passenger by their ID.

## License

Wanderlust is released under the [MIT License](https://opensource.org/licenses/MIT). Feel free to use and modify the code as per the terms of the license.
