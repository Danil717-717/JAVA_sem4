// образец работы Queue и Deque
// Queue - очередь 1 зашел 1 вышел
// Deque - стек последний зашел последний вышел

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        String[] base = {"one", "two", "three", "four"};
        Queue<String> queueArray = new LinkedList<>(Arrays.asList(base));
        Deque<String> dequeArray = new LinkedList<>(Arrays.asList(base));
        System.out.println("Очередь:");

        while ((!queueArray.isEmpty())){
            System.out.println(queueArray.poll() + " ");
        }
        System.out.println("\nСтек:");
        while (!dequeArray.isEmpty()){
            System.out.println(dequeArray.pollLast() + " ");
        }

    }
}