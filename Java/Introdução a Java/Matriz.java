public class Matriz {
    public static void main(String[] args) {

        for (int linha = 0; linha<=10; linha ++){
            for(int coluna = 0; coluna <= 10; coluna++){

                if (coluna > linha){
                    break; // sai do for
                }

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int linha = 0; linha<=10; linha ++){
            for(int coluna = 0; coluna <= linha; coluna++){

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int linha = 1; linha <=5; linha ++){
            for (int coluna = 1; coluna <= 5; coluna++){

                if ( coluna > linha)
                    break;
                System.out.print(coluna);
                System.out.print(" ");

            }
            System.out.println();
        }

        for (int linha = 1; linha <=5; linha ++){
            for (int coluna = 1; coluna <= linha; coluna++){

                System.out.print(coluna);
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
