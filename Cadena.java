public class Cadena {
    public static String cadenainversa(String saludo){
        if (saludo == null || saludo.length() <= 1) {
            return saludo;
        }else{
            String primerCaracter = saludo.substring(0, 1);
            String restoCadena = saludo.substring(1);
            
            return cadenainversa(restoCadena) + primerCaracter;
        }  
        
    }

    //invertir("hola") → aloh
    public static void main(String[] args) {
        String original = "Hola";
        System.out.println(cadenainversa(original));

    }
}
