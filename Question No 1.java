import java.util.Scanner;
public class Question 1 {
public static void main (String[] args) {
    Scanner sc = Scanner(System.in);
    double obtained;
    double total;
    double percentage;

    System.out.print("Enter Obtained Marks:");
    obtained = sc.next ();

    System.out.print("Enter total Marks:");
    total = sc.next ();

    percentage = (obtained/total) * 100;

    System.out.print("Percentage = " + percentage);
    sc.close ();

}
}