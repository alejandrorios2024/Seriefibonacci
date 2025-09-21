public class Potenciar {

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int base = 2;       // mi numero base
        int exponente = 5;  // mi potencia

        int resultado = potencia(base, exponente);

        System.out.println("El resultado de " + base + " elevado a la " 
                           + exponente + " es: " + resultado);
    }
}
