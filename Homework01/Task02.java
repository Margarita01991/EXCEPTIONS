package Homework01;
/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. */
public class Task02 {
    public static void main(String[] args) {
        int[] arrA = {15,10,8,16,12};
        int[] arrB = {14,3,81,91,11};
        int[] result = sumOfArrays(arrA,arrB);
        if(result == null) {
            System.out.println("Array lengths are not equal");
        } else {
            for (int arr: result) {
                System.out.printf("%d ", arr);
            }
        }
    }
    public static int[] sumOfArrays(int[] arrA, int[] arrB) {
        if(arrA.length != arrB.length) {
            return null;
        }
        int[] array = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            array[i] = arrA[i] + arrB[i];
        }
        return array;
    }
}
