public class Example3 {
    String getMessage() {
        return "Java is fun!";
    }

    public static void main(String[] args) {
        Example3 obj = new Example3();
        String msg = obj.getMessage();
        System.out.println(msg);
    }
}
