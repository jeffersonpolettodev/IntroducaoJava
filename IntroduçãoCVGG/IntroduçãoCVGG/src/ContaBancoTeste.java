public class ContaBancoTeste {

    public static void main(String[] args) {
        
        //ContaBanco cliente1 = new ContaBanco();
        //cliente1.setNumConta(11111111);
        //cliente1.setDono("João");
        //cliente1.abrirConta("CC");
        //cliente1.depositar(100);
        //cliente1.estadoAtual();

        ContaBanco cliente2 = new ContaBanco();
        cliente2.estadoAtual();
        cliente2.setNumConta(22222222);
        cliente2.estadoAtual();

        cliente2.setDono("Maria");
        cliente2.estadoAtual();

        cliente2.abrirConta("CP");
        cliente2.estadoAtual();

        cliente2.depositar(500);
        cliente2.estadoAtual();

        cliente2.sacar(200);
        cliente2.estadoAtual();

        cliente2.sacar(1021);
        cliente2.estadoAtual();


    } // end of main

} // end of class ContaBancoTeste

