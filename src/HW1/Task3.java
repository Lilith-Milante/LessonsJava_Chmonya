import javax.swing.text.Position;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/* Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему */

public class Task3 {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 3, 3, 22, 3, 2, 3, 3 };

        int val = 3;
        int posit = nums.length - 1;
        //System.out.println(rnd.nextDouble(0.1, 4.3));

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[posit] == val)
                posit--;
            else {
                for (int j = posit; j >= 0; j--) {
                    if (nums[j] == val) {
                        int temp = nums[j];
                        nums[j] = nums[posit];
                        nums[posit] = temp;
                        posit--;
                        break;
                    } else
                        continue;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
