public class DataBase {
     private String fieldName;
     private String fieldEmail;
     private String fieldAge;


    public DataBase (String fieldName , String fieldEmail , int fieldAge){
        if (fieldName == null || fieldName.equals("") || fieldEmail == null || fieldEmail.equals("")){
            throw new NullPointerException("Please enter name or email");
        }
        if (fieldAge < 18) {
            throw new ArithmeticException("Age Must be over 18");
        }
    }

}
