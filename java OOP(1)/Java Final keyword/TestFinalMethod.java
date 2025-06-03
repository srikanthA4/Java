class Parent {
    final void show() {
        System.out.println("Final method in Parent class");
    }
}

class Child extends Parent {
    // Trying to override final method causes error:
    // void show() { 
    //    System.out.println("Trying to override");
    // }
}

public class TestFinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();  // calls final method from Parent
    }
}
