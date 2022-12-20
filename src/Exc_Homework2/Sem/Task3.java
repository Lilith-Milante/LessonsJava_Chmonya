package Exc_Homework2.Sem;

// Запишите в файл следующие строки:  Анна=4  Елена=5  Марина=6  Владимир=?  Константин=?  Иван=4  Реализуйте метод, который считывает данные из файла и сохраняет
// в двумерный массив (либо HashMap, если студенты с ним знакомы).  В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?, заменить его
// на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String[] stringsArr = {"Анна=4","Елена=5","Марина=6","Владимир=?","Константин=12","Иван=4"};
        writeText(stringsArr);
        HashMap<String,String> map = readTxt("text.txt");
        correctValue(map);
        System.out.println(map);
    }
    public static void correctValue(HashMap<String,String> map) {
        for (var row : map.entrySet()) {
            if (row.getValue().equals("?")) {
                row.setValue(String.valueOf(row.getKey().length()));
            } else if (!isNumber(row.getValue())) {
                throw new RuntimeException("input exception");
            }
        }
    }

    public static boolean isNumber(String string) {
        char[] charArr = string.toCharArray();
        if(!(charArr[0] == '-' || Character.isDigit(charArr[0]))) {
            return false;
        }         for (int i = 1; i < string.length(); i++) {
            if(!Character.isDigit(charArr[i]))
                return false;
        }         return true;
    }
    public static void writeText(String[] strings) {
        try (FileWriter fileWriter = new FileWriter("text.txt")) {
            for (var str: strings) {
                fileWriter.write(str + "\n");
            }          } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static HashMap<String,String> readTxt(String name) {
        HashMap<String,String> resultHashMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(name))){
            while (bufferedReader.ready()) {
                String[] tempArr = bufferedReader.readLine().split("=");
                resultHashMap.put(tempArr[0],tempArr[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }         return resultHashMap;
    }
}
