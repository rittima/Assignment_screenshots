package Intermediate_OOP;
class Singleton {
    private static Singleton objObject;

    private Singleton() {
    }

    public static Singleton getInstance()
    {
        if(objObject == null)
        {
            objObject = new Singleton();
        }
        return objObject;
    }

    public void getConnection()
    {
        System.out.println("You are now connected to the database.");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Singleton ob;
        ob= Singleton.getInstance();
        ob.getConnection();
    }
}