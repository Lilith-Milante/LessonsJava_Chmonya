public class Task2 {
    public static void main(String[] args) {
        // дан массив двоичных чисел, вывести максимальное количество подряд идущих единиц
        int[] array1 = new int[]{1, 0, 0, 1, 1, 1, 1, 0, 0, 1};
        int j = 0;
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                j++;
            } else {
                if (j < k) {
                    k = j;
                    j = 0;
                } else {
                    j = 0;
                }
            }
            if (j > k) k = j;
            System.out.println(k);
        }
    }
}