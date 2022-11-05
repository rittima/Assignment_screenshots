package Assignment_on_String;

public class StringJoin
{
    public static void main(String[] args)
    {
        String str1="Hello,";
        String str2="How are you?";
        System.out.println("Before joining the String :");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("After joining the String :"+str1.concat(str2));
    }
}
