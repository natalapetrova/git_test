package seminar_2;

import java.util.Scanner;

public class program_01 {

/*
 * Задание 1.
Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.


Ответ: 
с1 = а
с2 = б

абабабабаб (всего N символов)
 */

    public static void main(String[] args) {
        // получение данных из терминала через экземпляр Scanner
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введиет число n: ");
        // считываем строку из консоли
        String nString = iScanner.nextLine();
        // преобразуем в int
        int n = Integer.parseInt(nString);
        System.out.printf("Введите символ c1: ");
        // считываем строку из консоли
        String c1 = iScanner.nextLine();
        System.out.printf("Введите символ c2: ");
        // считываем строку из консоли
        String c2 = iScanner.nextLine();
        // закрываем сканер
        iScanner.close();
 
        StringBuilder sres = new StringBuilder();

        for (int i = 0; i <= n-1; i++) {
            if (i%2 == 0) {
                sres.append(c1);
            }
            else {
                sres.append(c2);
            }
        }
        System.out.println(sres);

    }
}
