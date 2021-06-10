public class EscopoDeVariaveis {

    public static void main(String[] args) {
        
        System.out.println("Escopo de Variáveis");
        int idade = 20;
        int quantidadePessoas = 3;
        
    
        //A variável acompanhado, foi criada dentro do bloco do if, neste caso ela so existe para este bloco

        if (quantidadePessoas >= 2){

            boolean acompanhado = true;
            System.out.println("Você tem mais de 18 anos");

        }else{
            //neste novo bloco ela não existe
            // acompanhado = false;
        }

        //O correto se deve usar para todo o main e não para um bloco especifico declara ela entro do main, que vai funcionar para todo o bloco dele. 
        boolean acompanhado;

        if (quantidadePessoas >= 2){

            acompanhado = true;
            System.out.println("Você tem mais de 18 anos");

        }else{
            //neste novo bloco ela não existe
            acompanhado = false;
        }

        //Se criar variáveis sem declarar um valor para elas, e depois modificar dentro de um if, no main elas vão acusar que não foram inicializadas
        double salario = 3300.0;
        double ir = 0 ; //deve inicializar se não dar erro
        int declaracao = 0;

        if (salario>= 1900 && salario <=3800){
            ir = 7.5;
            declaracao = 142;
            
        } 
        
        System.out.println("De 1900.0 até 2800.0, o IR é de " + ir + "% e pode deduzir na declaração o valor de R$ " + declaracao );

    }

}
