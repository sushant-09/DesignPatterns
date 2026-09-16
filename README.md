# Design Patterns

A collection of Java implementations of commonly used design patterns, with a focus on understanding their structure, intent, and practical application in object-oriented software design.

Each pattern is implemented independently with a simple, runnable example for experimentation and reference.

## Creational Patterns

### Singleton

**Package:** `creational.singleton`

Ensures a class has only one instance and provides a global access point to it.

Implementations:
- Eager Initialization
- Lazy Initialization
- Lazy Initialization with Thread Safety (Double-Checked Locking)
- Initialization-on-Demand Holder Idiom (This gives you lazy initialization + thread safety without explicit synchronized or volatile - class initialization is thread-safe)