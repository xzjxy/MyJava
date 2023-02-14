package string;

import java.util.Scanner;

public class StringTest3 {
    // 手机号码中间四位屏蔽
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your phone numbers(11 required) :");
        String phoneNumbers = sc.next();
        String phoneHack = "";
        for (int i = 0; i < phoneNumbers.length(); i++) {
            if(i>=3 && i<7){
                phoneHack += "*";
            }else {
                phoneHack +=phoneNumbers.charAt(i);
            }
        }
        System.out.println("You numbers is :");
        System.out.println(phoneNumbers);
        System.out.println("You numbers after protection is :");
        System.out.println(phoneHack);
        String phoneNumber = "13134568976";
        System.out.println(protect(phoneNumber));
    }

    public static String protect(String numbers){
        String res = "";
        res = numbers.substring(0,3)+"****"+numbers.substring(7);
        return res;
    }
}
