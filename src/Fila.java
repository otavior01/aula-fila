
public class Fila extends ListaEncadeada{

    public void enqueue(Nodo novoNodo) {
        super.inserirFim(novoNodo);
    }
    
    public void dequeue() {
        super.removerInicio();
    }

    @Override
    public void mostra() {
        if (super.ehVazia()) {
            System.out.println("Head -> null <- Tail");
        } else {
            Nodo temp = super.getLista();
            System.out.print("Head -> " + temp.getValor());
            while (temp.getProx() != null) {
                temp = temp.getProx();
                System.out.print(" -> " + temp.getValor());
            }
            System.out.println(" <- Tail");
        }
    }

    @Override
    public Nodo acesso(int posicao) {
        if (super.ehVazia()) {
            System.out.println("Fila vazia!");
            return null;
        }
        if (posicao > super.getNumeroElementos()) {
            System.out.println("Posicao invalida!");
            return null;
        } else {
            Nodo temp = super.getLista();
            for (int i = 0; i < super.getNumeroElementos(); i++) {
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
