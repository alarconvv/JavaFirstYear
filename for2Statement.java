// in this for i and sum will be the initial variables
// test will be  i <= n
// after evaluate, it will add (2 units) ++i add one to sum+ and assign t n

public class for2Statement {
    public static void main(String[] args) {
        int n = 100; // Replace 10 with your desired value for n
        for (int i = 0, sum = 0; i <= n; i++, sum += i) {
            System.out.println(i + "\t" + sum);
        }
    }
}
