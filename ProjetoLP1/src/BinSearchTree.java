import java.util.Scanner;
public class BinSearchTree {
    public NoBinTree pai;
    Scanner ler = new Scanner(System.in);


    public void inserir(int numero, NoBinTree pai, String frase) {
        pai = null;
        if (pai.getValor() > numero) {
            if (pai.getFilhoEsquerda() == null) {
                NoBinTree classe = new NoBinTree(numero,frase);
                pai.setFilhoEsquerda(classe);
            } else {
                inserir(numero, pai.getFilhoEsquerda(), frase);
            }
        } else if (pai.getValor() < numero) {
            if (pai.getFilhoDireita() == null) {
                NoBinTree classe = new NoBinTree(numero,frase);
                pai.setFilhoDireita(classe);
            } else {
                inserir(numero, pai.getFilhoDireita(), frase);
            }
        }

    }


    public void inserir(int numero, String frase, boolean b) {

        if (pai == null) {
            NoBinTree classe = new NoBinTree(numero, frase);
            pai = classe;
        } else
            inserir(numero, pai, frase);
    }


    public NoBinTree procurar(String numero) {

        if (pai == null) {
            return null;
        } else
            return procurar(numero, pai);

    }



    public NoBinTree procurar(String num, NoBinTree pai) {
        System.out.println("Insira a sua resposta com sim ou nao");
        String resposta = ler.next();
        if (resposta == "sim"){
            procurar(pai.getFilhoEsquerda());
        }else if (resposta == "nao"){
            procurar(pai.getFilhoDireita());
        }
        if (pai == null){
            return null;
        }else{
            if (pai.getFilhoEsquerda().equals(num)){
                return procurar(num, pai.getFilhoEsquerda());
            }else if (pai.getFilhoDireita().equals(num)){
                return procurar(num, pai.getFilhoDireita());
            }else{
                System.out.println(pai.getValor().equals(num));
            }
            return pai;
        }

    }public String inOrdem() {
        if (pai == null) {
            return "arvore vazia";
        }

        return inOrdem(pai);
    }

    public String inOrdem(NoBinTree pai) {
        String retorno = "";

        if(pai.getFilhoEsquerda() != null) {
            retorno += inOrdem(pai.getFilhoEsquerda());
        }

        retorno += pai.getValor() + " ";

        if(pai.getFilhoDireita() != null) {
            retorno += inOrdem(pai.getFilhoDireita());
        }

        return retorno;
    }

}
