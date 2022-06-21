

public class Lutador {
    
        //atributos
        private String nome;
        private String nacionalidade;
        private int idade;
        private double altura;
        private double peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;
        
        //construtor
        public Lutador( String nome, String nacionalidade, int idade, double altura,
                        double peso, int vitorias, int derrotas, int empates         ){
            
            // nesseasrio atualizar a variavel peso pelo setPeso() para chamar o setCategoria()
            this.setPeso(peso);
            
            this.nome = nome;
            this.nacionalidade = nacionalidade;
            this.idade = idade;
            this.altura = altura;
            this.vitorias = vitorias;
            this.derrotas = derrotas;
            this.empates = empates;
        }
    
        // metodos publicos
        public void apresentar(){
            System.out.println("-----------------APRESENTAÇÃO----------------");
            System.out.println("Nome do lutador: " + this.getNome());
            System.out.println("Nacionalidade: " + this.getNacionalidade());
            System.out.println("Idade: " + this.getIdade());
            System.out.println("Altura: " + this.getAltura());
            System.out.println("Peso: " + this.getPeso());
            System.out.println("Vitorias: " + this.getVitorias()); 
            System.out.println("Derrotas: " + this.getDerrotas());
            System.out.println("Empates: " + this.getEmpates());
            System.out.println("");
        } // end apresentar()
    
        public void status(){
            System.out.println("-----------------STATUS----------------");
            System.out.println("Nome do lutador: " + this.getNome());
            System.out.println("Categoria: " + this.getCategoria());
            System.out.println("Vitorias: " + this.getVitorias());
            System.out.println("Derrotas: " + this.getDerrotas());
            System.out.println("Empates: " + this.getEmpates());
            System.out.println("");
        } // end status()
    
        public void ganharLuta(){
            this.setVitorias(this.getVitorias() + 1);
            // this.vitorias = this.vitorias + 1;
        }
    
        public void perderLuta(){
            this.setDerrotas(this.getDerrotas() +1 );
            // this.derrotas = this.derrotas + 1;
        }
    
        public void empatarLuta(){
            this.setEmpates(this.getEmpates() + 1);
            // this.empates = this.empates + 1;
        }
    
    
        // getters and setters 
        public int getEmpates() {
            return empates;
        }
        public void setEmpates(int empates) {
            this.empates = empates;
        }
        
        public int getDerrotas() {
            return derrotas;
        }
        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }
        
        public int getVitorias() {
            return vitorias;
        }
        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }
        
        // o setCatoria() será um meotdo interno, pois a categoria mudará automaticamente quando atualizar o peso
        public String getCategoria() {
            return categoria;
        }
        private void setCategoria() {
            if ( this.peso < 52.2){
                this.categoria = "Inválido";
            } else if (this.peso <= 70.3){
                this.categoria = "Leve"; 
            } else if (this.peso <= 83.9){
                this.categoria = "Médio";
            } else if (this.peso <= 120.2){
                this.categoria = "Pesado";
            } else {
                this.categoria = "Inválido";
            }
        }
        
        public double getPeso() {
            return peso;
        }
        public void setPeso(double peso) {
            this.peso = peso;
            this.setCategoria();
        }
        
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public String getNacionalidade() {
            return nacionalidade;
        }
        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }
        
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        
    
} // end of class Lutador