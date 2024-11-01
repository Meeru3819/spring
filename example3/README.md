
# Spring Core: @Component and @ComponentScan Annotations

This project illustrates the use of the `@Component` and `@ComponentScan` annotations in Spring Framework, which are essential for automatic bean detection and registration in the Spring application context.

---

## Table of Contents

- [Overview](#overview)
- [Purpose of @Component](#purpose-of-component)
- [Purpose of @ComponentScan](#purpose-of-componentscan)
- [Annotations Used](#annotations-used)
- [Project Structure](#project-structure)
- [Example Usage](#example-usage)

---

## Overview

In Spring, the `@Component` annotation is used to indicate that a class is a Spring-managed component. It is a form of stereotype annotation that makes it easier to create and manage beans. The `@ComponentScan` annotation is used to specify the packages to scan for components, allowing Spring to automatically discover and register beans without needing explicit configuration.

## Purpose of @Component

The `@Component` annotation is used to declare a class as a Spring component, indicating that it should be managed by the Spring container. By annotating a class with `@Component`, you enable it to be automatically detected during classpath scanning and registered as a bean.

### Key Points

- Classes annotated with `@Component` are eligible for auto-detection when using annotation-based configuration and classpath scanning.
- It simplifies the configuration by allowing developers to use annotations instead of XML.

## Purpose of @ComponentScan

The `@ComponentScan` annotation is used to specify the base packages to scan for components. When the Spring context is initialized, it scans the specified packages (and their sub-packages) to find classes annotated with `@Component`, `@Service`, `@Repository`, or `@Controller`.

### Key Points

- It allows developers to control which packages should be scanned for Spring components.
- Can be configured with `basePackages` attribute to specify one or more packages to scan.

## Annotations Used

- **@Component**: Indicates that a class is a Spring component. It enables automatic bean registration in the application context.

  ```java
  @Component
  public class MyComponent {
      // Class implementation
  }
  ```

- **@ComponentScan**: Specifies the packages to scan for Spring components. Typically used in conjunction with the `@Configuration` annotation.

  ```java
  @Configuration
  @ComponentScan(basePackages = "com.example")
  public class AppConfig {
      // Configuration class
  }
  ```

## Project Structure

```plaintext
.
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── config
│   │   │   │   └── AppConfig.java        # Configuration class with @ComponentScan
│   │   │   ├── component
│   │   │   │   └── MyComponent.java      # A component class annotated with @Component
│   │   │   ├── MainApp.java              # Main class to load application context
```

## Example Usage

In this project, the `AppConfig` class uses `@ComponentScan` to specify the package to scan for components. The `MyComponent` class is annotated with `@Component`, making it available for autowiring and management by the Spring container.

### Explanation of Key Components

1. **AppConfig**: The configuration class that enables component scanning.
2. **MyComponent**: A sample component class that will be auto-detected and registered as a bean.
3. **MainApp**: Loads the Spring application context and retrieves the `MyComponent` bean for usage.

This setup demonstrates the power of annotations in simplifying Spring configuration and promoting a cleaner, more modular application architecture.

---

This project provides a clear and simple example of using `@Component` and `@ComponentScan` annotations, making it ideal for understanding component management in Spring applications.