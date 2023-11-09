public class IsMartian {

    public static void main(String[] args) {

        System.out.println(isMartian(new int[]{1, 3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartian(new int[]{1, 3, 2}));
        System.out.println(isMartian(new int[]{1, 3, 3, 2, 1}));
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println(isMartian(new int[]{}));
        System.out.println(isMartian(new int[]{1}));
        System.out.println(isMartian(new int[]{2}));
    }

    static int isMartian(int[] array) {

        int numberOf1s = 0;
        int numberOf2s = 0;
        int length = array.length;


        for (int i = 0; i < length; i++) {

            if (i != length - 1 && array[i] == array[i + 1]) {
                return 0;
            }

            if (array[i] == 1) {
                numberOf1s += 1;
            } else if (array[i] == 2) {
                numberOf2s += 1;
            }

        }

        return numberOf1s > numberOf2s ? 1 : 0;
    }
}
