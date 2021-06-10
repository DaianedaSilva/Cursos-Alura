fun main() {



//  println("Bem vindo ao Bytebank");

    val contaDaiane = Conta(titular = "Daiane", numero = 1000);
//    contaDaiane.titular = "Daiane"; -> SEM COSNTRUTOR
//    contaDaiane.numero = 1000;   -> SEM COSNTRUTOR
    contaDaiane.depositar(500.00); // deve ser double

    val contaLeo = Conta(numero = 1001, titular ="Leonardo");
//    contaLeo.titular = "Leonardo"
//    contaLeo.numero = 1001;
    contaLeo.depositar(250.00); // deve ser double


    println(contaDaiane.titular);
    println(contaDaiane.numero);
    println(contaDaiane.saldo);
    println();
    println(contaLeo.titular);
    println(contaLeo.numero);
    println(contaLeo.saldo);


    //DEPOSITANDO VALORES NA CONTA
    println("Depositando para a conta da ${contaDaiane.titular}");

    contaDaiane.depositar(150.0);
    println(contaDaiane.saldo);

    println("Depositando para a conta do ${contaLeo.titular}");

    contaLeo.depositar(120.0);
    println(contaLeo.saldo);


    //SACANDO VALORES NA CONTA
    println("Sacando da conta da ${contaDaiane.titular}");

    contaDaiane.sacar(50.0);
    println(contaDaiane.saldo);

    println("Sacando da conta conta do ${contaLeo.titular}");

    contaLeo.sacar(20.0);
    println(contaLeo.saldo);

    //TRANSFERINDO
    println("Transfrindo da conta da ${contaDaiane.titular} para a conta do ${contaLeo.titular}");

    if (contaDaiane.transferir(100.0, contaLeo)) {
        println("Transferencia realizada com sucesso!!")
    } else {
        println("Falha na  Transferencia!!")

    }
    println(contaDaiane.saldo);
    println(contaLeo.saldo);


}

class Conta constructor(
    val titular: String,
    val numero: Int
) {
//    var titular = titular; -> se passar o atributor por parametro, sem criar com var
//    var numero = numero;

    var saldo = 0.0
        private set(valor) {
            //field -> this.saldo -: é a variável em si
            field = valor
        }
    //get(){return field; } //ISSO JÁ É IMPLEMENTADO NÃO PRECISA FAZER


//    constructor(titular: String, numero: Int){
//        this.titular = titular;
//        this.numero = numero;
//    }


    fun depositar(valor: Double) {
        this.saldo += valor; //pode ser usado para mostrar que é o atributo
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    fun transferir(valor: Double, destino: Conta): Boolean {

        if (this.saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}


/**************************************************************************/


fun testaLacos() {
    var i = 0;

    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo: Double = i + 10.0;

        print("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");

        testaCondicoes(saldo);
    };
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva");
        saldo == 0.0 -> println("conta está vazia");
        else -> println("Conta é negativa")
    }

}