import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String oxNumber = scanner.nextLine();
            int Bitlength = oxNumber.length() - 2;
            long result = 0;
            int i = 0;
            long byteValue;
            while (i < Bitlength) {
                char num = oxNumber.charAt(Bitlength + 1 - i);
                byteValue = ConversetoDecimal(num);
                result = (long) (result + Math.pow(16, i) * byteValue);
                i++;
            }
            System.out.println(result);
        }
    }

    public static long ConversetoDecimal(char uppercaseLetter){
        if(uppercaseLetter == '0')return 0;
        if(uppercaseLetter == '1')return 1;
        if(uppercaseLetter == '2')return 2;
        if(uppercaseLetter == '3')return 3;
        if(uppercaseLetter == '4')return 4;
        if(uppercaseLetter == '5')return 5;
        if(uppercaseLetter == '6')return 6;
        if(uppercaseLetter == '7')return 7;
        if(uppercaseLetter == '8')return 8;
        if(uppercaseLetter == '9')return 9;
        if(uppercaseLetter == 'A')return 10;
        if(uppercaseLetter == 'B')return 11;
        if(uppercaseLetter == 'C')return 12;
        if(uppercaseLetter == 'D')return 13;
        if(uppercaseLetter == 'E')return 14;
        if(uppercaseLetter == 'F')return 15;
        return 0;
    }
}