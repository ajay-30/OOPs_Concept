import java.net.SocketOption;


class bike extends vehicle
{
    public void test()
    {
        System.out.println("Test passed");
    }
}
class ajay
{
    public void add(int a,int b)
    {
        System.out.println("Here two parameters are only passed:"+(a+b));
    }
    protected void add(int a,int b,int c)
    {
        System.out.println("Here three parameters are only passed:"+(a+b+c));
    }
}
class ram extends ajay
{
    public void add(int a,int b,int c)
    {
        System.out.println("Here three parameters are only passed using the child class:"+(a*b*c));
    }
}
public class Main {

    public static void main(String[] args) {
        ajay a=new ajay();
        ajay b=new ram();
        vehicle c=new bike();
        c.test();
        a.add(1,2);
        b.add(1,2,3);
    }
}