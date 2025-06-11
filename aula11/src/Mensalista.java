public class Mensalista extends Empregado {
    private String jornada;

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Mensalista(String cargo, Double horasTrabalhada, String nome, String sexo, String jornada) {
        super(cargo, horasTrabalhada, nome, sexo);
        this.jornada = jornada;
    }
    
    @Override
    public void calcularSalario(){
        if (cargo.equals("Junior")){
            salarioBruto = 2500.00;
        }else if(cargo.equals("Pleno")){
            salarioBruto = 5000.00;
        }else if (cargo.equals("Senior")){
            salarioBruto = 8000.00;
        }

    }

    

    
    
}
