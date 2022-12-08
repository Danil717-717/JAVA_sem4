//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class HW_Task01 {
    public static void main(String[] args) {

        LinkedList<String> linkl = new LinkedList<String>();
         linkl.add("первый");
        linkl.add("второй");
        linkl.add("третий");
        linkl.add("четвертый");
        linkl.add("пятый");
        System.out.println("Список до: " + linkl);

        linkl = reverseLinkedList(linkl);
        System.out.println("Список после: " + linkl);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> linkl) {
        for (int i = 0; i < linkl.size() / 2; i++) {
            String temp = linkl.get(i);
            linkl.set(i, linkl.get(linkl.size() - i - 1));
            linkl.set(linkl.size() - i - 1, temp);
        }

        return linkl;
    }
    
}
 //////// Согласен не самый лучший вариант
