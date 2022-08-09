package Datas;



public class Calendar {
    public static int nuDiasExecutadosUteis(Date dataInicio) {
        //Numero de dias que se passaram, sem contar com a data inicio e data fim
        //Observação: Contando que a data inicio e data fim sejam dias uteis
        int nuDiasExecutados = (int) (new Date().getTime() - dataInicio.getTime()) / 86400000;
        int totalDiasExecutadosUteis = 0;
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataInicio);
        for (int i = 1; i <= nuDiasExecutados; i++) {
            //Acrescenta mais um dia na data para poder verificar se é dia util
            cal.add(Calendar.DATE, 1);
            //Verifica se não é dia util
            if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                totalDiasExecutadosUteis += 1;
            }
        }
        return totalDiasExecutadosUteis;
    }
}