public class ConversaoIntForDouble{

    public static void main(String[] args){

        //Em java um valor int pode ser guardado em uma variável do tipo Double, já o contrário acusa erro de compilação:

        double valor = 100;
        System.out.println("Valor: "+ valor);

        // int valor2 = 100.50; --> NÃO COMPILA

        //MODO DE FAZER UM VALOR DOUBLE CABER EM UMA VARIÁVEL INT --> CASTING, fazer a conversão se não é possivel fazer automático

        double salario = 1270.50;
        // int salarioInteiro = salario;  --> ERO NÃO COMPILA

        int salarioInteiro = (int) salario;  //CASTING
        System.out.println("Parte inteira do salário: "+ salarioInteiro);



    }
}