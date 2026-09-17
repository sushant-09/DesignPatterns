# Design Patterns

A collection of Java implementations of commonly used design patterns, with a focus on understanding their structure, intent, and practical application in object-oriented software design.

Each pattern is implemented independently with a simple, runnable example for experimentation and reference.

## Creational Patterns

### Singleton

Ensures a class has only one instance and provides a global access point to it.

Implementations:
- Eager Initialization
- Lazy Initialization
- Lazy Initialization with Thread Safety (Double-Checked Locking)
- Initialization-on-Demand Holder Idiom (This gives you lazy initialization + thread safety without explicit synchronized or volatile - class initialization is thread-safe)


### Factory

Encapsulates object creation and reduces coupling between the client and concrete implementations.

- **Simple Factory:** Centralizes object creation based on a type.
- **Factory Method:** Delegates object creation to subclasses.
- **Abstract Factory:** Creates families of related objects.

**Key idea:** Depend on abstractions instead of concrete classes, keeping object creation separate from client logic.

### Builder

Constructs complex objects step-by-step, especially when they have multiple optional or configurable attributes.

**Key idea:** Avoids telescoping constructors and makes object creation more readable through method chaining.

### Prototype

- Prototype creates new objects by copying an existing object, avoiding potentially expensive or complex initialization. 
- When objects contain mutable nested objects, we need to consider shallow vs deep copying.

## Behavioral Patterns

### Strategy

Defines a family of interchangeable algorithms or behaviors and allows them to be selected or changed at runtime.

**Key idea:** Encapsulate behavior behind an interface, allowing the behavior to change without modifying the context.

### Observer

Defines a one-to-many relationship where changes in a subject automatically notify its registered observers.

**Key idea:** Decouple the subject from its observers using a common interface. Supports push and pull notification models.

### State

Allows an object to change its behavior when its internal state changes.

**Key idea:** Encapsulate state-specific behavior into separate classes, avoiding complex conditional logic and allowing state transitions at runtime.