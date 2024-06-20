package EstructuraDatos;

public class Arbol implements EstrcturaD{

    private Nodo raiz;

    public Arbol(int valor){
        this.raiz = new Nodo(valor);
    }




    @Override
    public boolean agregar(int valor) {
        if (raiz == null){
            raiz = new Nodo(valor);
            return true;
        }
        if (raiz.getValor() == valor)
            return false;

        return false;
    }
}
