public class Empregado {
    protected String cargo;
    protected Double horasTrabalhada;
    protected String nome;
    protected String sexo;
    protected Double salarioBruto;
    protected Double salarioLiquido;


    public Empregado(String cargo, Double horasTrabalhada, String nome, String sexo ) {
        this.cargo = cargo;
        this.horasTrabalhada = horasTrabalhada;
        this.nome = nome;
        this.sexo = sexo;

    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Double getHorasTrabalhada() {
        return horasTrabalhada;
    }


    public void setHorasTrabalhada(Double horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public Double getSalarioBruto() {
        return salarioBruto;
    }


    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void calcularINSS(){
 
        if(salarioBruto<=1518){
            // salarioLiquido = salarioBruto-(salarioBruto*0.075);
            salarioLiquido =salarioBruto*0.925; 
        }else if(salarioBruto>1518 && salarioBruto<=2793){
            salarioLiquido=salarioBruto*0.91;
        }else if (salarioBruto>2793 && salarioBruto<=4190){
            salarioLiquido=salarioBruto*0.88;
        }else if (salarioBruto>4190 && salarioBruto<=8157){
            salarioLiquido=salarioBruto*0.86;
        }else {
            salarioLiquido=8157*0.86;
        }
    }
    
    public void calcularSalario(){
     System.out.println("Atenção! Necessário calcular salário nas classes filhas");    
    }
   
}