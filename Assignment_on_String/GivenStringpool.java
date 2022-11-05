package Assignment_on_String;

import java.util.Locale;

public class GivenStringpool {
    public static void main(String[] args) {
        String str = new String("Java String pool refers to collection of Strings which are stored in heap memory");

        System.out.println("Before using the string method: "+str);
        System.out.println();
        String str1=str.toLowerCase();
        System.out.println("String to consol in Lower Case : "+str1);
        System.out.println("String to consol in Upper Case : "+str.toUpperCase());
        System.out.println("Replacing all the 'a' character in the string with $sign: "+str.replace('a','$'));
        if(str.contains("collection")){
        System.out.println("Checking the string contain the word 'collection'"); }
        if(str.compareTo(str)==0){
            System.out.println("Equal");}
            else{
                System.out.println("Not compare");}
    }

}