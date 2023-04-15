/*2) Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
    }

}

*/

public class Task02 {

    public static void main(String[] args) {
        try {
            int[] Array = {3, 12, 4, 11, 78, 12, 2, 1};
            // int[] Array = {3, 12, 4, 11, 78, 12, 2, 1, 45};
            int d = 0;
            double catchedRes1 = Array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Элемент массива не существует: " + e);
        }
    }
}