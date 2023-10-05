// a method is a fuction in which the method header will be  the name
// a list of parameters ad a return type.
//the declaration  is the header + the body (actual code)
// put public static is a way to mimic  the c-style for a global fuction
//when  a methods is called user paramter ar sent to the parameters of the function
// so, primtive types are passed using call-by-value
// at the end, return shows the value

// in this case, we will create a method to get the min value

public class methodDeclaration
{
    //method declaration
public static int min(int x, int y)
{
    return x < y ? x : y;
}

public static void main(String [] arg)
{

    int a = 3;
    int b = 7;

    System.out.println(min(a,b));

}

}
