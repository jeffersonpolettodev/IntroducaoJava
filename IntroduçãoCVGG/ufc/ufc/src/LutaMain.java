
    
    public class LutaMain {
    
        public static void main(String[] args) {
            
            Lutador lutador[] = new Lutador[6];
            
            lutador[0] = new Lutador("Ryu", "Brasil", 31, 1.75, 70.0, 8, 6, 2);
            lutador[0].apresentar();
            lutador[0].status();
            
            lutador[1] = new Lutador("Ken", "Japão", 29, 1.79, 65.0, 11, 1, 5);
            lutador[1].apresentar();
            lutador[1].status();

            lutador[2] = new Lutador("Guile", "Brasil", 28, 1.63, 81.0, 14, 2, 1);
            lutador[2].apresentar();
            lutador[2].status();

            lutador[3] = new Lutador("Dhalsim", "Brasil", 29, 1.75, 110.0, 12, 2, 1);
            lutador[3].apresentar();
            lutador[3].status();

            lutador[4] = new Lutador("Zangief", "Alemanha", 32, 1.82, 95.0, 22, 7, 0);
            lutador[4].apresentar();
            lutador[4].status();

            lutador[5] = new Lutador("Deejay", "Brasil", 41, 1.70, 60.0, 14, 2, 1);
            lutador[5].apresentar();
            lutador[5].status();

            lutador[5].ganharLuta();
            lutador[5].apresentar();
            lutador[5].status();

            lutador[4].empatarLuta();
            lutador[4].apresentar();
            lutador[4].status();
        }
    } // end of class Luta
    
