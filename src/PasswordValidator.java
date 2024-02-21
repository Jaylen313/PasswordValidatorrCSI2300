
import java.util.Scanner;

public class PasswordValidator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        scanner.close();

        if(ValidPassword(password))
        {
            System.out.println("The password is valid.");
        }
        else
        {
            System.out.println("The password is invalid.");
        }
    }

    public static boolean ValidPassword(String password)
    {
        if (password.length() < 8 || password.length() > 16)
        {
            return false;
        }

        boolean LowerCase = false;
        boolean UpperCase = false;
        boolean Digit = false;
        boolean SpecialCharacter = false;

        for(char c : password.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                LowerCase = true;
            }
            else if(Character.isUpperCase(c))
            {
                UpperCase = true;
            }
            else if(Character.isDigit(c))
            {
                Digit = true;
            }
            else
            {
                SpecialCharacter = true;
            }
        }
        return LowerCase && UpperCase && Digit && SpecialCharacter;
    }
}