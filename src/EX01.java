import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EX01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter text: ");
        String input= sc.nextLine();

        String patternString= "abcd2023111111102023";

        Pattern pattern=Pattern.compile(patternString);

        Matcher matcher= pattern.matcher(input);

        if (matcher.matches()){
            String result= input.replaceAll("30/07","HAPPY BIRTHDAY !");
            System.out.println("Result :" +result);
        }else {
            System.out.println("INPUT YOU DID CANNOT MATCH YOUR PATTERN.");
        }
    }
}