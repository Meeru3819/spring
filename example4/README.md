
# Spring Core: @PostConstruct and @PreDestroy Annotations

This project demonstrates the use of `@PostConstruct` and `@PreDestroy` annotations in Spring Framework. These annotations help to manage the lifecycle of beans by allowing you to define initialization and cleanup methods, making them ideal for setting up resources, validating configurations, or performing any necessary cleanup before the bean is destroyed.

---

## Table of Contents

- [Overview](#overview)
- [Purpose of @PostConstruct](#purpose-of-postconstruct)
- [Purpose of @PreDestroy](#purpose-of-predestroy)
- [Annotations Used](#annotations-used)

---

## Overview

In Spring, the `@PostConstruct` and `@PreDestroy` annotations are used to define lifecycle callback methods in a bean's lifecycle. These annotations make it easy to execute custom code during the initialization and destruction phases of a bean's lifecycle. This is particularly useful when a bean needs to allocate resources upon creation or release them when no longer needed.

## Purpose of @PostConstruct

The `@PostConstruct` annotation is used to define a method that should run once, just after the bean is fully initialized. This is helpful for any initialization logic that relies on the dependencies being injected and the configuration being complete.

### Key Points
- The method annotated with `@PostConstruct` is called only once, after dependency injection is complete.
- Ideal for initializing resources, validating configurations, or performing any setup needed before the bean is ready to be used.

```java
@PostConstruct
public void init() {
    System.out.println("Bean is initialized and dependencies are injected.");
}
```

## Purpose of @PreDestroy

The `@PreDestroy` annotation is used to define a method that should run just before the bean is removed from the application context, making it the perfect place to perform cleanup tasks. This method is invoked only once when the application context is closing.

### Key Points
- The method annotated with `@PreDestroy` is called only once, just before the bean is destroyed.
- Useful for releasing resources like database connections, stopping background threads, or closing file streams.

```java
@PreDestroy
public void cleanup() {
    System.out.println("Bean is about to be destroyed. Cleaning up resources.");
}
```

## Annotations Used

- **@PostConstruct**: Marks a method to be called immediately after the bean is initialized and all dependencies have been injected. The method should have no parameters and can throw no checked exceptions.

- **@PreDestroy**: Marks a method to be called just before the bean is destroyed, allowing for any final cleanup operations.

---

This project provides a concise example of managing bean lifecycle with `@PostConstruct` and `@PreDestroy` annotations, making it ideal for understanding how to set up and clean up resources effectively in a Spring application.