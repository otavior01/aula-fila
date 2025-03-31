
public class Main {

    public static void main(String[] args) {

        Fila lista = new Fila();
        lista.mostra();

        Nodo novoNodo = new Nodo(10);
        lista.enqueue(novoNodo);

        novoNodo = new Nodo(9);
        lista.enqueue(novoNodo);

        lista.mostra();
        novoNodo = new Nodo(8);
        lista.enqueue(novoNodo);

        novoNodo = new Nodo(7);
        lista.enqueue(novoNodo);

        novoNodo = new Nodo(6);
        lista.enqueue(novoNodo);

        novoNodo = new Nodo(5);
        lista.enqueue(novoNodo);


        lista.mostra();
        lista.dequeue();
        lista.dequeue();
        lista.dequeue();
        lista.mostra();
                
        Fila lista2 = new Fila();
        lista2.mostra();
    
    
    }
}
