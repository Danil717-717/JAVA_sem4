//? Реализовать консольное приложение, которое:
//
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная была первой в
//   списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Deque<String> array = new ArrayDeque<>();

        while(true){
            System.out.print("Введите строку\n");
            String line = scan.nextLine();

            if(line.equals("")){
                break;
            }
            else if(line.equals(("print"))){
                while (!array.isEmpty()){
                    System.out.print(array.removeLast() + " ");

                }
            }
            else if (line.equals(("revert"))) {
                array.removeLast();
            }
            else{
                array.add(line);
            }


        }
        System.out.println(array);

    }
}
