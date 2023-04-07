import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {

    static char[] generate(int len){
        System.out.print("Your Password is:");
        String lower="qwertyuiopasdfghjklzxcvbnm";
        String upper="QWERTYUIOPASDFGHJKLZXCVBNM";
        String num="0123456789";
        String special="~!@#$%^&*?_";
        String result=lower+upper+num+special;
        Random random=new Random();
        char[] password=new char[len];

        for (int i=0; i<len; i++){
            password[i]=result.charAt(random.nextInt(result.length()));
        }
        return password;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of digits you wants in your password:");
        int digits= input.nextInt();
        System.out.println(generate(digits));
    }
}
