package LambdaAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lamda8 {
    public static void main(String[] args) {
        Question8 n1 = new Question8(10);
        Question8 n2 = new Question8(20);
        Question8 n3 = new Question8(30);
        Question8 n4 = new Question8(40);
        List<Question8> l = new ArrayList<>();
        {
            l.add(n1);
            l.add(n2);
            l.add(n3);
            l.add(n4);
            System.out.println("printing all elements");
            int n = l.size();
            printList(l, number ->
            {
                for (int i = 0; i <= n; i++) {

                    System.out.println(l.get(i));
                }
            });
        }
    }

    private static void printList(List<Question8> l, Consumer<Question8> consumer) {
        for (Question8 number : l) {
            consumer.accept(number);
        }
    }
}
