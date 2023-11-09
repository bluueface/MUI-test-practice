public class SumEvenOdd {
    public static void main(String[] args) {

        System.out.println(sumEvenOdd(new int[]{1}));
    }

    public static int sumEvenOdd(int[] array) {

        int sumOdd = 0;
        int sumEven = 0;

        for (int element : array) {

            if (element == 1 || element == -1 || element == 0) {
                sumOdd += element;
            } else if (element % 2 == 0)
                sumEven += element;
            else {
                sumOdd += element;
            }
        }

        return sumOdd - sumEven;
    }
}
