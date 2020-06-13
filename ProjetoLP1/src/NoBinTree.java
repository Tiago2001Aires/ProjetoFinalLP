public class NoBinTree {

        private String valor;
        private NoBinTree filhoEsquerda;
        private NoBinTree filhoDireita;

        // Acessores
        public String getValor() {
            return valor;
        }
        public void setValor(String valor) {
            this.valor = valor;
        }
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


        // Construtores
        public NoBinTree(String valor) {
            this.valor = valor;
            this.filhoEsquerda = null;
            this.filhoDireita = null;
        }

        // Override toString
        @Override
        public String toString() {
            return String.format("[%d , %s, %s ] ",  this.valor, this.filhoEsquerda, this.filhoDireita );
        }


    }


