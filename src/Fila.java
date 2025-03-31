
public class Fila {

    private Nodo fila;
    private Nodo tail;
    private int numeroElementos;

    public Fila() {
        this.fila = null;
        this.numeroElementos = 0;
    }

    public Nodo getFila() {
        return fila;
    }

    public void getFila(Nodo lista) {
        this.fila = lista;
    }

    public void enqueue(Nodo novoNodo) {
        if (ehVazia()) {
            this.fila = novoNodo;
            this.tail = novoNodo;
        } else {
            novoNodo.setProx(this.fila);
            this.fila = novoNodo;
            this.tail = novoNodo;            
        }
        this.numeroElementos++;
    }
    
    public void dequeue() {
        if (ehVazia()) {
            System.out.println("Fila vazia");
        } else {
            if (this.numeroElementos == 1) {
                this.fila = null;
            } else {
                Nodo temp = this.tail;
                Nodo anterior = this.fila;
                while (temp.getProx() != null) {
                    anterior = temp;
                    temp = temp.getProx();
                }
                anterior.setProx(null);
            }
            this.numeroElementos--;
        }
    }

    public void mostra() {
        if (ehVazia()) {
            System.out.println("Head -> null <- Tail");
        } else {
            Nodo temp = this.fila;
            System.out.print("Head -> " + temp.getValor());
            while (temp.getProx() != null) {
                temp = temp.getProx();
                System.out.print(" -> " + temp.getValor());
            }
            System.out.println(" <- Tail");
        }
    }

    public boolean ehVazia() {
        return this.fila == null;
    }

    public Nodo acesso(int posicao) {
        if (ehVazia()) {
            System.out.println("Fila vazia!");
            return null;
        }
        if (posicao > this.numeroElementos) {
            System.out.println("Posicao invalida!");
            return null;
        } else {
            Nodo temp = this.fila;
            for (int i = 0; i < this.numeroElementos; i++) {
                if (i == posicao) {
                    break;
                } else {
                    temp = temp.getProx();
                }
            }
            return temp;
        }
    }
}
