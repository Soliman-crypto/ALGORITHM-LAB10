import java.awt.*;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("TYPE the RGB color : ");
        String rgbColor= sc.nextLine();
        boolean isRGBColor= rgbColor.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");

        System.out.println(" RGB color : "+isRGBColor);




        System.out.println("TYPE the date: ");


        String date = sc.nextLine();


        boolean isDateFormat = date.matches("^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$");
        System.out.println("FORMAT DATE : "+isDateFormat);



        System.out.println("TYPE email :");


        String email= sc.nextLine();


        boolean isEmail = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        System.out.println("Email : "+isEmail);



        System.out.println("Enter IP");
        String ipAdd= sc.nextLine();



        boolean isIP = ipAdd.matches("^((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])$");
        System.out.println("IP Address: " +isIP);
    }


}