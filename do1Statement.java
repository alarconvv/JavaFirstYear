//we use do when we what that the satatement is executed at leat one time
// while is used to make a repretitive wir, but if the first evalation is false, then while never is executed
// do allows to evaluate the statement and if it is false go to the next and tests the next one

public class do1Statement {
    public static void main(String[] args) {
        int i = 1; // Initialize the counter variable
        
        do {
            System.out.println(i); // Code to be executed
            i++; // Increment the counter
        } while (i <= 5); // Condition
    }
}