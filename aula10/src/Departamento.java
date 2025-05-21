import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nomeDepartamento;
    private int id;
    private List<Professor> professores;
    
    
    // Agregação não é obrigatório ter sua parte
    // Pode-se ter construtores vazios
    // Pode-se ter IF-ELSE para validações
    // Todo(Departamento)-Parte(Professores)
        // Professor pode existir sem Departamento
        // Departamento pode existir com nenhum ou vários Professores

    public Departamento(){
        this.professores = new ArrayList<>();
    }
    
    public Departamento(String nomeDepartamento, int id) {
        this.nomeDepartamento = nomeDepartamento;
        this.id = id;
        this.professores = new ArrayList<>();
        // this.professores = professores;
    }

    public void adicionarProfessor(Professor prof){
        professores.add(prof);

    }

    public void removerProfessor(Professor prof){
        professores.remove(prof);
    }

    public void listarProfessor(){
        for (Professor professor : professores) {
             professor.exibir();
        } 
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    
}
