public class Main {

    public static void main(String[] args) throws CheckedException {
        CheckedException exc = new CheckedException("error appeared");
        exc.throwException();

    }
}
