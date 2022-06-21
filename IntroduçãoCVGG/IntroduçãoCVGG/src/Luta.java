public class Luta {
    
    public static void main(String[] args) {
        
        Lutador lutador1 = new Lutador("Ryu", "Brasil", 31, 1.75, 70.0, 0, 0, 0);
        lutador1.apresentar();
        
        lutador1.status();

        Lutador lutador2 = new Lutador("Ken", "Japão", 29, 1.75, 65.0, 0, 0, 0);
        lutador2.apresentar();
        lutador2.status();
    }
} // end of class Luta
