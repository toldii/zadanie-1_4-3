import java.util.Scanner;
class Main{
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("podaj bok a");
    double a = scan.nextInt();
       System.out.println("podaj wysokość h");
    double h = scan.nextInt();
    double x = 0.5;
    double wynik = x*a*h;
    System.out.println("pole trójkąta wynosi: " +  wynik);

  }
}
