public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();
        carro1.acelerar();
        carro1.frear();
        carro1.abastecer("Gasolina");
        carro1.abastecer("Etanol", 2);

        System.out.println("_________________________");

        Motocicleta moto = new Motocicleta();
        moto.acelerar();
        moto.frear();
        moto.abastecer("Gasolina Aditivado");
        moto.abastecer("Gasolina", 5);

        System.out.println("_________________________");
        
        Veiculo veiculo = new Veiculo();
        veiculo.acelerar();
        veiculo.frear();
        veiculo.abastecer("Gas");
        veiculo.abastecer("Gasolina", 10);

    }
}
