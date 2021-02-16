public class RomanOperations extends Object {

    public String toString() {
        return result_int + "";
    }


    public static String romes_value1;

    public static String romes_value2;
    public static int romes_value1_int;
    public static int romes_value2_int;
    public static int result_int;
    private String sign = "";
    private String result_string;
    String[] roman_numbers = {"zero", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    void Romes(String value1, String value2) {
        this.romes_value1 = value1;
        this.romes_value2 = value2;
        this.romes_value1_int = ConvertToInt_for_value1(value1);
        this.romes_value2_int = ConvertToInt_for_value2(value2);
    }

    private String convertResultationToRoman(int n, int remains) {
        remains = n % 10;
        if (remains != 0) {
            try {
                return convertResultationToRoman(n - remains, 0) + roman_numbers[remains - 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                sign = "-";
                return convertResultationToRoman(n - remains, 0) + roman_numbers[(remains + 1) * -1];
            }
        }
        if (n > 0) {
            n = n - 10;
            return convertResultationToRoman(n, 0) + "X";
        } else if (n < 0) {
            n = n + 10;
            return convertResultationToRoman(n, 0) + "X";
        } else {
            return sign;
        }


    }

    //Возможно придется отказаться от полиморфизма
    public void plus() {
        result_int = romes_value1_int + romes_value2_int;
        result_string = convertResultationToRoman(result_int, result_int);

    }

    public void minus() {
        result_int = romes_value1_int - romes_value2_int;
        result_string = convertResultationToRoman(result_int, result_int);

    }

    public void multi() {
        result_int = romes_value1_int * romes_value2_int;
        result_string = convertResultationToRoman(result_int, result_int);

    }

    public void divide() {
        try {


            result_int = romes_value1_int / romes_value2_int;
            result_string = convertResultationToRoman(result_int, result_int);
        } catch (ArithmeticException e) {
            System.out.println("ОПЯТЬ НА НОЛЬ ДЕЛИШЬ ШАКАААААААААЛ?");
        }
    }

    public int getResult() {
        return result_int;
    }

    public String getStringResult() {
        return result_string;
    }

    //Алярм,ниже идет WET,просьба приготовиться.
// Я знаю,что это можно реализовать короче,но пока что не смог.
    public int ConvertToInt_for_value1(String value1) {
        try {

            if (romes_value1.equals(roman_numbers[1])) {
                romes_value1 = "1";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[2])) {
                romes_value1 = "2";
                romes_value1_int = Integer.parseInt(romes_value1);

            } else if (romes_value1.equals(roman_numbers[3])) {
                romes_value1 = "3";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[4])) {
                romes_value1 = "4";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[5])) {
                romes_value1 = "5";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[6])) {
                romes_value1 = "6";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[7])) {
                romes_value1 = "7";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[8])) {
                romes_value1 = "8";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[9])) {
                romes_value1 = "9";
                romes_value1_int = Integer.parseInt(romes_value1);
            } else if (romes_value1.equals(roman_numbers[10])) {

                romes_value1 = "10";
                romes_value1_int = Integer.parseInt(romes_value1);
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Дружочек-пирожочек,ты ввел перое число больше 10,не так ли?");
        }
        return romes_value1_int;
    }


    public int ConvertToInt_for_value2(String romes_value2) {
        try {

            if (romes_value2.equals(roman_numbers[1])) {
                romes_value2 = "1";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[2])) {
                romes_value2 = "2";
                romes_value2_int = Integer.parseInt(romes_value2);

            } else if (romes_value2.equals(roman_numbers[3])) {
                romes_value2 = "3";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[4])) {
                romes_value2 = "4";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[5])) {
                romes_value2 = "5";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[6])) {
                romes_value2 = "6";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[7])) {
                romes_value2 = "7";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[8])) {
                romes_value2 = "8";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[9])) {
                romes_value2 = "9";
                romes_value2_int = Integer.parseInt(romes_value2);
            } else if (romes_value2.equals(roman_numbers[10])) {

                romes_value2 = "10";
                romes_value2_int = Integer.parseInt(romes_value2);
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Дружочек-пирожочек,ты ввел второе число больше 10,не так ли?");
        }
        return romes_value2_int;


    }

    public String getter_romes_value1() {
        return romes_value1;
    }

    public String getter_romes_value2() {
        return romes_value2;
    }

    public String getRomes_value1() {
        return romes_value1;
    }

    public String getRomes_value2() {
        return romes_value2;
    }

    public void setRomes_value1(String romes_value1) {
        this.romes_value1 = romes_value1;
    }

    public void setRomes_value2(String romes_value2) {
        this.romes_value2 = romes_value2;
    }

    public int getRomes_value1_int() {
        return romes_value1_int;
    }

    public int getRomes_value2_int() {
        return romes_value2_int;
    }

    public void setRomes_value1_int(int romes_value1_int) {
        this.romes_value1_int = romes_value1_int;
    }

    public void setRomes_value2_int(int romes_value2_int) {
        this.romes_value2_int = romes_value2_int;
    }

    //Пояснение к коду ниже:метод в лоб сравнивает и возвращает римское число(ответ).
    public String Convert_To_Roman() {
        if (result_int == 1) {
            result_string = "I";
        } else if (result_int == 2) {
            result_string = "II";
        } else if (result_int == 3) {
            result_string = "III";

        } else if (result_int == 4) {
            result_string = "IV";
        } else if (result_int == 5) {
            result_string = "V";
        } else if (result_int == 6) {
            result_string = "VI";
        } else if (result_int == 7) {
            result_string = "VII";
        } else if (result_int == 8) {
            result_string = "VIII";
        } else if (result_int == 9) {
            result_string = "IX";
        } else if (result_int == 10) {
            result_string = "X";
        } else if (result_int == 11) {
            result_string = "XI";
        } else if (result_int == 12) {
            result_string = "XII";
        } else if (result_int == 13) {
            result_string = "XIII";
        } else if (result_int == 14) {
            result_string = "XIV";
        } else if (result_int == 15) {
            result_string = "XV";
        } else if (result_int == 16) {
            result_string = "XVI";
        } else if (result_int == 17) {
            result_string = "XVII";
        } else if (result_int == 18) {
            result_string = "XVIII";
        } else if (result_int == 19) {
            result_string = "XIX";
        } else if (result_int == 20) {
            result_string = "XX";
        } else if (result_int == 21) {
            result_string = "XXI";
        } else if (result_int == 22) {
            result_string = "XXII";
        } else if (result_int == 23) {
            result_string = "XXIII";
        } else if (result_int == 24) {
            result_string = "XXIV";
        } else if (result_int == 25) {
            result_string = "XXV";
        } else if (result_int == 26) {
            result_string = "XXVI";
        } else if (result_int == 27) {
            result_string = "XXVII";
        } else if (result_int == 28) {
            result_string = "XXVIII";
        } else if (result_int == 29) {
            result_string = "XXIX";
        } else if (result_int == 30) {
            result_string = "XXX";
        } else if (result_int == 31) {
            result_string = "XXXI";
        } else if (result_int == 32) {
            result_string = "XXXII";
        } else if (result_int == 33) {
            result_string = "XXXIII";
        } else if (result_int == 34) {
            result_string = "XXXIV";
        } else if (result_int == 35) {
            result_string = "XXXV";
        } else if (result_int == 36) {
            result_string = "XXXVI";
        } else if (result_int == 37) {
            result_string = "XXXVII";
        } else if (result_int == 38) {
            result_string = "XXXVIII";
        } else if (result_int == 39) {
            result_string = "XXXIX";
        } else if (result_int == 40) {
            result_string = "XL";
        } else if (result_int == 41) {
            result_string = "XLI";
        } else if (result_int == 42) {
            result_string = "XLII";
        } else if (result_int == 43) {
            result_string = "XLIII";
        } else if (result_int == 44) {
            result_string = "XLIV";
        } else if (result_int == 45) {
            result_string = "XLV";
        } else if (result_int == 46) {
            result_string = "XLVI";
        } else if (result_int == 47) {
            result_string = "XLVII";
        } else if (result_int == 48) {
            result_string = "XLVIII";
        } else if (result_int == 49) {
            result_string = "XLIX";
        } else if (result_int == 50) {
            result_string = "L";
        } else if (result_int == 51) {
            result_string = "LI";
        } else if (result_int == 52) {
            result_string = "LII";
        } else if (result_int == 53) {
            result_string = "LIII";
        } else if (result_int == 54) {
            result_string = "LIV";
        } else if (result_int == 55) {
            result_string = "LV";
        } else if (result_int == 56) {
            result_string = "LVI";
        } else if (result_int == 57) {
            result_string = "LVII";
        } else if (result_int == 58) {
            result_string = "LVIII";
        } else if (result_int == 59) {
            result_string = "LIX";
        } else if (result_int == 60) {
            result_string = "LX";
        } else if (result_int == 61) {
            result_string = "LXI";
        } else if (result_int == 62) {
            result_string = "LXII";
        } else if (result_int == 63) {
            result_string = "LXIII";
        } else if (result_int == 64) {
            result_string = "LXIV";
        } else if (result_int == 65) {
            result_string = "LXV";
        } else if (result_int == 66) {
            result_string = "LXVI";
        } else if (result_int == 67) {
            result_string = "LXVII";
        } else if (result_int == 68) {
            result_string = "LXVIII";
        } else if (result_int == 69) {
            result_string = "LXIX";
        } else if (result_int == 70) {
            result_string = "LXX";
        } else if (result_int == 71) {
            result_string = "LXXI";
        } else if (result_int == 72) {
            result_string = "LXXII";
        } else if (result_int == 73) {
            result_string = "LXXIII";
        } else if (result_int == 74) {
            result_string = "LXXIVV";
        } else if (result_int == 75) {
            result_string = "LXXV";
        } else if (result_int == 76) {
            result_string = "LXXVI";
        } else if (result_int == 77) {
            result_string = "LXXVII";
        } else if (result_int == 78) {
            result_string = "LXXVIII";
        } else if (result_int == 79) {
            result_string = "LXXIX";
        } else if (result_int == 80) {
            result_string = "LXXX";
        } else if (result_int == 81) {
            result_string = "LXXXI";
        } else if (result_int == 82) {
            result_string = "LXXXII";
        } else if (result_int == 83) {
            result_string = "LXXXIII";
        } else if (result_int == 84) {
            result_string = "LXXXIV";
        } else if (result_int == 85) {
            result_string = "LXXXV";
        } else if (result_int == 86) {
            result_string = "LXXXVI";
        } else if (result_int == 87) {
            result_string = "LXXXVII";
        } else if (result_int == 88) {
            result_string = "LXXXVIII";
        } else if (result_int == 89) {
            result_string = "LXXXIX";
        } else if (result_int == 90) {
            result_string = "XC";
        } else if (result_int == 91) {
            result_string = "XCI";
        } else if (result_int == 92) {
            result_string = "XCII";
        } else if (result_int == 93) {
            result_string = "XCIII";
        } else if (result_int == 94) {
            result_string = "XCIV";
        } else if (result_int == 95) {
            result_string = "XCV";
        } else if (result_int == 96) {
            result_string = "XCVI";
        } else if (result_int == 97) {
            result_string = "XCVII";
        } else if (result_int == 98) {
            result_string = "XCVIII";
        } else if (result_int == 99) {
            result_string = "XCIX";
        } else if (result_int == 100) {
            result_string = "C";
        } else if (result_int == 0) {
            result_string = "0";
        }


        return result_string;
    }
}


