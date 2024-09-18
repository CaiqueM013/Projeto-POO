public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    
    /*public Veiculo(String marca, String modelo, int ano, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
       return velocidadeAtual;

    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        }else{
            System.out.println("Valor invalido");
        }
    }

    public void acelerar(){
        System.out.println("Veiculo acelerando");
    }
    
    public void frear(){
        System.out.println("Veiculo freiano");
    }

    public void abastecer(String combustivel){
        System.out.println("Veiculo abastecido com " + combustivel);
    }

    public void abastecer(String combustivel, double quantidadeCombustivel){
        System.out.println("Veiculo abastecido com " + quantidadeCombustivel + "L" + " de " + combustivel);
    }
}
