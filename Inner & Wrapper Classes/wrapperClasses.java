// auto-boxing and auto-unboxing


public class wrapperClasses {
    public static void main(String args[])
    {
        int a = 10;

        Integer obj = Integer.valueOf(a); // auto-boxing


        int x = obj.intValue(); //auto-unboxing;

        System.out.println(a);
        System.out.println(obj);
        System.out.println(x);


        // Integer obj = a;
    }
}
