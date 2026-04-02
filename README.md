# 📋 Staffiq

> A smart staff management system built with **Java & Spring Boot**.

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.8+-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

---

## 🚀 Overview

**Staffiq** is a backend application designed to streamline staff management operations. Built on the Spring Boot framework, it provides a robust, scalable foundation for managing employee data, workflows, and organizational intelligence.

---

## 🛠️ Tech Stack

| Technology | Description |
|---|---|
| ☕ **Java** | Primary programming language |
| 🍃 **Spring Boot** | Application framework |
| 🏗️ **Maven** | Build tool & dependency management |
| 🗄️ **Spring Data JPA** | Data persistence layer |

---

## 📁 Project Structure

```
Staffiq/
├── .mvn/
│   └── wrapper/               # Maven wrapper configuration
├── src/
│   ├── main/
│   │   ├── java/              # Application source code
│   │   └── resources/         # Configuration files (application.properties)
│   └── test/
│       └── java/              # Unit & integration tests
├── .gitignore
├── mvnw                       # Maven wrapper (Unix)
├── mvnw.cmd                   # Maven wrapper (Windows)
└── pom.xml                    # Project dependencies & build config
```

---

## ⚙️ Prerequisites

Make sure you have the following installed before running the project:

- **Java 17+** (or the version specified in `pom.xml`)
- **Maven 3.8+** (or use the included Maven wrapper)
- A running **database instance** (e.g., MySQL / PostgreSQL) if applicable

---

## 🏃 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/AdityaShendkar/Staffiq.git
cd Staffiq
```

### 2. Configure the Application

Update `src/main/resources/application.properties` with your database credentials and any environment-specific settings:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/staffiq_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build the Project

Using the Maven wrapper (no local Maven installation required):

```bash
# Linux / macOS
./mvnw clean install

# Windows
mvnw.cmd clean install
```

### 4. Run the Application

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

> The application will start on **`http://localhost:8080`** by default.

---

## 🧪 Running Tests

```bash
./mvnw test
```

---

## 📦 Building a JAR

To package the application into an executable JAR:

```bash
./mvnw clean package
java -jar target/Staffiq-*.jar
```

---

## 👤 Author

**Aditya Shendkar**

- GitHub: [@AdityaShendkar](https://github.com/AdityaShendkar)

---

<div align="center">

⭐ **If you find this project helpful, please consider giving it a star!** ⭐

</div>
