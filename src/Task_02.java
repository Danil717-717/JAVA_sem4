//����������� ���������� ����������, �������:
//1. ��������� �� ������������ ������ ����
//
//text~num
//
//1. ����� ����������� ������ �� ~, ��������� text � ������� ������ �� ������� num.
//2. ���� ������� print~num, ������� ������ �� ������� num � ������� ������ � ������� � �� ������.
//</aside>

import java.util.LinkedList;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     // ������

        System.out.print("������� ������: ");
        String line = scan.nextLine();              // ���������� ��� �������

        String [] arr = line.split("~");        // ������ ������ ��������

        LinkedList<String> linkl = new LinkedList<>();    // ������� ������ ����

        int ind = Integer.parseInt(arr[1]);          // �������� ����� ���� ��� ������, ��������� �� � �����
        for (int i = 0; i < ind * 2; i++) {         // ��������� ������ ���� �� �� ��������
            linkl.add("������ " + i);               // ������� ���� ������������
        }

        if (arr[0].equals("print")){            // ������ �������� �� ������� ������
            String a = linkl.remove(ind);   // ���� ����� print � ����� �� �����, �� �� �����������
            System.out.println(a);          // ������� �������� ����� print ���������� � ������� �� ����������

        }else {                             // ���� ������ ��� �� ������ �� ����� �������� ��
            linkl.add(ind, arr[0]);         // ��� ����� ��� �� ������
        }

        System.out.println(linkl);
    }
}
