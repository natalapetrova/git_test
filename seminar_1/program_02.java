package seminar_1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class program_02 {
    public static void main(String[] args) {
            /*
     * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
     * 'Доброе утро, 'имя'!' , если время от 05:00 до 11:59;
     * 'Добрый день, 'имя'!' , если время от 12:00 до 17:59;
     * 'Добрый вечер, 'имя'!' , если время от 18:00 до 22:59;
     * 'Доброй ночи, 'имя'!' , если время от 23:00 до 04:59;
     */

        // получение данных из терминала через экземпляр Scanner. Надо import.java.util.Scanner;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("What is you name?: ");
        // считываем строку из консоли
        String name = iScanner.nextLine();
        
        int hour = LocalDateTime.now().getHour();
        String text = "";
        
        if ((hour >= 5) && (hour < 12)) {
            text = "Доброе утро, ";
        } 
        else if ((hour >= 12) && (hour < 18)) {
            text = "Добрый день, ";
        }
        else if ((hour >= 18) && (hour < 23)) {
            text = "Добрый вечер, ";
        }
        else {
            text = "Доброй ночи, ";
        }

        System.out.printf("%s %s", text, name);
        // закрываем сканер
        iScanner.close();
    }

}