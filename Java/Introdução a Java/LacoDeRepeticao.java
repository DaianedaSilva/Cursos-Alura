
public class LacoDeRepeticao {
    public static void main(String[] args) {
        //para while, deve-se criar e inicializar a variável antes de colocar dentro do
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            // contador= contador + 1;
            // contador ++;
            contador += 1;

        }
        System.out.println("Valor do contador fora do while:" + contador);
        contador = 0;
        int total = 0;
        while (contador < 10){
            //total = total + contador;
            total += contador;
            System.out.println(total);
            contador ++;
        }

        for (int contadorFor = 0; contadorFor <= 10; contadorFor++){
            System.out.println(contadorFor);
        }
        //fora do escopo o contadorFor não exite

    }
}
