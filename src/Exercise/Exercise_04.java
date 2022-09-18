package Exercise;
/*
Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący szyfr cezara (pl.wikipedia.org/wiki/Szyfr_Cezara)

Tekst jawny: MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG
Tekst zaszyfrowany: OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ

Alfabet: AĄBCĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŹŻ
  Szyfr: CĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŹŻAĄB
 */


import java.util.Properties;

public class Exercise_04 {

    public static void main(String[] args) {

        System.out.println(encrypt("BANAN", 3));

    }

//    public static String encrypt1(String text, int offset) {
//        char[] chars = text.toCharArray();
//        StringBuilder result = new StringBuilder();
//
//
//        return String.valueOf(result);
//    }

    public static String encrypt(String text, int offset){

        char[] alphCharArr = ("AĄBCĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŹŻ").toCharArray(); //długość 32 znaki
        //                     0123456789
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()){
            if (character != ' '){
                result.append(alphCharArr[(charPos(character, alphCharArr) + offset) % 32]);
            }

        }
        return String.valueOf(result);
    }

    public static int charPos(char character, char[] arrayChar){
        for (int i = 0; i < arrayChar.length; i++) {
            if (character == arrayChar[i])
                return i;
        }
        return 0;
    }





}
