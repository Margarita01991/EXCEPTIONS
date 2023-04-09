package Homework01;

/* Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
*/
public class Task01 {
    public static void main(String[] args) {
        Integer[] arr = {4, 52, 12, null, 72, 12, null, 17};
        message(checkArray(arr));
    }
    public static int[] checkArray(Integer[] arr) {
        int[] exceptions = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null) {
                exceptions[i] = i;
            }
        }
        return exceptions;
    }
    public static void message(int[] exceptions) {
        String result = " ";
        for (int i = 0; i < exceptions.length; i++) {
            if(exceptions[i] != 0) {
                result +=  exceptions[i];
                result += " ";
            }
        }
        if(result != " ") {
            throw new RuntimeException("The null value is at the" + result + "position");
        } else {
            System.out.println("Null value is missing");
        }
    }
}