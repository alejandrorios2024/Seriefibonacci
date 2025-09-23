import java.util.Stack;

class Historial{
    Stack<String> accion;
    Stack<String> rehacer;

    public Historial(){
        accion = new Stack<>();
        rehacer = new Stack<>();
    }
    
    public void hacer(String accion) {
        this.accion.push(accion);
    }
    
    public String deshacer(){
        try {
        String ultima = accion.pop();
        rehacer.push(ultima);
        return ultima;
        }catch(Exception e){
            return "nada que hacer";
        }
    }

    public String rehacer(){
        try{
            String ultima = rehacer.pop();
            accion.push(ultima);
            return ultima;

        }catch(Exception e){
            return "nada que hacer";
        }
    }

    

    public void imprimir(){
        System.out.println("acciones" +accion);
    }

    
}

public class Simulador {
    public static void main(String[] args) {
        Historial h = new Historial();
        h.hacer("hola");
        h.hacer("borrar palabra");
        h.hacer("mundo");
        h.imprimir();
    
        System.out.println("se deshizo " +h.deshacer());
        System.out.println("se deshizo " +h.deshacer());
       
        System.out.println("se rehizo " +h.rehacer());

        h.imprimir();
        
    }
    
}
