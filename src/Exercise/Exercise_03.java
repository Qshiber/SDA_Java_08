package Exercise;

public class Exercise_03 {


    public static void main(String[] args) {

        String s = "test";
        System.out.println(convertCharArrToASCI(s));
        System.out.println(convertCharArrToASCI("Banan"));
        System.out.println(convertCharArrToASCI("Ananas"));

    }

    public static String convertCharArrToASCI(String c){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < c.length(); i++) {
            s.append((int)c.charAt(i) + ", ");
        }
        return String.valueOf(s);
    }


}
