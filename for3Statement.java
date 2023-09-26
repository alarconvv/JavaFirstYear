// Loops nest in the same way as if statements

public class for3Statement
{
    public static void main(String[ ] args)
    {
        for(int i = 1; i <= 10; i++)
            for(int j= 1; j <= 10; j++)
                if(i + j == i * j )
                    System.out.println( i + ", " + j);
    }
}