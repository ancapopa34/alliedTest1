package myFirstHttpProgram;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.SQLOutput;


public class generateUsernameAndPassword {

//    public static void main(String[] args) {
//
//
//        String userNameLowerCase = RandomStringUtils.randomAlphabetic(10).toLowerCase();
//        String passwordLowerCase = RandomStringUtils.randomAlphabetic(10).toLowerCase();
//        String userNameUpperCase = RandomStringUtils.randomAlphanumeric(10).toUpperCase();
//        String passwordUpperCase = RandomStringUtils.randomAlphanumeric(10).toUpperCase();
//        System.out.println("Username" + " " + userNameUpperCase + " " + "password" + " " + passwordUpperCase);
//        System.out.println("Username" + " " + userNameLowerCase + " " + "password" + " " + passwordLowerCase);
//        String usernameLowAndUppCase1 = RandomStringUtils.random(10, true, true);
//        String passwordLowAndUppCase1 = RandomStringUtils.random(10, true, true);
//        System.out.println("Username" + " " + usernameLowAndUppCase1 + " " + "password" + " " + passwordLowAndUppCase1);
//        String usernameOnlyNumbers = RandomStringUtils.randomNumeric(10);
//        String passwordOnlyNumbers = RandomStringUtils.randomNumeric(10);
//        System.out.println("Username" + " " + usernameOnlyNumbers + " " + "password" + " " + passwordOnlyNumbers);
//        String string1 = RandomStringUtils.randomAlphabetic(3);
//        String string2 = RandomStringUtils.randomNumeric(3);
//        String string3 = RandomStringUtils.random(4, false, false);
//        String userNameMixed = string1 + string2 + string3;
//        String passwordMixed = string1 + string2 + string3;
//        System.out.println("Username" + " " + userNameMixed + " " + "password" + " " + passwordMixed);
//    }

    public  static String usernameLowerCase(){
         String userNameLowerCase = RandomStringUtils.randomAlphabetic(10).toLowerCase();
        System.out.println("Username" + " " + userNameLowerCase);
        return userNameLowerCase;
    }

    public static String passwordLowerCase(){
        String passwordLowerCase = RandomStringUtils.randomAlphabetic(10).toLowerCase();
        System.out.println("Password" + " " + passwordLowerCase);
        return passwordLowerCase;
    }

    public static  String userNameUpperCase(){
        String userNameUpperCase = RandomStringUtils.randomAlphanumeric(10).toUpperCase();
        System.out.println("Username" + " " + userNameUpperCase);
        return userNameUpperCase;
    }

    public static String passwordUpperCase(){
        String passwordUpperCase = RandomStringUtils.randomAlphanumeric(10).toUpperCase();
        System.out.println("Password" + " " + passwordUpperCase);
        return passwordUpperCase;
    }

    public String usernameLowAndUppCase(){
        String usernameLowAndUppCase1 = RandomStringUtils.random(10, true, true);
        System.out.println("Username" + " " + usernameLowAndUppCase1);
        return usernameLowAndUppCase1;
    }

   public static String passwordLowAndUppCase(){
       String passwordLowAndUppCase1 = RandomStringUtils.random(10, true, true);
       System.out.println("Password" + " " + passwordLowAndUppCase1);
       return passwordLowAndUppCase1;
   }

   public static String usernameOnlyNumbers(){
       String usernameOnlyNumbers = RandomStringUtils.randomNumeric(10);
       System.out.println("Username" + " " + usernameOnlyNumbers);
       return usernameOnlyNumbers;
   }

   public static String passwordOnlyNumbers(){
       String passwordOnlyNumbers = RandomStringUtils.randomNumeric(10);
       System.out.println("Password" + " " + passwordOnlyNumbers);
       return passwordOnlyNumbers;
   }

   public static String userNameMixed(){
       String string1 = RandomStringUtils.randomAlphabetic(3);
       String string2 = RandomStringUtils.randomNumeric(3);
       String string3 = RandomStringUtils.random(4, false, false);
       String userNameMixed = string1 + string2 + string3;
       System.out.println("Username" + " " + userNameMixed);
        return userNameMixed;
   }

   public static String passwordMixed(){
       String string1 = RandomStringUtils.randomAlphabetic(3);
       String string2 = RandomStringUtils.randomNumeric(3);
       String string3 = RandomStringUtils.random(4, false, false);
       String passwordMixed = string1 + string2 + string3;
       System.out.println("Password" + " " + passwordMixed);
       return passwordMixed;
   }
}
