package Assignment_on_String;

public class StringBufferQuestion2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("It is used to ");
        str.append(" at the specified index position");
        str.insert(14,"insert text");
        System.out.println(str);
    }
}
