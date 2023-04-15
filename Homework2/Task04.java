/*4) Исправьте код, примените подходящие способы обработки исключений:

public static void main(String[] args) {
        InputStream inputStream;
        try {
                String[] strings = {"apple", "orange"};
                String strings1 = strings[2];
                test();
                int a = 1 / 0;
                inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("На ноль делить нельзя");
        }
        catch (Throwable e) {
                e.printStackTrace();
        } catch (StackOverflowError error) {
                System.out.println("Что-то сломалось");
        } finally {
                System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
}

private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
} */

import java.io.*;

public class Task04 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        } catch (IOException e){
            System.out.println("Что-то сломалось");
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    public static void test () throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
    }
}
