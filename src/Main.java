
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("введите математическое выражение");
        Scanner scan = new Scanner(System.in);
        System.out.println(calc(scan.nextLine()));

    }
    public static String calc(String input) {

        String strWithOut1 = input.replaceAll("/", "");
        String strWithOut2 = input.replaceAll("\\*", "");
        String strWithOut3 = input.replaceAll("-", "");
        String strWithOut4 = input.replaceAll("\\+", "");

        int intWO11 = strWithOut1.length();
        int intWO12 = input.length();
        int intWO13 = intWO12 - intWO11; // кол-во символов математической операции "/"
        int intWO21 = strWithOut2.length();
        int intWO22 = input.length();
        int intWO23 = intWO22 - intWO21; // кол-во символов математической операции "*"
        int intWO31 = strWithOut3.length();
        int intWO32 = input.length();
        int intWO33 = intWO32 - intWO31; // кол-во символов математической операции "-"
        int intWO41 = strWithOut4.length();
        int intWO42 = input.length();
        int intWO43 = intWO42 - intWO41; // кол-во символов математической операции "+"
        int intWOSum = intWO13 + intWO23 + intWO33 + intWO43; // должна быть равна единице

        if (intWOSum == 1) {

            int intForSwitch = intWO13 + intWO23 * 2 + intWO33 * 3 + intWO43 * 4;

            switch (intForSwitch) {
                case 1:
                    String[] strEnSplit1 =  input.split("/");

                    try {
                        Rum strEnSplitRum1 = Rum.valueOf(strEnSplit1[0]);
                        Rum strEnSplitRum2 = Rum.valueOf(strEnSplit1[1]);
                        int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                        int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                        int intOutRum = intRum1/intRum2;
                        try {
                            RumOut OutRum = RumOut.values()[intOutRum-1];
                            return String.valueOf(OutRum);
                        }catch (ArrayIndexOutOfBoundsException ae){
                            return "в римской системе исчесления нет отрицательных чисел и нуля";
                        }
                    } catch (IllegalArgumentException il) {
                        try {
                            int intExceptionInt11 = Integer.parseInt(strEnSplit1[0].trim());
                            int intExceptionInt21 = Integer.parseInt(strEnSplit1[1].trim());
                            if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                return String.valueOf(intExceptionInt11 / intExceptionInt21);
                            } else {
                                return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                            }
                        } catch (NumberFormatException nfe){
                            return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                        }
                    }
                case 2:
                    String[] strEnSplit2 =  input.split("\\*");

                    try {
                        Rum strEnSplitRum1 = Rum.valueOf(strEnSplit2[0]);
                        Rum strEnSplitRum2 = Rum.valueOf(strEnSplit2[1]);
                        int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                        int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                        int intOutRum = intRum1*intRum2;
                        try {
                            RumOut OutRum = RumOut.values()[intOutRum-1];
                            return String.valueOf(OutRum);
                        }catch (ArrayIndexOutOfBoundsException ae){
                            return "в римской системе исчесления нет отрицательных чисел и нуля";
                        }
                    } catch (IllegalArgumentException il) {
                        try {
                            int intExceptionInt11 = Integer.parseInt(strEnSplit2[0].trim());
                            int intExceptionInt21 = Integer.parseInt(strEnSplit2[1].trim());
                            if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                return String.valueOf(intExceptionInt11 / intExceptionInt21);
                            } else {
                                return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                            }
                        } catch (NumberFormatException nfe){
                            return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                        }
                    }
                case 3:
                    String[] strEnSplit3 =  input.split("-");

                    try {
                        Rum strEnSplitRum1 = Rum.valueOf(strEnSplit3[0]);
                        Rum strEnSplitRum2 = Rum.valueOf(strEnSplit3[1]);
                        int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                        int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                        int intOutRum = intRum1-intRum2;
                        try {
                            RumOut OutRum = RumOut.values()[intOutRum-1];
                            return String.valueOf(OutRum);
                        }catch (ArrayIndexOutOfBoundsException ae){
                            return "в римской системе исчесления нет отрицательных чисел и нуля";
                        }
                    } catch (IllegalArgumentException il) {
                        try {
                            int intExceptionInt11 = Integer.parseInt(strEnSplit3[0].trim());
                            int intExceptionInt21 = Integer.parseInt(strEnSplit3[1].trim());
                            if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                return String.valueOf(intExceptionInt11 / intExceptionInt21);
                            } else {
                                return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                            }
                        } catch (NumberFormatException nfe){
                            return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                        }
                    }
                case 4:
                    String[] strEnSplit4 =  input.split("\\+");

                    try {
                        Rum strEnSplitRum1 = Rum.valueOf(strEnSplit4[0]);
                        Rum strEnSplitRum2 = Rum.valueOf(strEnSplit4[1]);
                        int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                        int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                        int intOutRum = intRum1+intRum2;
                        try {
                            RumOut OutRum = RumOut.values()[intOutRum-1];
                            return String.valueOf(OutRum);
                        }catch (ArrayIndexOutOfBoundsException ae){
                            return "в римской системе исчесления нет отрицательных чисел и нуля";
                        }
                    } catch (IllegalArgumentException il) {
                        try {
                            int intExceptionInt11 = Integer.parseInt(strEnSplit4[0].trim());
                            int intExceptionInt21 = Integer.parseInt(strEnSplit4[1].trim());
                            if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                return String.valueOf(intExceptionInt11 / intExceptionInt21);
                            } else {
                                return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                            }
                        } catch (NumberFormatException nfe){
                            return "принимаются только числа в диапозоне от 1 до 10 или от I до X";
                        }
                    }

            }

        } else {
            return "формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";
        }
        return input;

    }
}



