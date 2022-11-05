package Assignment_on_String;

public class StringBuilderQuestion2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("It is used to ");
        str.append(" at the specified index position");
        str.insert(14,"insert text");
        System.out.println(str);
    }
}
