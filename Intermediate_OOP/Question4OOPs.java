package Intermediate_OOP;

public abstract class Question4OOPs {

        abstract void main();
    }
    class Reading extends Question4OOPs
    {
        void main()
        {
            System.out.println(" Read the text");
        }
    }
    abstract class Write extends Question4OOPs
    {
        abstract void main();
    }
    abstract class Detail
    {
        private int age;
    }

    class ConceptAbstract {
        public static void main(String args[]) {
            Reading s=new Reading();
            s.main();
        }
    }
