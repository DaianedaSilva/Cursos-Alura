public class OperadoresLogicos {

    public static void main(String[] args) {
        System.out.println("Operadores Logicos");
        int idade = 20;
        int quantidadePessoas = 3;

        //boolean acompanhado = true;

        boolean acompanhado = quantidadePessoas >=2;   // TRUE


        //OR - || -> se apenas um dos 2 for verdadeiro returna True
        // tem mais ou 18 anos  OU  esta acompanhado
        if (idade >= 18 || acompanhado){

            System.out.println("Você tem mais de 18 anos");

        }else{

            System.out.println("Está acompanhado pode entrar");
            
        }
        
       //AND - && -> os dois tem que ser verdadeiro para retornar true
       // tem mais ou 18 anos E esta acompanhado
        if (idade >= 18 && acompanhado){

            System.out.println("Você tem mais de 18 anos");

        }else{

            System.out.println("Está acompanhado pode entrar");
            
        }
        
    }
    
}
