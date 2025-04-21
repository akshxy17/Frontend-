import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = s.nextInt();
        s.close();

        int count = 0;

        for( int i =1; i <= num; i++ ){
            if( num % i == 0){
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("prime");
        } else {
            System.out.println("Not a prime");
        }


    }
}
