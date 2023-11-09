public class ComputeWeightedSum {

    public static void main(String[] args) {

        System.out.println(computeWeightedSum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(computeWeightedSum(new int[]{1, 3, 5}));
        System.out.println(computeWeightedSum(new int[]{2, 4, 6}));
        System.out.println(computeWeightedSum(new int[]{1}));
        System.out.println(computeWeightedSum(new int[]{2}));
        System.out.println(computeWeightedSum(new int[]{0, 0, 0, 0, 0}));
        System.out.println(computeWeightedSum(new int[]{}));
    }

    static int computeWeightedSum(int[] array) {

        int evenElementsSum = 0;
        int oddElementsSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenElementsSum += array[i];
            } else {
                oddElementsSum += array[i];
            }
        }

        return 2 * evenElementsSum + 3 * oddElementsSum;
    }

}
