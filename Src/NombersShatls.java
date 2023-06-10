import java.util.ArrayList;
import java.util.List;

public class NombersShatls {
    public static void main(String[] args){

        List<Integer> result = new ArrayList<>();                    // "Integer" обвёрточный класс для типа int

        for (int num = 0; num <=155 ; num++) {                                   // проходимся по массиву до 155
            if (!containsDigit(num, 4) && !containsDigit(num, 9)){
                if (num < 155 || num > 155){
                    result.add(num);                                  // add. - добавляет еллементы в коллекцию
                }
            }
        }

        for (int num : result){
            System.out.println(num + " ");
        }
    }

    private static boolean containsDigit(int number, int digit){
        do {
            int remainder = number % 10;
            if (remainder == digit){
                return true;
            }
            number /= 10;              // значение делиться на 10 и присваиваеться number
        } while (number != 0);

        return false;
    }
}
