package LambdaAssignments;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Question8 {
    int number;
    Question8(int number)
    {
        this.number=number;
    }

    @Override
    public String toString() {
        return "list{" +
                "number=" + number +
                '}';
    }
}
