public class Aliquota {
    //O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota. Ele descobriu no site da receita:

    // De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
    // De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
    // De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
    // Para começar, o João escreveu o seguinte esboço de classe:
    public static void main(String[] args) {
        double salario = 3300.0;
        double ir = 0 ;   // se não inicializar dar erro de inicializated
        int declaracao = 0; // se não inicializar dar erro de inicializated

        if (salario>= 1900 && salario <=2800){
            ir = 7.5;
            declaracao = 142;
            
        }else if (salario >=2800.01 && salario <=3751.0){
            ir = 15;
            declaracao = 350;

        }else if (salario >= 3751.01 && salario <= 4664.00 ){
            ir = 22.5;
            declaracao = 636;
        
        }   

        System.out.println("De 1900.0 até 2800.0, o IR é de " + ir + "% e pode deduzir na declaração o valor de R$ " + declaracao );
    }
    
}
