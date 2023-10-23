import java.util.NoSuchElementException;

public class Arvore <TIPO extends Comparable> {

    private Elemento<TIPO> raiz;
    
    public Arvore() {
        this.raiz = null;
    }

    public void adicionar(TIPO valor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        if (raiz == null) {
            this.raiz = novoElemento;
        } else {
            Elemento<TIPO> atual = this.raiz;
            while(true) {
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                } else { // se for maior ou igual
                    if(atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }


    public int getRoot() {
            if (this.raiz == null) {
        throw new NoSuchElementException("A árvore está vazia.");
        } else 
        return (int) this.raiz.getValor();
    }

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } return false;
    }


    public boolean remover(TIPO valor) {
        // Primeiro, buscar o elemento na arvore para ver se existe
        Elemento<TIPO> atual = this.raiz;
        Elemento<TIPO> paiAtual = null;
        while(atual != null) {
            if(atual.getValor().equals(valor)) {
                break;  
            } else if(valor.compareTo(atual.getValor()) == -1) { // valor procurado é menor que o atual
                paiAtual = atual;
                atual = atual.getEsquerda(); 
            } else {
                paiAtual = atual;
                atual = atual.getDireita();
            }
        } 
        // verificar se existe o elemento
        if (atual != null) {

            if (atual.getDireita() != null && atual.getEsquerda() != null) { // elemento tem dois filhos

            } else if (atual.getDireita() != null) { // tem filhos só a direita

            } else if (atual.getEsquerda() != null) { // tem filhos só a esquerda

            } else { // não tem nenhum filho
                if (atual.getValor().compareTo(paiAtual.getValor() == 1)) { // atual > paiAtual
                    paiAtual.setDireita(null);
                } else {
                    
                }
            }

            return true;
        } else {
            return false;

        }

    }

}

