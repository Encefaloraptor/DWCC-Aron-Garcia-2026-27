public class Ejemplo {
  public static int suma(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    int a = 2;
    int b = 3;

    System.out.printf("Voy a sumar %d y %s%n", a, b);
    System.out.println("deberia ser 5?");
    System.out.println(suma(a, b));
  }
}