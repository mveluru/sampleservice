# Sample Service

A Spring Boot 3.5 (Java 25) REST application that provides a simple lookup demo for the Brite ecosystem.

## Overview

Sample Service is a small standalone lookup demo that demonstrates basic Spring Boot patterns with a simple in-memory data store.

## Building and Running

### Prerequisites
- Java 25 (ensure `JAVA_HOME` is set correctly)
- Maven 3.8+

### Build
```bash
mvn clean compile
mvn test
```

### Run the server
```bash
mvn spring-boot:run
```

The service will start on port 8086 with context path `/sample`.

## Endpoints

### Sample Lookup
```
GET /sample/v1/sample/spl?item=<item>
```

**Parameters:**
- `item` (required): The item name to lookup

**Response:**
- Returns the item number if found, or 404 if not found

**Example:**
```bash
curl "http://localhost:8084/sample/v1/sample/spl?item=Mac"
```

Sample data includes:
- Mac → 2
- Dell → 3
- IBM → 4

## Health Check
```
GET /sample/actuator/health
```

## Running Tests
```bash
mvn test
```

## Architecture

The service uses a simple layered architecture:
- **Controller** (`SampleController`): REST endpoint handler
- **Service** (`SampleService`): Business logic
- **Repository** (`SampleRepository`): In-memory data access
