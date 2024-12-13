# Pricing Platform Microservices

## Project Overview

This project implements a microservices-based platform for managing pricing data. It includes the following features:
- **CRUD operations** for pricing data.
- **Kafka Integration** for event-driven price updates.

## Technologies Used

- **Spring Boot** (for the backend)
- **PostgreSQL** (for the database)
- **Apache Kafka** (for event-driven communication)
- **Docker** (for containerization)

## Features

- **Price Management Service**: Allows adding, retrieving, and deleting prices.
- **Kafka Integration**:
  - **Producer**: Sends price update messages to a Kafka topic when prices are added or deleted.
  - **Consumer**: Listens to price update messages from the Kafka topic and logs the updates.

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/wjahatsyed/pricing-platform-microservices.git
cd pricing-platform-microservices
