
public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();
        fila.mostra();

       Nodo novo = new Nodo(10);
       fila.enqueue(novo);
       
       novo = new Nodo(10);
       fila.enqueue(novo);
       
       novo = new Nodo(10);
       fila.enqueue(novo);
       
       novo = new Nodo(10);
       fila.enqueue(novo);
       
       fila.mostra();
       
    
    }
}
