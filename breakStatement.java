// Break allos termination in the middle of a execution.
// It is typically  i the middle of an if statement


public class breakStatement {
    public static void main(String[] arg){

        // inside a for
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i becomes 5
            }
            System.out.println(i);
        }

        // inside a while
        int i = 1;
            while (i <= 10) {
                if (i == 5) {
                break; // Exit the loop when i becomes 5
                }
                System.out.println(i);
                i++;
                }
        // inside a do-while
                int j = 1;
                do {
                    if (j == 5) {
                        break; // Exit the loop when i becomes 5
                    }
                    System.out.println(i);
                    j++;
                } while (j <= 10);


                
    }
}