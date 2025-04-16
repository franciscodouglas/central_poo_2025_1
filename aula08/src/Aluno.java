public class Aluno{
    private String nome, dataNascimento, curso, semestre;
    private int ra;
    private boolean situacao; //ou status

    //não permite construtores iguais, inclusive no tipo de dado do parâmetro
    
    
    //construtor vazio
    public Aluno (){
        
    }

    //construtor para todos os atributos
    public Aluno(String nome, String dataNascimento, String curso, String semestre,
    int ra, boolean situacao){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.curso=curso;
        this.semestre=semestre;
        this.ra=ra;
        this.situacao=situacao;
    }
    //construtor dinâmico: com 1 e 2 parametro em String
    public Aluno (String nome, String curso){
        this.nome=nome;
        this.curso=curso;
    }
    // erro pois é igual ao seus tipos de parametros
    // public Aluno(String dataNascimento, String Semestre){

    // }

    public Aluno (String nome, boolean situacao){
        this.nome=nome;
        this.situacao=situacao;
    }

    public Aluno (String nome, int ra){
        this.nome=nome;
        this.ra=ra;
    }

    public Aluno (int ra, String curso){
        this.ra=ra;
        this.curso=curso;
    }

    
    public Aluno (int ra, String curso, String semestre){
        this.ra=ra;
        this.curso=curso;
        this.curso=semestre;
    }

}