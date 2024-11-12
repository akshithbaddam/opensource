import java.util.Scanner;
public class solution {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    inyt X = sc.nextInt();
    int Y = sc.nextInt();
    int totalDays = 7;
    int clearDays = totalDays - (X + Y);
    System.out.println(clearDays);
    sc.close();
  }
}
