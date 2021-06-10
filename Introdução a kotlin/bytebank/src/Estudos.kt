fun main() {
    println("Arquivo mais detalhado com as anotações de estudo");

    // val → durante o percorrer do codigo não é permitido trocar o valor da variável, ela tem um valor constante
    // var → o valor da variável pode ser modificado conforme o percorrer do codigoval
    // não é necessário dizer qual o tipo, porém agora esta variável 'titular' so aceitará string

//    val titular = "Alex"; ->String
//    val numeroConta = 1000; ->Int
//    var saldo = 0.0; ->Double

    //PORÉM é possivel dizer qual o tipo
    val titular: String = "Alex";
    val numeroConta: Int = 1000;
    var saldo: Double = 0.0;

    //a variável saldo só aceita numeros double, se tentar colocar int dá erro, mas pode somar um valor int com um double sem problemas:
    //saldo = 150; -> ERRO
    saldo = 150.00 + 100; // somou usando um double e um int
    saldo = saldo + 100;  // saldo é double então aceita a soma
    saldo += 100;


    //print("titular" + titular );

    print("titular $titular");
    println("número da conta $numeroConta");
    println("saldo da conta $saldo");

    if (saldo > 0.0) {
        println("conta é positiva");
    } else if (saldo == 0.0) {
        println("conta está vazia")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> {
            println("conta é positiva");
        }
        saldo == 0.0 -> {
            println("conta está vazia")
        }
        else -> {
            println("Conta é negativa")
        }
    }

    when {
        saldo > 0.0 -> println("conta é positiva");
        saldo == 0.0 -> println("conta está vazia");
        else -> println("Conta é negativa")
    }

    //FOR em kotlyn trabalha com ranges,Itera por meio de qualquer coisa que forneça um iterador.

    // diferente das outras linguagens ele executa o ultimo numero do range
    for (i in 1..5) {
        println(i) // 1 2 3 4 5
    }

    //RODANDO DE 6 A 0
    for (i in 6 downTo 1) {
        println(i)  // 6 5 4 3 2 1
    }
    //rodar pulando 2
    for (i in 0..10 step 2) {
        println(i) // 0 2 4 6 8 10
    }

    for (i in 100 downTo 1 step 5) {
        if (i == 15) {
            break; //PARA O FOR
        }
        println(i)  // 6 5 4 3 2 1
    }

    for (i in 100 downTo 1 step 5) {
        if (i == 15) {
            continue; //pula o i == 15 e volta para o for
        }
        println(i)  // 6 5 4 3 2 1
    }

    //WHILE - verifica a condição e, se for satisfeita, executa o corpo e retorna para a verificação da condição.
}

