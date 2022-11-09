public class CheckedException extends Exception {

    public CheckedException (String message){
        super(message);
    }

    public static void recover(int a) throws CheckedException {
        if (a > 7) {
            throw new CheckedException("Please enter a valid day of the week ");
        }
        System.out.println("This is" + a + "day of week ");
    }

}
