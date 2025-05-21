public class Professor {
    private String nome;
    private String cpf;
    private int rm;

    public Professor(String nome, int rm) {
        this.nome = nome;
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRm() {
        return rm;
    }
    public void setRm(int rm) {
        this.rm = rm;
    }

    public void exibir(){
        System.out.println("Nome: "+nome );
        System.out.println("RM: "+rm );
        System.out.println("CPF: "+cpf );
    }
 

    

    
}
