package com.operacoesaritimeticas;

public class OperadoresUnarios {
    public static void main(String[] args) {
        //iniciamos o saldo como 1
        Integer saldoConta = 1;
        // jogamos o saldo de 1 no saldo total, e transformamos o saldoConta em 2 (POREM O SALDO TOTAL AINDA É 1)
        Integer saldoTotal = saldoConta++;
        System.out.println(saldoConta);
        System.out.println(saldoTotal);

        //iniciamos o saldo como 1
        saldoConta = 1;
        // jogamos o saldo de 2 no saldo total, e transformamos o saldoConta em 2 (JUNTO DO SALDO TOTAL QUE AGORA TAMBEM É 2)
        saldoTotal = ++saldoConta;
        System.out.println(saldoConta);
        System.out.println(saldoTotal);

        //iniciamos o saldo como 2
        saldoConta = 2;
        // jogamos o saldo de 2 no saldo total, e transformamos o saldoConta em 1  (POREM O SALDO TOTAL AINDA É 2)
        saldoTotal = saldoConta--;
        System.out.println(saldoConta);
        System.out.println(saldoTotal);

        //iniciamos o saldo como 1
        saldoConta = 2;
        // jogamos o saldo de 1 no saldo total, e transformamos o saldoConta em 1 (JUNTO DO SALDO TOTAL QUE AGORA TAMBEM É 1)
        saldoTotal = --saldoConta;
        System.out.println(saldoConta);
        System.out.println(saldoTotal);
    }
}
