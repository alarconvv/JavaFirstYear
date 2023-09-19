// Program to demostrate assigment Operators
//Vra 23-0919

public class assigmentOperators
{
    public static void main (String [] args)
    {
        int a = 12, b = 8, c = 6;

        System.out.println( a + "" + b + "" + c);
        a = c;
        System.out.println( a + "" + b + "" + c);
        c+= b;
        System.out.println( a + "" + b + "" + c);
        a = b + c;
        System.out.println( a + "" + b + "" + c);
        a++;
        ++b;
        c = a++ + b;
        System.out.println( a + "" + b + "" + c);
    }
}