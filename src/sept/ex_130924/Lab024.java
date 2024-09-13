package sept.ex_130924;

public class Lab024 {
    public static void main(String[] args) {
        // ✅ Literals
        // Boolean
        // Integral

        // Char
        //  Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Prasad"+ new_line +  "reddy");
        // System.out.println("Prasad"+ '\n' +  "reddy");
        System.out.println("Prasad"+ tab_line +  "reddy");
        System.out.println("Prasad"+ back_space +  "reddy");
        System.out.println("Prasad"+ car_r +  "reddy");

        char c11  = '\u1F60'; //65 - ASCII
        // chinese - india, japense -> unicode
        // /u09878

        System.out.println(c11); // ὠ - :)


    }
}
