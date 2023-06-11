public class Demo13 {
    public static void main(String[] args) {

        try
        {
            System.out.println(10/0);
        }

        //Order Of Catch Block Should be From child to parent


        catch(ArithmeticException arithmeticException)
        {
            System.out.println("dr is zero");
        }
        catch(Exception exception)
        {

        }
    }
}
