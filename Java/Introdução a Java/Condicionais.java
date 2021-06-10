
public class Condicionais {

    public static void main(String[] args) {
        System.out.println("COndicionais");
        int idade = 20;
        int quantidadePessoas = 3;

        //obrigatorio o uso de chaves
        if (idade >= 18){
            System.out.println("Você tem mais de 18 anos");

        }else if(quantidadePessoas >= 2){
                System.out.println("Está acompanhado pode entrar");
            
        }
        
        
       
        //se tem apenas uma linha de comando dentro do bloco do if pode omitir as chaves

        if (idade == 21)
            System.out.println("Você tem 22 anos");
        else    
            System.out.println("Você não tem 22 anos");
        

        


    }
    
}
