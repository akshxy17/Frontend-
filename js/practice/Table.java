
import java.util.Scanner;

class Table{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        s.close();

        for (int i = 0; i <=10; i++) {

            System.out.println(n + "X" + i + "=" + n*i );
            
        }
    }
}