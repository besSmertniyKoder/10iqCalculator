

import java.util.Locale;
import java.util.Scanner;

// Глаза alert
// я очень сука надеюсь что я не прав

/*Небольшое предисловие,в коде есть пара спорных моментов,как отсутсвие инкапсуляции и неуместное использование
switch. Я был бы рад реализовать это в корректном виде,если бы у меня было больше времени,тем не менее,программа
полнстью рабочая,я надеюсь.
*/

public class Calculatotron extends NumbersAbstract {
    private static boolean arab_chisla = true;

    private static String[] parser(String input) {
        String[] parsed_input = input.split(" ");
        if (parsed_input.length > 3 || parsed_input.length <= 2) {
            Scanner input_a_value_again = new Scanner(System.in);
            System.out.println("Неверный формат ввода данных. Введите выражение, разделяя каждый символ пробелом");
            input = input_a_value_again.nextLine();
            return parser(input);
        } else {
            return parsed_input;
        }

    }


    public static void main(String[] args) {
        int value_unknown1 = 0;
        int value_unknown2 = 0;

        Scanner inputed_example = new Scanner(System.in);
        System.out.println("An ancient evil has awakened......");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Введите пример для решения");
        String input = inputed_example.nextLine().toUpperCase();
        String[] parsed_input = Calculatotron.parser(input);
        String znak = parsed_input[1];



        RomanOperations value1 = new RomanOperations();
        RomanOperations int_valu1 = new RomanOperations();
        RomanOperations int_value2 = new RomanOperations();
        RomanOperations value2 = new RomanOperations();
        RomanOperations rresult = new RomanOperations();
        value2.setRomes_value2(parsed_input[2]);
        value2.ConvertToInt_for_value2(parsed_input[2]);
        value1.setRomes_value1(parsed_input[0]);
        value1.ConvertToInt_for_value1(parsed_input[0]);
        RomanOperations srez = new RomanOperations();



        try {
            value_unknown1 = Integer.parseInt(parsed_input[0]);
            if (value_unknown1 > 10){
                System.out.println("Вы ввели первое число больше 10,зачем?");
                System.exit(1);
            }
            value_unknown2 = Integer.parseInt(parsed_input[2]);
            if (value_unknown2 > 10 ){
                System.out.println("Вы ввели второе число больше 10,зачем?");
                System.exit(1);
            }


        } catch (NumberFormatException e) {
            arab_chisla = false;
        }
        if (arab_chisla) {
            ArabianOperations.value1 = value_unknown1;

            ArabianOperations.value2 = value_unknown2;


            if (znak.equals("+")){
                ArabianOperations.result3 = value_unknown1 + value_unknown2;

            }else if (znak.equals("-")){
                ArabianOperations.result3 = value_unknown1 - value_unknown2;
            }else if (znak.equals("*")||znak.equals("x")){
                ArabianOperations.result3 = value_unknown1 * value_unknown2;
            } else if (znak.equals("/")||znak.equals(":")){
                try {
                    ArabianOperations.result3 = value_unknown1/value_unknown2;
                }catch (ArithmeticException e){
                    System.out.println("Вы поделили на ноль,не так ли?");

                }

            }
        }
        else {
            if (znak.equals("+")){
                RomanOperations.result_int = RomanOperations.romes_value1_int + RomanOperations.romes_value2_int;

        }else if (znak.equals("-")){
                RomanOperations.result_int = RomanOperations.romes_value1_int - RomanOperations.romes_value2_int;
            }else if (znak.equals("*")||znak.equals("x")){
                RomanOperations.result_int= RomanOperations.romes_value1_int * RomanOperations.romes_value2_int;
            }else if (znak.equals("/")||znak.equals(":")){
                try {
                    RomanOperations.result_int = RomanOperations.romes_value1_int/RomanOperations.romes_value2_int;
                }catch (ArithmeticException e){
                    System.out.println("Вы же специально поделили на ноль?)");
                }

            }
        }


        if (arab_chisla){
            System.out.println("Ответ равен: " + ArabianOperations.result3);
        } else {
            System.out.println("Ответ равен: " + srez.Convert_To_Roman());
        }
        System.out.println("");

        System.out.println("Если прграмма вывела ответ некоректно,то возможно,вы ввели одно число арабское,а другое римское,проверьте корректность ввода.");


    }
}






