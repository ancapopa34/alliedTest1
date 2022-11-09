public class TrowException extends Throwable {
    public static void main(String[] args) {
        int [] str = {1,21,33,4,5,16,7,18,9,10};
        try {
            System.out.println(TrowException.appLogic(str , 5 , "23"));
            System.out.println(TrowException.appLogic(str , 5 , "45"));

        }catch (UncheckedException uncheckedException){
            System.out.println("Index invalid!");
        }catch (NumberFormatException numberFormatException){
            System.out.println("Your number it's not valid!");
        }

    }

    public static int appLogic(int[] str , int index , String number) throws ArrayIndexOutOfBoundsException, NumberFormatException {
        return str[index] + Integer.parseInt(number);
    }
}


