package com.example;

public class Main {
    public static void main(String[] args) {
        String rawCaptcha="captcha: 9 * 5 = ";
        String rawCoupon="This is the coupon you wil get 50% off after applying it: 'GJFGFG45FG5FG4GFG'";

        int num1= Integer.parseInt(rawCaptcha.substring(9, 10));
        int num2= Integer.parseInt(rawCaptcha.substring(13, 14));
        String operator=rawCaptcha.substring(11,12);
        int result=0;
        switch (operator) {
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "/":
                result=num1/num2;
                break;
            case "*":
                result=num1*num2;
                break;
        }
        System.out.println(result);
        System.out.println(rawCoupon.indexOf(":"));
        System.out.println(rawCoupon.substring(rawCoupon.indexOf(":")+3,rawCoupon.length()-1));
    }
}