//Ïóñòü äàí LinkedList ñ íåñêîëüêèìè ýëåìåíòàìè. Ðåàëèçóéòå ìåòîä, êîòîðûé âåðíåò “ïåðåâåðíóòûé” ñïèñîê.

import java.util.LinkedList;

public class HW_Task01 {
    public static void main(String[] args) {

        LinkedList<String> linkl = new LinkedList<String>();
        linkl.add("ïåðâûé");
        linkl.add("âòîðîé");
        linkl.add("òðåòèé");
        linkl.add("÷åòâåðòûé");
        linkl.add("ïÿòûé");
        System.out.println("Ñïèñîê äî: " + linkl);

        linkl = reverseLinkedList(linkl);
        System.out.println("Ñïèñîê ïîñëå: " + linkl);
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
 //////// Ñîãëàñåí íå ñàìûé ëó÷øèé âàðèàíò
