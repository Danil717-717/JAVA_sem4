// �������� ���������, ������������ ������������ ����������� ������ � ���������.
//
//a+(d*3) - ������
//\[a+(1*3) - ����
//\[6+(3*3)] - ������
//{a}\[+\]{(d*3)} - ������
//<{a}+{(d*3)}> - ������
//{a+]}{(d*3)} - ����


public class HW_Task03 {


    public static boolean parsing(String str)                //���������� �������, ������� ��������� ������������ ������������������
    {
        int temp1 = 0;                                       //����� ����������-������� 1 ��� ��������
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;

        for (int i = 0; i < str.length(); i++) {             //�� 0 �� ����� ������ �� ������������
            String one_symbol = str.substring(i, i + 1);     //�������� ������
            if (one_symbol.equals("(")) {                    //��������� �������� �� �� ����������� �������
               temp1++;                            //���� ��, �� ���������� �������
            } else if (one_symbol.equals(")")) {                                       //�����
                temp1--;                          //����������� ������� 2 �� �������
            } else if (one_symbol.equals("[")) {                    //��������� �������� �� �� ����������� �������
                temp2++;                            //���� ��, �� ���������� �������
            } else if (one_symbol.equals("]")) {                                       //�����
                temp2--;                          //����������� ������� 2 �� �������
            }
            if (one_symbol.equals("{")) {                    //��������� �������� �� �� ����������� �������
                temp3++;                            //���� ��, �� ���������� �������
            } else if (one_symbol.equals("}")) {                                       //�����
                temp3--;                           //����������� ������� 2 �� �������
            }
            if (one_symbol.equals("<")) {                    //��������� �������� �� �� ����������� �������
                temp4++;                            //���� ��, �� ���������� �������
            } else if (one_symbol.equals(">")) {                                       //�����
                temp4--;                         //����������� ������� 2 �� �������
            }

        }

        if (temp1 == 0 & temp2 == 0 & temp3 == 0 & temp4 == 0 ) {
            return true;
        } else {
            return false;
        }

    }

    public static void main (String[]args){  //�������� ����� ���������
        String var = "a+(d*3)";  //����� ��������� ������������������
        System.out.println(parsing(var));  //������� ��������� ������ � ��������� ��������
        String var2 = "[a+(1*3)";
        System.out.println(parsing(var2));
        String var3 = "[6+(3*3)]";
        System.out.println(parsing(var3));
        String var4 = "{a}\\[+\\]{(d*3)}";
        System.out.println(parsing(var4));
        String var5 = "<{a}+{(d*3)}>";
        System.out.println(parsing(var5));
        String var6 = "{a+]}{(d*3)}";
        System.out.println(parsing(var6));
    }
}