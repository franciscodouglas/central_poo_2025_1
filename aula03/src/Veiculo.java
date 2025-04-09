public class Veiculo {
    public String modelo;
    public String descricaoVeiculo;
    String marca; //Public
    // String marca; Ele não permiti repetir os nomes dos atributos
    public int velocidade =0; //não é comum inicializar valores
    private float capacidaTanque;
    private float quantidadePortas;
    private boolean status;
    private char cor;


    public String buzinar(){
        String buzina = "Bi-bi";
        return buzina;        
    }

    public void acelerar(int valor){
        velocidade = velocidade + valor;
    }
}
