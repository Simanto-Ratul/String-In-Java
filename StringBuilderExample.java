import java.util.*;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Simanto");
        System.out.println(sb);

        // Char at index 2
        System.out.println(sb.charAt(2));

        // set char at index 0
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        // insert char at index 7
        sb.insert(7, 'S');
        System.out.println(sb);
    }
}
