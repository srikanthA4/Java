Enum in Java

Def:- An enum (short for enumeration) is a special date type that defines a set of named constant values.

NOTE:- It was introduced in java 5, and unlike tradiditonal constants(final static), Enums are type-safe, object oriented, and can have fields, constructors, and methods.

Use Enums:-

1. Group releated constants under one type
2. Imporve code readility and maintainability 
3. Ensure type safty 
4. Add custom behavior to constants 

Syntax:= enum EnumName{
	CONSTANT1, CONSTANT2, CONSTANT3:
}


Use Cases:
 
* Days of the week (enum Day)
* Status values (enum Status { ACTIVE, INACTIVE })
* Directions (enum Direction { NORTH, SOUTH, EAST, WEST })
* HTTP status codes
* Order states, payment modes, etc.