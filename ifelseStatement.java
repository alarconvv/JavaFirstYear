// if statement is a decision marker
// if expession is evaluated as true then sttement is exceuted, otherwise, it is not. 
// when the statement is completed, control passes to next statement.
//Next expression could be a "else", indicating that if first one is treu then run second statement
// the structure always is one if/else one statement
// if yo want to use two statements you should use "{}"

public class ifelseStatement
{
    public static void main( String [] args)
    {
        int x = 0;

        System.out.println("1/x is");

        if(x != 0)
        System.out.println((double) 1 / x);
        else
        System.out.println(" Undefined");
    }
}