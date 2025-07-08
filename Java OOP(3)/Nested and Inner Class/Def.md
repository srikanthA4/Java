 Nested and Inner Classes

 A nested class is a class defined within another class.

Java supports:
1. Static Nested Classes
2. Inner Classes (non-static nested classes)

Nested Class
├── Static Nested Class
└── Inner Class (Non-static)
    ├── Member Inner Class
    ├── Local Inner Class
    └── Anonymous Inner Class

1. Static Nested Class
* A nested class declared with the static keyword.
* Can access only static members of the outer class.
* Cannot access non-static members directly.
* Instantiated without outer class object.

2.1 Member inner class(non static):- A non-static class declared inside another class.
     1. Has access to all members (including private) of outer class.
     2. Must be accessed via an object of the outer class.

2.2 Local inner class:- A class is defined inside a method of  another class
    1. Canot be static
    2.Can access final or effectively final local variables
    3.Not accessiable outside  the  method

2.3 Anonymous inner class:- A class without a name, used for one-time use, usually to override a method or implement an interface. 
    1. Defined and instantiated at the same time.
    2. Common in event handling, UI, or callbacks.

Real world use cases

*GUI apps (event handling using anonymous classes)
*Encapsulating logic (inner classes for helper logic)
*Custom sorting with Comparator (anonymous inner classes or lambdas)

    
