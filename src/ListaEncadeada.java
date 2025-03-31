
public class ListaEncadeada {

    private Nodo lista;
    private int numeroElementos;

    public ListaEncadeada() {
        this.lista = null;
        this.numeroElementos = 0;
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }

    public Nodo getLista() {
        return lista;
    }

    public void setLista(Nodo lista) {
        this.lista = lista;
    }

    public void inserirInicio(Nodo novoNodo) {
        if (ehVazia()) {
            this.lista = novoNodo;
        } else {
            novoNodo.setProx(this.lista);
            this.lista = novoNodo;
        }
        this.numeroElementos++;
    }

    public void inserirFim(Nodo novoNodo) {
        if (ehVazia()) {
            this.lista = novoNodo;
        } else {
            Nodo temp = this.lista;
            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novoNodo);
        }
        this.numeroElementos++;
    }

    public void removerInicio() {
        if (ehVazia()) {
            System.out.println("Lista vazia");
        } else {
            this.lista = this.lista.getProx();
            this.numeroElementos--;
        }

    }

    public void removerFim() {
        if (ehVazia()) {
            System.out.println("Lista vazia");
        } else {
            if (this.numeroElementos == 1) {
                this.lista = null;
            } else {
                Nodo temp = this.lista;
                Nodo anterior = this.lista;
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
            System.out.println("Lista -> null");
        } else {
            Nodo temp = this.lista;
            System.out.print("Lista -> " + temp.getValor());
            while (temp.getProx() != null) {
                temp = temp.getProx();
                System.out.print(" -> " + temp.getValor());
            }
            System.out.println(" -> null");
        }
    }

    public boolean ehVazia() {
        return this.lista == null;
    }

    public Nodo acesso(int posicao) {
        if (ehVazia()) {
            System.out.println("Lista vazia!");
            return null;
        }
        if (posicao > this.numeroElementos) {
            System.out.println("Posicao invalida!");
            return null;
        } else {
            Nodo temp = this.lista;
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
