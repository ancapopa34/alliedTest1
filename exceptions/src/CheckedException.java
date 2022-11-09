public class CheckedException extends Throwable {
    String errorMessage;

    public CheckedException(String error) {
        this.errorMessage = error;
    }

    public void throwException() {
        System.out.println(this.errorMessage);
    }
}
