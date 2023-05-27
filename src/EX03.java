import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TYPE the text:");
        String txt = sc.nextLine();

        List<Double> num = ex03(txt);
        System.out.println("NUMBER IS : "+num);

        double sum = calculateSum(num);
        double max= findMax(num);
        int maxIndex = num.indexOf(max);

        System.out.println("sum: "+sum);
        System.out.println("max: "+max);
        System.out.println("ordinal num of max: "+(maxIndex +1));

        String replacedTxt= replaceDeimalNumbers(txt);
        System.out.println("REPLACED TEXT IS: "+replacedTxt);

    }
    private static List<Double>ex03(String txt){
        List<Double>num= new ArrayList<>();
        Pattern pattern= Pattern.compile("[+-]?\\d+(\\.\\d+)?");
        Matcher matcher= pattern.matcher(txt);
        while (matcher.find()){
            String numString = matcher.group().replace(",",".");
            double nums = Double.parseDouble(numString);
            num.add(nums);
        }
        return num;
    }
    private static double calculateSum(List<Double>nums){
        double sum = 0.0;
        for (double num : nums){
            sum += num;
        }
        return sum;
    }
    private static double findMax(List<Double>nums){
        double max = Double.MIN_VALUE;
        for (double num : nums){
            if(num > max){
                max= num;
            }
        }
        return max;
    }
    private static String replaceDeimalNumbers(String txt){
        Pattern pattern = Pattern.compile("[+-]?\\\\d+(\\\\.\\\\d+)?");
        Matcher matcher= pattern.matcher(txt);
        return matcher.replaceAll("NUMBER");
    }
}