import java.util.Scanner;

class Number {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scan.nextInt();
        int i = 1, count = 1;
        if (n % 2 == 0){
            n = n - 1;
        }

        while (count <= n) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
                count++;
            }
            i++;
        }
    }
}