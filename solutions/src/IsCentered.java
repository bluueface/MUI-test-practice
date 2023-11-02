public class IsCentered {
    public static void main(String[] args) {

        System.out.println(isCentered(new int[]{5, 6, 1, 8, 9}));
    }

    public static int isCentered(int[] array) {

        int length = array.length;

        if (length % 2 == 0) {
            return 0;
        }

        int middleElementIndex = length / 2;
        int middleElement = array[middleElementIndex];

        for (int element : array) {
            if (middleElement > element) {
                return 0;
            }
        }

        return 1;

    }
}