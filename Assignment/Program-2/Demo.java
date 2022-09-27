import java.util.Scanner;

class Demo {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scan.nextInt();
        int i = 1, count = 1;
        while (count <= n) {
            if (i % 2 != 0) {
                System.out.print(i <= n ? i + "," : i + " ");
                count++;
            }
            i++;

        }
    }
}