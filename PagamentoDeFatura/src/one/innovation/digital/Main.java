package one.innovation.digital;

import java.util.Calendar;

/************************************************
 * Objetivo: 1) Receber a data de vencimento da
 *           fatura.
 *           2) Acrescentar 10 dias para pagar
 *              sem juros e correção monetária.
 *           3) Se cair no sábado ou domingo,
 *              pagar na próxima segunda-feira.
 * Autor   : Fernando
 * Data    : 23.07.2021
 ************************************************/

public class Main {
    public static void main(String[] args) {
        // criando um objeto Calendar
        Calendar dataVencimento = Calendar.getInstance();

        dataVencimento.set(Calendar.DATE, 14);
        dataVencimento.set(Calendar.MONTH, 6);
        dataVencimento.set(Calendar.YEAR, 2021);

        System.out.println("Data de Vencimento    : " + dataVencimento.getTime());

        dataVencimento.add(Calendar.DATE, 10);
        System.out.println("Data Pagamento: " + dataVencimento.getTime());

        int dia = dataVencimento.get(Calendar.DAY_OF_WEEK);
        switch (dia) {
            case Calendar.SATURDAY:
                dataVencimento.add(Calendar.DAY_OF_WEEK, 2);
                break;
            case Calendar.SUNDAY:
                dataVencimento.add(Calendar.DAY_OF_WEEK, 1);
                break;
            default:
                break;
        }

        System.out.println("Acerto em Data Pagamento: " + dataVencimento.getTime());

    }
}
