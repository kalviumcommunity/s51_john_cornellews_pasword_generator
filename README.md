# Password Generator Application

## Overview

This Java application demonstrates the use of core Object-Oriented Programming (OOP) concepts: encapsulation, inheritance, polymorphism, and abstraction. It generates passwords with different criteria, such as length and character types.

## Implementation Details

### Abstraction
- Use of abstract classes and methods to define the basic structure of password generation.

### Encapsulation
- Use of private fields with public getters and setters to manage data access.

### Inheritance
- Extending abstract classes to create specific types of password generators.

### Polymorphism
- Overriding methods in subclasses to provide specific implementations.

## Project Structure

- `PasswordGenerator` (abstract class)
  - Defines the structure for password generators.
  - Contains a private field `length` with public getters and setters.
  - Abstract method `generatePassword()` to be implemented by subclasses.

- `AlphanumericPasswordGenerator` (class)
  - Extends `PasswordGenerator`.
  - Generates passwords using alphanumeric characters.

- `SpecialCharacterPasswordGenerator` (class)
  - Extends `PasswordGenerator`.
  - Generates passwords using alphanumeric characters and special characters.

- `Main` (class)
  - Demonstrates the usage of different password generators.

## Usage

1. Clone the repository.

```bash
git clone https://github.com/your-repo/password-generator.git
```
