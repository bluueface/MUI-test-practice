public class IsPairedN {

    public static void main(String[] args) {

        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPairedN(new int[]{1, 4, 1}, 5));
        System.out.println(isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPairedN(new int[]{3}, 3));
        System.out.println(isPairedN(new int[]{}, 0));
    }

    static int isPairedN(int[] array, int n) {

        int length = array.length;

        if (length == 0 || length == 1 || n == 0) {
            return 0;
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                if (i == j) {
                    continue;
                }

                if (array[i] + array[j] == n && i + j == n) {
                    return 1;
                }

            }
        }
        return 0;
    }
}
