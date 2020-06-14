public class BinSearchTree {
    public NoBinTree raiz;


    private void inserir(String num, NoBinTree pai, boolean pergunta) {
        NoBinTree classe = new NoBinTree(num);
        if (pergunta == true) {
            if (pai.getFilhoEsquerda() == null) {
                pai.setFilhoEsquerda(classe);
            } else {
                inserir(num, pai.getFilhoEsquerda(), pergunta);
            }
        } else if (pergunta == false) {
            if (pai.getFilhoDireita() == null) {
                pai.setFilhoDireita(classe);
            } else {
                inserir(num, pai.getFilhoDireita(), pergunta);
            }
        }

    }


    public void inserir(String num, boolean classo) {

        if (raiz == null) {
            NoBinTree novo = new NoBinTree(num);
            raiz = novo;
        } else
            inserir(num, raiz, classo);
    }


    public NoBinTree procurar(String num) {

        if (raiz == null) {
            return null;
        } else
            return procurar(num, raiz);

    }



    public NoBinTree procurar(String num, NoBinTree no) {
    if (no == null){
        return null;
    }else{
        if (no.getFilhoEsquerda().equals(num)){
            return procurar(num, raiz.getFilhoEsquerda());
        }else if (no.getFilhoDireita().equals(num)){
            return procurar(num, no.getFilhoDireita());
        }else{
            System.out.println(no.getValor().equals(num));
    }
    return no;
    }

    }public String inOrdem() {
        if (raiz == null) {
            return "arvore vazia";
        }

        return inOrdem(raiz);
    }

    public String inOrdem(NoBinTree no) {
        String retorno = "";

        if(no.getFilhoEsquerda() != null) {
            retorno += inOrdem(no.getFilhoEsquerda());
        }

        retorno += no.getValor() + " ";

        if(no.getFilhoDireita() != null) {
            retorno += inOrdem(no.getFilhoDireita());
        }

        return retorno;
    }

}
