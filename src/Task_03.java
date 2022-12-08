//? ����������� ���������� ����������, �������:
//
//1. ��������� �� ������������ � ����������� ������.
//2. ���� ������� print, ������� ������ ���, ����� ��������� ��������� ���� ������ �
//   ������, � ������ - ���������.
//3. ���� ������� revert, ������� ���������� ��������� ������ �� ������.


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Deque<String> array = new ArrayDeque<>();

        while(true){
            System.out.print("������� ������\n");
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
