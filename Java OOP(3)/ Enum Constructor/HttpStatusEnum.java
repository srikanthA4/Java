//Enum with Multiple Fields

// Http Status Enum

enum HttpStatus {
    OK(200, "Success"),
    NOT_FOUND(404, "Resource Not Found"),
    SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() { return code; }

    public String getMessage() { return message; }
}

public class HttpStatusEnum {
    public static void main(String[] args) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        System.out.println("Code: " + status.getCode());
        System.out.println("Message: " + status.getMessage());
    }
}
