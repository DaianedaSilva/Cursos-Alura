public class Caracteres{

    public static void main(String args[]){
        System.out.println(" CONHECENDO O CHAR : \n\n");
        //char armazena apenas uma letra, deve ser usado aspas simples
        char letraD = 'D';
        char letrad = 'd';

        //char letra = 'dD' -> mais de uma letra, ERRO NÃO COMPILA
        // char letra = "d"  -> usando aspas dupla, ERRO NÃO COMPILA 

        System.out.println(letraD);
        System.out.println(letrad);

        //o char guarda dentro dele um numero, q é o valor da letra digitada na tabela ASC
        letraD = 68; //D     A = 65  B = 66   C = 67 .....
        letrad = 100; //d    a = 97  b = 98   c = 99 ....

        System.out.println(letraD);
        System.out.println(letrad);

        // é possivel somar um valor para um char para gerar outra letra?
        //SIM, Porém é necessário fazer o cast

        char letraE = (char) (letraD + 1);
        System.out.println(letraE); 

        System.out.println(" \n\n CONHECENDO O STRING : \n\n");
        //string em java serve para armazenar mais de um caracter  
        // deve ser usada aspas duplas: " "
        //String deve ser declado com o S maiusculo, pois ela é como se fosse uma classe em java com métodos e atributos

        String palavra  = "Isto é uma frase ";
        System.out.println(palavra);

        // ao mandar somar com um numero a palavra concatena com o numero
        palavra = palavra + 2021;
        System.out.println(palavra);


    }

}