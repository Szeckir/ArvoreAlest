public class Main {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(5);
        arvore.adicionar(3);
        arvore.adicionar(15);

        System.out.println(arvore.getRoot());
    }
}
