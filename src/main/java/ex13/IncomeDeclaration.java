package ex13;

public class IncomeDeclaration {
    private int year;
    private String fio;
    double[][] table;
    IncomeCertificate[] certificates;
    public IncomeDeclaration(int year, String fio, double[][] table, IncomeCertificate[] certificates) {
        this.year = year;
        this.fio = fio;
        this.table = table;
        this.certificates = certificates;
    }

    public int getYear() {
        return year;
    }

    public String getFio() {
        return fio;
    }

    public double[][] getTable() {
        return table;
    }

    public IncomeCertificate[] getCertificates() {
        return certificates;
    }

//    public int fillTable(int month) {
//        int summ = 0;
//        for(int j = 0;j < table.length; j++){
//            for (int i = 0; i < certificates.length; i++) { //записываем сумму всех доходом за месяц в первый столбец
//                summ += certificates[i].getIncome()[month];
//            }
//            table[j][0] = summ; //сначала строка, потом столбец
//        }
//
//    }
    public int calculateSummaryIncome(int month) {
        int summ = 0;
        for (int i = 0; i < certificates.length; i++) {
            summ += certificates[i].getIncome()[month];
        }
        return summ;
    }

}
