public class Valores {

    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;

        segundo = primeiro;

        primeiro = 10;

        System.out.println(segundo);

        //o valor atribuido depois ao 'primeiro' não interfere no que foi guardado no 'segundo', pois foi feita a atribuição antes de modificar o valor do 'primeiro'
    }
    
}
