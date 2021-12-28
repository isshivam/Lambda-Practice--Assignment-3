package com.knoldus;
public class ConcatenatedStringInUppercase {
    public static void main(String[] args) {
        ConcatenatedString str = (s1,s2,s3,s4,s5,s6,s7)-> (s1+s2+s3+s4+s5+s6+s7).toUpperCase();
        String finalString = str.concatenatedString("The", "lambda", "has", "too", "many", "string", "arguments");
        System.out.println(finalString);
    }
}
