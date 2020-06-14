public class NoBinTree {

        private int valor;
        private String frase;
        private NoBinTree filhoEsquerda;
        private NoBinTree filhoDireita;
        private boolean resposta;

        // Acessores
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public String getFrase() {
        return frase;
    }
        public void setFrase(String frase) {this.frase = frase; }
        public NoBinTree getFilhoEsquerda() {
            return filhoEsquerda;
        }
        public void setFilhoEsquerda(NoBinTree filhoEsquerda) {
            this.filhoEsquerda = filhoEsquerda;
        }
        public NoBinTree getFilhoDireita() {
            return filhoDireita;
        }
        public void setFilhoDireita(NoBinTree filhoDireita) {
            this.filhoDireita = filhoDireita;
        }
        public boolean isResposta() { return resposta; }
        public void setResposta(boolean resposta) { this.resposta = resposta; }

    // Construtores
        public NoBinTree(int valor, String frase) {
            this.valor = valor;
            this.frase=frase;
            this.filhoEsquerda = null;
            this.filhoDireita = null;
        }

        // Override toString
        @Override
        public String toString() {
            return String.format("[%d , %s, %s ] ",  this.valor, this.filhoEsquerda, this.filhoDireita );
        }


    }


