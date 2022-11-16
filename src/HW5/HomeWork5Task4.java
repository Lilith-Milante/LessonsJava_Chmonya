package HW5;

// 4. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

import java.util.logging.Logger;

public class HomeWork5Task4 {

    static int[] chessBoard = { 0, 0, 0, 0, 0, 0, 0, 0 };
    static int index = 0;
    static int variant = 1;

    public static void main(String[] args) { // используется для вывода в логгер

        Logger logger6 = Logger.getAnonymousLogger();
        logger6.info(arrToString((chessBoard)));
        toCollect(chessBoard);
        logger6.info(arrToString((chessBoard)));
        //logger6.info(toCollect(chessBoard));
    }


    private static void toCollect(int[] chessBoard) {

        while (chessBoard[0] < 8) {
            if (checking()) {
                if (index == 7) {
                    System.out.println("Variant" + variant++);
                    displayBoard(chessBoard);
                    chessBoard[index]++;
                } else {
                    index++;
                }
            } else {
                chessBoard[index]++;
            }
        }
        //return chessBoard.toString();
    }

    public static void displayBoard(int[] arr) { // сложность с печатью в логгер

           for (int i = 0; i < 8; i++) {
               for (int j = 0; j < 8; j++) {
                   if (arr[j] == i) {
                       System.out.printf("%3s", "Q|");
                   } else {
                       System.out.printf("%3s", "_|");
                   }
               }
               System.out.println();
           }
       }
    static boolean checking() {
        int i;
        if (index == 0) {
            return true;
        }
        if (chessBoard[index] > 7) {
            chessBoard[index] = 0;
            index--;
            return false;
        }
        for (i = 0; i < index; i++) {
            if ((chessBoard[index] == chessBoard[i]) | ((Math.abs(chessBoard[index] - chessBoard[i])) == (index - i))) {
                return false;
            }
        }
        return true;
    }
    public static String arrToString(int[] array) { // метод дпо переводу массива в строку для вывода
        StringBuilder strArr = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            strArr.append(array[i]);
            strArr.append(", ");
        }
        return strArr.toString();
    }
}