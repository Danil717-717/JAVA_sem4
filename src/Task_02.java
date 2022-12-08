//Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида
//
//text~num
//
//1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//</aside>

import java.util.LinkedList;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     // сканер

        System.out.print("Введите строку: ");
        String line = scan.nextLine();              // переменная для сканера

        String [] arr = line.split("~");        // парсим строку введеную

        LinkedList<String> linkl = new LinkedList<>();    // создаем динкед лист

        int ind = Integer.parseInt(arr[1]);          // введеная цифра идет как строка, переводим ее в цифру
        for (int i = 0; i < ind * 2; i++) {         // заполняем линкед лист на то значение
            linkl.add("Строка " + i);               // которое ввел пользователь
        }

        if (arr[0].equals("print")){            // делаем проверку по условию задачи
            String a = linkl.remove(ind);   // если ввели print и какое то число, то из линкедлиста
            System.out.println(a);          // достаем значение после print показываем и удаляем из линкедлист

        }else {                             // если вводит что то другое то нужно добавить на
            linkl.add(ind, arr[0]);         // это место что то другое
        }

        System.out.println(linkl);
    }
}
