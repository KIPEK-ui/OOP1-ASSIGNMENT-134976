# OOP1 ASSIGNMENT-134976
 CLASS TYPES

## Abstract Class, Interface, and Concrete Class

#### [Addition of Two Numerical Values with Numberonly Validation GUI]

This AdditionGUI Java program demonstrates the use of an Abstract Class, an Interface, and a Concrete Class.



### Abstract Class: `GUIComponent`
An Abstract Class is a class that cannot be instantiated on its own and may contain abstract methods (methods without a body).`GUIComponent` class is an Abstract Class with an abstract method `create()`.

### Interface: `AdditionOperation`
An Interface is a reference type in Java that can contain abstract methods. In this program, the `AdditionOperation` interface has an abstract method `add(double num1, double num2)`.

### Concrete Class: `AdditionGUI`
A Concrete Class is a class that has a complete implementation. It can be instantiated to create objects. In this program, the `AdditionGUI` class is a Concrete Class that extends the Abstract Class `GUIComponent` and implements the Interface `AdditionOperation`. It provides implementations for the abstract methods `create()` and `add(double num1, double num2)`.

### Testing the Implementation
The `main` method in the `AdditionGUI` class tests the implementation by creating an instance of `AdditionGUI` and calling the `create()` method to display the GUI. The GUI allows users to input two numbers, perform the addition, and display the result.

### Conclusion
This program demonstrates the differences between Abstract Classes, Interfaces, and Concrete Classes in Java. 
