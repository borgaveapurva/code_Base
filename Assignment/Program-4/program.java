public class program {

    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[j] % i == 0) {
                    count++;   
                }
            }
            System.out.print(i + ":" + count + " ,");
        }
    }
}