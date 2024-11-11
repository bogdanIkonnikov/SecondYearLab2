package org.example;


public class FinanceReportProcessor {
    public static FinanceReport getPaymentsSecondName(FinanceReport report, char character){
        Payment[] payments = new Payment[report.getQuantityPayments()];

        // ArrayList vs two for
        int j = 0;
        for (int i = 0; i < report.getQuantityPayments(); i++){
            if (report.getPayment(i).getFio().charAt(0) == character) {
                payments[j] = report.getPayment(i);
                j++;
            }
        }
        return new FinanceReport(payments,"Finance Report Processor", "09.10.05");
    }
    public static FinanceReport getPaymentsUnderValue(FinanceReport report, int value){
        Payment[] payments = new Payment[report.getQuantityPayments()];
        int j = 0;
        for (int i = 0; i < report.getQuantityPayments(); i++){
            if (report.getPayment(i).getPay() < value) {
                payments[j] = report.getPayment(i);
                j++;
            }
        }
        return new FinanceReport(payments,"Finance Report Processor", "09.10.05");
    }
    public static int getPayByDate(int day, int month, int year, FinanceReport report){
        int sum = 0;
        for(int i = 0; i < report.getQuantityPayments();i++){
            if(report.getPayment(i).getDay() == day && report.getPayment(i).getMonth() == month && report.getPayment(i).getYear() == year){
                sum += report.getPayment(i).getPay();
            }
        }
        return sum;
    }
    public static String whichYearNoPays(int year, FinanceReport report){
        StringBuilder result = new StringBuilder("Список месяцев, в которых не было платежей за " + year + " год: ");
        int[] months = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};

        for(int i = 0; i < report.getQuantityPayments();i++){
            if(report.getPayment(i).getYear() == year){
                for (int j = 0;j<months.length;j++){
                    if(report.getPayment(i).getMonth() == months[j]){ //этот иф не работает
                        months[j] = 0;
                    }
                }
            }
        }

        for (int i = 0;i<months.length;i++) {
            if(!(months[i] == 0)){
                switch (i) {
                    case (0) -> result.append("Январь ");
                    case (1) -> result.append("Февраль ");
                    case (2) -> result.append("Март ");
                    case (3) -> result.append("Апрель ");
                    case (4) -> result.append("Май ");
                    case (5) -> result.append("Июнь ");
                    case (6) -> result.append("Июль ");
                    case (7) -> result.append("Август ");
                    case (8) -> result.append("Сентябрь ");
                    case (9) -> result.append("Октябрь ");
                    case (10) -> result.append("Ноябрь ");
                    case (11) -> result.append("Декабрь");
                }
            }
        }
        return result.toString();
    }
}
