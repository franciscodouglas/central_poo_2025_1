import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class app {
    public static void main(String[] args) {
        endereco casa = new 
        endereco("Rua ABC","Jardim ABC","Ferraz de Vasc","SP","N/D","08000-500",20);


        contato celular = new contato(987640011,11,"celular");
        contato residencial = new contato(8764444,11,"residencial");

        List<contato> contatos = new ArrayList<>();
        contatos.add(residencial);
        contatos.add(celular);

        //Criar o Aluno
        // Calendar data = Calendar.getInstance();
        // data.set(2001,Calendar.MAY,17);
        // Date dataNascimento = data.getTime();

        aluno a = new aluno("12345678910","Francisco Douglas","Masculino",292011, LocalDate.of(2001,05,17), casa, contatos);


        System.out.println(a.getNome());
        System.out.println(a.getEndereco().getRua());

    }
    
}
