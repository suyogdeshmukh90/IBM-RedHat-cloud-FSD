package comm.example.Demo;
import comm.example.CD;
public class App {
    public static void main(String[] args)
    {
        CD mycd = new CD(101, "Don");
        System.out.println(mycd.getDetails());
    }
}
