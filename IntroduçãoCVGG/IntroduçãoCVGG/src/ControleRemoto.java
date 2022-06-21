
public class ControleRemoto implements Controlador{
    
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // metodos especiais Construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando(){
        return tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    // implementando todos todos os metodos abstratos
    @Override  // comando para sobreescrever o metodos abstratos
    public void ligar(){
        // exceção
        // throw new UnsupportedOperationException("Not supported yet.");
        this.setLigado(true);
    } // end ligar()

    @Override  // comando para sobreescrever o metodos abstratos
    public void desligar(){
        this.setLigado(false);
    } // end desligar()

    @Override  // comando para sobreescrever o metodos abstratos
    public void abrirMenu(){
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Esta tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        // imprimir as barrinha do volume
        for ( int i = 0; i <= this.getVolume(); i += 10){
            System.out.println("|");
        }
    } // end abrirMenu()

    @Override  // comando para sobreescrever o metodos abstratos
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    } // end fecharMenu()

    @Override  // comando para sobreescrever o metodos abstratos
    public void maisVolume(){
        if (this.isLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }
    } // end maisVolume()

    @Override  // comando para sobreescrever o metodos abstratos
    public void menosVolume(){
        if ( this.isLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }
    } // end menosVolume()

    @Override  // comando para sobreescrever o metodos abstratos
    public void ligarMudo(){
        if ( this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    } // end ligarMudo()

    @Override  // comando para sobreescrever o metodos abstratos
    public void desligarMudo(){
        if ( this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    } // end desligarMudo()

    @Override  // comando para sobreescrever o metodos abstratos
    public void play(){
        if (this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }

    } // end play()

    @Override  // comando para sobreescrever o metodos abstratos
    public void pause(){
        if ( this.isLigado() && (this.isTocando())){
            this.setTocando(false);
        }
    }

} // end of class ControleRemoto
