public class Corpo_Humano {
    //definição dos atributos 
    
    public float massa; 
    private float volume; 
    private float densidade;
    private float altura;
    private float peso;

    //ou definir todos 
    // private float massa, volume, densidade;


    //utilizado para atribuir os valores para todos os atributos
    //no ato da criação do objeto
    public Corpo_Humano (float massa, float volume, float peso, float altura){
        this.massa = massa;
        this.volume = volume;
        this.peso = peso;
        this.altura=altura;
        
        calcularDensidade();
        // a densidade será alterada assim que tiver a massa e o volume
    }

    //método privado: um calculo ou uma validação
    private void calcularDensidade(){
        if (massa>0 && volume>0){
            this.densidade = this.massa/this.volume;
        }
    }


    public float calcularIMC(){
        // if (peso>0 && altura>0){
        //     return peso/(altura*altura);
        // }else {
        //     return 0;
        // }

        float imc=0;
        if (peso>0 && altura>0){
                imc = peso/(altura*altura);
        }
             
        return imc;
        
    }

    // public Corpo_Humano(){

    // }

    //setters: atribuir valores aos atributos
    //void: não possui retorno
    public void setMassa(float massa){
        this.massa = massa;
        calcularDensidade();
    }

    public void setVolume (float volume){
        this.volume=volume;
        calcularDensidade();
    }

    public void setAltura (float altura){
        this.altura = altura;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    //getters: recuperar valores dos atributos
    //return se torna obrigatório ao método que possui um tipo de dado
    public float getMassa(){
        return this.massa;
    }

    public float getVolume(){
        return this.volume;
    }

    public float getDensidade(){
        return this.densidade;
    }

    



}
