import java.util.ArrayList;
import java.util.List;

public class Casa {
    private Endereco endereco; //Associação 1 para 1
    private List<Comodo> comodos; //Composição


    // Composição é obrigatório ter sua parte
    // Não é recomendado ter construtores vazios
    // É necessário colocar IF-ELSE para validações
    // Todo(Casa)-Parte(Comodos)
        // Comodos pode existir sem casa
        // Casa não existe sem Comodos
    public Casa(List<Comodo> comodos){
        if (comodos == null || comodos.size()==0 || comodos.isEmpty()){
            System.out.println("Necessário ter pelo menos um comodo");
        }else{
          
            this.comodos= new ArrayList<>(comodos);
        }
   
    }

    public Casa (Endereco endereco, List<Comodo> comodos){


        if (comodos == null || comodos.size()==0 || comodos.isEmpty()){
            System.out.println("Necessário ter pelo menos um comodo");
        }else{
            this.endereco = endereco;
            this.comodos= new ArrayList<>(comodos);
        }
   
    }
    public void adicionarComodo(Comodo comodo){
        comodos.add(comodo);

    }

    public void removereComodo(Comodo comodo){
        comodos.remove(comodo);
    }

    public void exibirComodo(){
        for (Comodo comodo : comodos) {
            comodo.exibir();
        }
    }
}
