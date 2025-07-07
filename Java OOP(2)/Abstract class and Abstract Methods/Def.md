Abstract Class in Java

Def. An abstract class in java is a class that cannot be create objects of it. It can have abstract methods(methods without  body) and non-abstract methods(with implementation)

Abstract Class:- A class declared using the abstract keyword, which may or may not contain abstract methods.

Abstract Method: a method declared without a body and using the abstract keyword. it must be implemented by the subclass.

Syntax: abstract class ClassName{
	abstract void methodName();
	void normalMethod(){
		//body 
	}
}

Uses:- 1. To provide a base for other classes.
 2. To enforce a contract for subclasses.
 3. To write common logic while leaving some methods for subclasses to implement.