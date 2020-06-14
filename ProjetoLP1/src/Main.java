import java.util.Scanner;
public class Main {
public static Scanner ler = new Scanner(System.in);
private NoBinTree ramos;

/*Devido a ser um tema muito vago somente funciona com as seguintes celebridades:
Selena Gomez; Kathetrine McNamara; Cristiano Ronaldo; Ozuna.
 */

        public static void main(String[] args) {
            String resposta;
            BinSearchTree teste = new BinSearchTree();
            String opcao;
            teste.inserir(50,"E uma pessoa?",true);
            teste.inserir(45,"E uma pessoa famosa?",true);
            teste.inserir(41,"Faz parte do mundo da musica?",true);
            teste.inserir(30,"E uma pessoa de cor escura?",true);
            teste.inserir(29,"Tem cabelo curto?",true);
            teste.inserir(28,"E um cantor espanhor?",true);
            teste.inserir(27,"E o Ozuna?",true);
            teste.inserir(26,"ACERTEI :) E o Ozuna!!",true);
            teste.inserir(39,"Tem cabelo",true);
            teste.inserir(38,"Cabelo de cor escura?",true);
            teste.inserir(37,"Tem cabelo longo",true);
            teste.inserir(36,"Tem olhos escuros?",true);
            teste.inserir(35,"E baixa",true);
            teste.inserir(34,"E uma mulher?",true);
            teste.inserir(33,"Gosta de animais?",true);
            teste.inserir(32,"Selena Gomez?",true);
            teste.inserir(31,"ACERTEI :) E a Selena Gomez!!",true);
//------------------------------------------------------------------------------------------------------------------------
            teste.inserir(60,"E um animal?",true);
            teste.inserir(80,"E uma pessoa presente nas redes sociais?",true);
            teste.inserir(79,"Usa oculos?",true);
            teste.inserir(78,"Participa em series?",true);
            teste.inserir(76,"Faz parte de uma grande plataforma televisiva?",true);
            teste.inserir(75,"Fez series que envolvam o mundo sobrenatural?",true);
            teste.inserir(68,"E a Katherine McNamara?",true);
            teste.inserir(67,"ACERTEI :) E a Katherine McNamara!!",true);
            teste.inserir(69,"E uma pessoa com uma atividade fisica ativa?",true);
            teste.inserir(66,"Faz desporto federado?",true);
            teste.inserir(65,"Joga por alguma selecao?",true);
            teste.inserir(64,"Ja ganhou muitos premios?",true);
            teste.inserir(63,"E o Cristiano Ronaldo?",true);
            teste.inserir(62,"ACERTEI :)  E o Cristiano Ronaldo!!",true);


     //  System.out.println(teste.inserir());

       /*     boolean sn;

            public void menu{
                do {
                    System.out.println("Tem de responder as perguntas com :");
                    System.out.println("1 para sim");
                    System.out.println("0 para nao");
                    resposta =ler.nextLine();

                    switch(resposta){

                    }

                };*/

    }
}
