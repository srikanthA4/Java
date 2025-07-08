Nested Static Class in java

Def:- A nested static class is a static class defined inside another class.

Syntax:- 
class Outer {
    static class Nested {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

Use Static Nested Class:- 

1. When the nested class is logically related to its outer class

2. When the nested class doesn’t need access to instance variables/methods of the outer class

3. Example use: Builder Pattern, Configuration Classes, Utility logic

final points:- 
* A static nested class belongs to the outer class, not its instance 
* Cannot access non-static members of the outer class
* great for grouping related classess and reducing namespace pollution

