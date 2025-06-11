public class App {
    public static void main(String[] args) throws Exception {
        Mensalista m1, m2;
        Horista h1, h2;

        m1 = new Mensalista("Junior", 10.0, "Francisco", "Masculino", "5x2");

        m1.calcularSalario();
        m1.calcularINSS();
        System.out.println(m1.salarioBruto);
        System.out.println(m1.salarioLiquido);
        System.out.println(m1.getJornada());

        h1 = new Horista("Pleno", 100.0, "Francisco", "Masculino");
        h1.calcularSalario();
        h1.calcularINSS();
        System.out.println(h1.salarioBruto);
        System.out.println(h1.salarioLiquido);

    }
}
