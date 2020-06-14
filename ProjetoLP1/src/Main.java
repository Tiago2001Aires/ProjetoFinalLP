import java.util.Scanner;
public class Main {
public static Scanner ler = new Scanner(System.in);
private NoBinTree ramos;

        public static void main(String[] args) {
            String resposta;
            BinSearchTree teste = new BinSearchTree();
            String opcao;
            teste.inserir("50","123",true);
            teste.inserir("Voce pensou num animal?",false);
            teste.inserir("É uma pessoa famosa?",true);
            teste.inserir("É uma pessoa presente nas redes sociais?",true);
            teste.inserir("Tem cabelo",true);
            teste.inserir("Tem cabelo escuro",true);
            teste.inserir("Tem olhos escuros",true);
            teste.inserir("Usa oculos",true);
            teste.inserir("É mulher",true);
            teste.inserir("Faz parte do mundo da televisão",true);
            teste.inserir("Tem algum animal",true);
            teste.inserir("Participou de uma serie muito conhecida?",true);

     //   System.out.println(teste.inserir());

            boolean sn;

            public void menu{
                do {
                    System.out.println("Tem de responder as perguntas com :");
                    System.out.println("1 para sim");
                    System.out.println("0 para nao");
                    resposta =ler.nextLine();

                    switch(resposta){

                    }

                };

    }
}
