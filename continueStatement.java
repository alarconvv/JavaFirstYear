// We use continue when we want to give up  
//on a current iteration of a loop and go to the next iteration


public class continueStatement{
    public static void main(String[] arg){
        for( double i = 1; i <= 100; i++){
            if ( i % 10 == 0 )
            continue;
            System.out.println(i);
        }
    }
}