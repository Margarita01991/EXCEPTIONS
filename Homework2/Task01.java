/*
1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task01 {
    public static void main(String[] args) {
        float userVal = getFloatVal();
        System.out.println();
        System.out.println("Ваше число: " + userVal);
    }

    static float getFloatVal() {
    float val = 0;
    boolean status=true;
    while(status){
        InputStream UserInput = System.in;
        Reader inputReader = new InputStreamReader(UserInput);
        System.out.println("Введите дробное число: ");
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        try {
            val=Float.parseFloat(bufferedReader.readLine());
            status=false;
            }
        catch (IOException | NumberFormatException exception) {
            System.out.println("Введённое число не дробное\nПовторите ввод:");
            }
        }
    return val;
    }
}
