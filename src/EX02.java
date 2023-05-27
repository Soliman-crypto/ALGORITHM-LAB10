import java.math.MathContext;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text :");
        String txt= sc.nextLine();
        Pattern pattern= Pattern.compile("\\d+");
        Matcher matcher= pattern.matcher(txt);
        StringBuilder res= new StringBuilder();

        while (matcher.find()){
            res.append(matcher.group()).append(",");
        }
        if (res.length()>0){
            res.deleteCharAt(res.length()-1);
        }
        System.out.println("Extracted integers: " +res.toString());
    }
}