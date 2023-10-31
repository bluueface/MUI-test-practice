public class Main {
    public static void main(String[] args) {

        System.out.println(IsCentered(new int[]{1}));
    }

    public static int IsCentered(int[] array) {

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