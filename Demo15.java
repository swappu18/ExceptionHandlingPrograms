public class Demo15 {
    public static void main(String[] args) {

        try
        {
            throw new ArithmeticException("divide by zero");

        }
        catch(ArithmeticException arithmeticException)
        {
            System.out.println("invalid input");
        }
    }
}
