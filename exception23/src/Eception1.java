public class Eception1 {
    public static void main(String[] args) throws CheckedException {
        try {
            Eception1.recover(100);
        } catch (CheckedException checkedException) {
            System.out.println("Must be a value greater or equal than 0");
            throw (checkedException);
        }

        try {
            Eception1.recover(8);
        }catch (Exception exception){
            exception.printStackTrace();
            throw exception;
        }

    }

    public static void recover(int a) throws CheckedException {
        if (a > 7) {
            throw new CheckedException("Please enter a valid day of the week ");
        }
        System.out.println("This is" + a + "day of week ");
    }
}

