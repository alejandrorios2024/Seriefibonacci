public class Recursiva {
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        int resultado = suma(5); 
        System.out.printf("La suma es: %d", resultado);
    }
}

