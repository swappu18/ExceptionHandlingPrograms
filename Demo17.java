
//Exception Propagation- this case only for unchecked exception
public class Demo17 {
    public static void main(String[] args) {

        try
        {
            m1();

        }
        catch(ArithmeticException arithmeticException)
        {
            System.out.println("invalid denominator");
        }
        System.out.println("rest of main method");

    }
    public static void m1()
    {
        m2();
    }
    public static void m2()
    {
        m3();
    }
    public static void m3()
    {
        System.out.println(10/0);
    }



}
