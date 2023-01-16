package javarush;

public class solution_001 {

/*
Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
Метод должен работать только с массивами целочисленных значений (int[]).

Пример:
Если массив содержал элементы:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
то после вызова метода reverseArray() должен содержать:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1
Требования:
Метод reverseArray() должен менять порядок элементов массива на обратный.
 */
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        // создаем новый массив, длина которого равна длине входящему массиву
        int [] newArr = new int[array.length];
        // задаем итерратор для заполнения массива
        int j = 0;
        // обратный цикл который начинает работать с конца массива
        for (int i = array.length - 1; i >= 0; i--) {
                // заполняем новый массив
                newArr[j] = array[i];
                j++;
        }
        // теперь перезаписываем новые данные в старый массив
        for (int i = 0; i < newArr.length; i++) {
            array[i] = newArr[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
        }
    }
