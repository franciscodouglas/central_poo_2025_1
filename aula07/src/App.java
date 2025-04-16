public class App {
    public static void main(String[] args) throws Exception {
        // não foi-se realizado uma instância
        // a classe foi usada de maneira direta
        // Produto.cor = "Branca";
        // Produto.descricao = "Mesa";

        // System.out.println(Produto.cor);
        // System.out.println(Produto.descricao);

        // Produto.cor = "Laranja";
        // Produto.descricao = "Mesa";

        // System.out.println(Produto.cor);
        // System.out.println(Produto.descricao);

        // Produto p1 = new Produto();
        // p1.cor = "Roxo";
        // p1.descricao = "Mesa";

        // Produto p2 = new Produto();
        // p2.cor = "Vermelha";
        // p2.descricao = "Mesa";

        // System.out.println(p1.cor + " " + p2.cor);
        
        //exemplo de constante 
        final String teste = "Exemplo";

        // teste="Exemplo";
        // teste="Exemplo1";

        Pessoa p = new Pessoa("Francisco Douglas");

        System.out.println(p.getNome());

        Pessoa p1 = new Pessoa("Daisy Eboli");


    }

    public void conversao() {
        String st, st2;
        float real, real2;
        int n1, n2;

        // String para Double

        st = "12";
        st = "12" + "10";
        // conversão explicita (Casting)
        real = (float) (new Float(st).floatValue());
        real += 10;
        System.out.println("String para Float: " + real);

        // Double para String
        real2 = 10;
        st2 = "" + real; // ou
        // conversão explicita (Casting)
        st2 = new Float(real2).toString();
        System.out.println("Double para String: " + st2);

        // String para Int
        st2 = "10";
        // conversão explicita (Casting)
        n1 = Integer.parseInt(st2);
        System.out.println("String para int: " + n1);

        // Int para String
        n2 = 10;
        // conversão explicita (Casting)
        st2 = Integer.toString(n2);// ou

        // conversão implicita (Coersão)
        st2 = "" + n2;
        System.out.println("Int para String: " + st2);

    }
}
