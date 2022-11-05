package Exception_handling_Assignment;

public class Question1
{
    int result;
    public void division(int num1,int num2) {

        try {
            result = num1 / num2;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero Exception");
        } finally {
            System.out.println("After execution : " + result);
        }
    }
    public static void main (String[]args){
        Question1 d = new Question1();
        d.division(20, 0);
    }
}
