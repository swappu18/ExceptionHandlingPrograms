
//this is tricky question
import java.lang.NullPointerException;
public class Demo6 {
    public static void main(String[] args) {

        try
        {
            String str=null;
            System.out.println(str.length());
        }
        catch(NullPointerException nullPointerException)
        {
            System.out.println("no operation allowed in null");
            System.out.println(10/0);
        }
        finally {
            System.out.println("closing the data base connections");
        }
        System.out.println("rest pof main method"); //this line will not be executed
    }
}
