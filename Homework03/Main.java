package Homework03;

/*1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, 
при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. 
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), 
должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException 
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив). */

public class Main {
    public static void main(String[] args) {
        String[][] Array = new String[][]{ 
            {"31", "12", "14", "11"},
            {"78", "12", "23", "15"},
            {"15", "25", "18", "32"}, 
            // {"15", "25", "yy", "32"},
            {"14", "56", "23", "76"}};
        try {
            printArray(Array);
            System.out.println();
        } catch (MyArraySizeException e) {
            System.out.println("Превышен размер массива");
        } catch (MyArrayDataException e) {
            System.out.println();
            System.out.println("Неверный символ в строке " + (e.getI() + 1) + ", в столбце " + (e.getJ() + 1));
        }
    }
    private static void printArray(String[][] inputStreem) throws MyArraySizeException, MyArrayDataException {
        int parsedInt;
        int sum = 0;
        if (inputStreem.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (inputStreem[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                try {
                    parsedInt = Integer.parseInt(inputStreem[i][j]);
                } catch (NumberFormatException exceptionData) {
                    throw new MyArrayDataException(i, j);
                }
                sum = sum + parsedInt;
            }
        }
        System.out.println("Сумма элеменов массива: " + sum);
    }
}