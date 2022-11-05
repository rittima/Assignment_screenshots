package GenericAssignment;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee<Integer> ob1 = new Employee<>();
        ob1.setObject(10);
        Integer id = ob1.getObject();
        System.out.println("|--id : " + id);

        Employee<String> ob2 = new Employee<>();
        ob2.setObject("Kate");
        String name = ob2.getObject();
        System.out.println("|--name : " + name);

        Employee<Integer> ob3 = new Employee<>();
        ob3.setObject(20000);
        Integer salary = ob3.getObject();
        System.out.println("|--salary : $" + salary);

        Employee<String> ob4 = new Employee<>();
        ob4.setObject("IT");
        String department = ob4.getObject();
        System.out.println("|--department : " + department);

        System.out.println("--------------------------------------------");

        System.out.println("|--displayDitails : " + id + " " + name + " $" + salary + " " + department);
    }
}