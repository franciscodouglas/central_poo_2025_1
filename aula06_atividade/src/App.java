public class App {
    public static void main(String[] args) throws Exception {
        //instanciar a classe ou criar o objeto
        Corpo_Humano obj = new Corpo_Humano(0, 0,82,1.75f);
        obj.setMassa(10);
        obj.setVolume(2);
            //Qual Ocorrência? 
            //R.: Deu erro no código
            //Qual a conclusão sobre o que aconteceu? 
            //O método ficou privado e nisso é invisivel (ou oculto)
        
        

        // obj.massa = 10;
            //Qual Ocorrência? 
            //R.: Deu erro no código
            //Qual a conclusão sobre o que aconteceu? 
            //R.: O atributo está sendo acessado de forma direta, mas está como private
        System.out.println(obj.getDensidade());
        System.out.println(obj.getMassa());
        obj.massa = 20;    
         //Qual Ocorrência? 
         //R.: Não deu erro no código
         //Qual a conclusão sobre o que aconteceu? 
        //R.: O atributo em publico é acessivel para modificação direta
        // Em razão disso, a densidade não é alterada, pois não é chamado o calculo
        System.out.println(obj.getMassa());
        System.out.println(obj.getDensidade());

        System.out.println(obj.calcularIMC());
        obj.setPeso(85); //alterando o peso, que antes era 82
        System.out.println(obj.calcularIMC());

        Corpo_Humano obj2 = new Corpo_Humano(0, 0, 0, 0);
        System.out.println(obj2.calcularIMC());

        obj2 = obj;
        System.out.println(obj2.calcularIMC());
    }
}
