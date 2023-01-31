    package org.example;

    import java.util.Scanner;

    public class Password {

        public static boolean isPasswordComplex(String password){
            boolean hasUppercaseLetter=false;
            boolean hasLowercaseLetter = false;
            boolean hasNumber= false;
            if(password.length()<6){
                return false;
            }
            for (int i =0;i < password.length() || !hasUppercaseLetter && !hasLowercaseLetter && !hasNumber ; i++ ){
                char current = password.charAt(i);
                if(Character.isDigit(current)){
                    hasNumber= true;
                } else if (Character.isUpperCase(current)){
                    hasUppercaseLetter=true;
                } else if (Character.isLowerCase(current)){
                    hasLowercaseLetter= true;
                }

            }
            return  hasNumber && hasLowercaseLetter && hasUppercaseLetter;
        }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter password ");
            String userInput = scanner.nextLine();
            System.out.println("is the password complex :"+isPasswordComplex(userInput) );
            scanner.close();
        }
    }
