public class Horista extends Empregado {


    private Double valorHora;

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Horista(String cargo, Double horasTrabalhada, String nome, String sexo) {
        super(cargo, horasTrabalhada, nome, sexo);
        
    }
    @Override
    public void calcularSalario(){
        if (cargo.equals("Junior")){
           valorHora=25.00;
        }else if(cargo.equals("Pleno")){
           valorHora=35.00;
        }else if (cargo.equals("Senior")){
           valorHora=55.00;
        }
        salarioBruto=valorHora*horasTrabalhada;
    }
    



}
