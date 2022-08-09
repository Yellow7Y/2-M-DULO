package Datas;

import com.sun.source.tree.UsesTree;
import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalculadoraGravidez {

    private Date dataUltimoPeriodoMenstrual;
    private Date dataEstimadaConcepcao;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        Calendar calendario = null;
        calendario.setTime(dataEstimadaConcepcao);
        int nuDiasExecutados = 0;
        for (int i = 14; i<= nuDiasExecutados ; i++){
            //Acrescenta mais um dia na data para poder verificar se é dia util
            calendario.add(Calendar.DATE, 1);
            //Verifica se não é dia util
        }
        return dataEstimadaConcepcao;
    }

    public Date calcularDataEstimadaParto() {
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
    }

}
