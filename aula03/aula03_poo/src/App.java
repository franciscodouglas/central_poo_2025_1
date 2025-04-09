public class App {
    public static void main(String[] args) throws Exception {
        Veiculo gol = new Veiculo(); //criar um objeto. Nome do objeto é gol
        Veiculo palio = new Veiculo();
        //separar os objetos ou distinguir cada um. Misturar valores

        System.out.println( gol.buzinar());
        System.out.println( palio.buzinar());

        gol.acelerar(10);
        System.out.println(gol.velocidade);

        gol.acelerar(15);
        System.out.println(gol.velocidade);


        System.out.println(palio.velocidade);

    }
}
