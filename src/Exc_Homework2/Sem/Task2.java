package Exc_Homework2.Sem;

// Обработайте возможные исключительные ситуации. “Битые” значения в исходном массиве считайте нулями. Можно внести в код правки, которые считаете необходимыми.

public class Task2 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "3"}, {"1-2", "3"}, {null}};
        //String[][] arr = null;
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr) {
        if(isNull(arr)) {
            return Integer.MIN_VALUE;
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(isNull(arr[i])) {
                continue;
            }
        for (int j = 0; j < arr.length; j++) {
            if (arr[i][j] == null || !isNumber(arr[i][j])) {
                arr[i][j] = "0";
            }
            sum += Integer.parseInt(arr[i][j]);
        }
        } return sum;
    }
    public static boolean isNull(Object arr) {
        return arr == null;
    }
    public static boolean isNumber(String string) {
        char[] charArr = string.toCharArray();
        if(!(charArr[0] == '-' || Character.isDigit(charArr[0]))) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if(!(Character.isDigit(charArr[i]))) {
                return false;
            } return true;
        }
        return false;
    }
}
