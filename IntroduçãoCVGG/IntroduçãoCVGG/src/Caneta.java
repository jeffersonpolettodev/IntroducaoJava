

public class Caneta {

    // Atributos
    private String modelo;
    private String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    // metodo Construtor (contrutores não usam 'void')
    public Caneta(String modelo, String cor, double ponta) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.tampar();
    }

    // Métodos
    public void status(){
        System.out.println("Uma caneta de cor " + this.cor);
        System.out.println("Uma caneta do modelo " + this.modelo);
        System.out.println("Uma caneta com a ponta " + this.ponta);
        System.out.println("Uma caneta com a carga em " + this.carga +"%");
        System.out.println("Uma caneta está " + this.tampada);
    } //end status()

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getPonta(){
        return this.ponta;
    }
    public void setPonta(double ponta){
        this.ponta = ponta;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    private void rabiscar() {
        if (this.tampada == true){
            System.err.println("ERRO: Não posso rabiscar, a caneta está tampada!");
        } else {
            System.out.println("Estou rabiscando...");}
    } // end rabiscar()

    public void tampar(){
        this.tampada = true;
    } // end tampar()

    public void destampar(){
        this.tampada = false;
    } // end destampar()

}// end class Caneta 
