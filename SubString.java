import java.util.Scanner;
public class SubString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        String name1 = name.substring(7);
        System.out.println("Substring is : "+name1);
        // You can change the beginIndex.
    }
}