Java Reflection

Def:- reflection is a feature in java that allows the program top inspect and maipulate clasess, fields, methods, and constructors at runtime, even if their names are unknow as compile time. 

Use:- 

1. To inspect class strucure at runtime
2. To call method or access fields dynamically 
3. To create objects of unknown clasess
4. useful in frameworks, tools, testing libraries, and serialization libraries(like spring, Hibernate,JUnit)


Creating Object via Reflection:-

Class<?> clazz = Class.forName("Person");
Object obj = clazz.getDeclaredConstructor().newInstance();


Accessing and Modifying Fields

Field nameField = clazz.getDeclaredField("name");
nameField.setAccessible(true); // for private fields
nameField.set(obj, "John");

System.out.println("Name = " + nameField.get(obj));

Invoking Methods

Method method = clazz.getDeclaredMethod("sayHello");
method.invoke(obj); // Output: Hello!

ccessing Private Members
Use setAccessible(true) to access private fields/methods:

field.setAccessible(true);
method.setAccessible(true);
