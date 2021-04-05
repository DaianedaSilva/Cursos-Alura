public class Tiposdevariaveis {

    public static void main(String[] args){

        System.out.println("** Trabalhando com Variávies do tipo INT **\n");
       
        //java é uma linguagem fortemtete tipada, é preciso falar o tipo da variável
        int idadeDaiane;
        int idadeLeo = 21;
        
        // System.out.println(idadeDaiane);  NÃO RODA POIS N FOI DEFINIDO UM VALOR AINDA
        System.out.println(idadeLeo);

        idadeDaiane = 20;
        System.out.println(idadeDaiane);

        //Concatenando string e variável:::
        System.out.print("\nA idade da Daiane é: " + idadeDaiane); //print sem o ln, a proxima linha fica na mesma de saída
        System.out.println("  A idade do Leo é: " + idadeLeo ); 

        //Fazendo contas
        idadeDaiane = 30 * 7;
        System.out.println(idadeDaiane);


        System.out.println("\n\n\n ** Trabalhando com Variávies do tipo DOUBLE **\n");

        //double é usado para variáveis do tipo float

        double salarioDaiane = 2500; //é posivel colocar um numero int em um double, já o contrário não
        double salarioLeo = 2500.50;

        // idadeDaiane = 20.1;  --> ERRO DE COMPILAÇÃO, NÃO COMPILA

        System.out.print("Salário da Daiane: " + salarioDaiane);
        System.out.println("  -  Salário do Leo: " + salarioLeo);

        double divisao = 3.14/2;
        System.out.println("\nDivisão de 3.14/2 =" + divisao);
        
        int divisaoInt = 5 / 2;
        System.out.println("\nDividinndo 5/2 usando INT: " + divisaoInt );

        double divisaoDouble = 5 / 2;
        System.out.println("\nDividinndo 5/2 usando DOUBLE: " + divisaoDouble );
        //repare que deste modo a saida que temos é:  2.0. Isto porque o java faz a conta ignorando o tipo da variável sempre em int, e depois guarda ela e trasnfroma em double colocando o .0, se deseja fazer com que a resposta seja 2.5, devemos especificar que estamos trabalhando com numero double: 

        double divisaoDoubleEspecifico = 5.0 / 2;
        System.out.println("\nDividinndo 5.0 /2 usando DOUBLE: " + divisaoDoubleEspecifico );

        System.out.println("\n\n\n ** Trabalhando com Variávies do tipo LONG **\n");
        //No Java, o int e o double são os tipos mais usados, em int cabem 32bits com sinais, isto é, números positivos e negativos. Mais especificamente, cabem de 2 elevado a 31 negativos, a 2 elevado a 31 positivos menos 1, por conta do 0 (zero), o que dá uma quantidade de cerca de 2 bilhões.
        //O int pode guardar até 2 bilhões e, passando dessa quantidade, ocorrerá um overflow. Caso se queira guardar um número maior ou menor que este, será preciso um número com 64bits, que no Java é o long, que guarda um número de até 2 elevado a 63 menos 1.

       // int numeroGrandeInt = 32432423523; //--> ERRO, NÃO COMPILA
        long numeroGrande = 32432423523L; // -> É NECESSÁRIO UM L NO FIM DO NUMERO

        System.out.println("\nNúmero maior que 2 bilhões: " + numeroGrande );

        System.out.println("\n\n\n ** Trabalhando com Variávies do tipo SHORT **\n");
        // GAURDA NUMÉROS PEQUENOS, até 16 bits








        System.out.println("Tipos de dados em Java: \n" +
	            "\nMenor Byte: " + Byte.MIN_VALUE +
	            "\nMaior Byte: " + Byte.MAX_VALUE +
	            "\nMenor Short Int: " + Short.MIN_VALUE +
	            "\nMaior Short Int: " + Short.MAX_VALUE +
	            "\nMenor Int: " + Integer.MIN_VALUE +
	            "\nMaior Int: " + Integer.MAX_VALUE +
	            "\nMenor Long: " + Long.MIN_VALUE +
	            "\nMaior Long:" + Long.MAX_VALUE +
	            "\nMenor Float: " + Float.MIN_VALUE +
	            "\nMaior Float: " + Float.MAX_VALUE +
	            "\nMenor Double: " + Double.MIN_VALUE +
	            "\nMaior Double: " + Double.MAX_VALUE);
    }

}