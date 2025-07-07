Def- Method Overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.

1. It has same name and same parametrs 

Uses: to change the behaviour of inherted methods and to implement runtime polymorphism. 

Rules for Method Overriding

Rule	Description
1-> Method must have same name, return type, and parameters
2-> Subclass method cannot reduce visibility (e.g., from public to protected)
3 ->Final, static, and private methods cannot be overridden
4 ->Use @Override annotation (optional and uses to catch mistakes early) 

