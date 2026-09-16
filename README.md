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