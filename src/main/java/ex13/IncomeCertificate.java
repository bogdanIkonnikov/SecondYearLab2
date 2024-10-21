package ex13;

public class IncomeCertificate {
    private final int year;
    private final String fio;
    private final String company;
    private final int[] income;

    public IncomeCertificate(int year, String fio, String company, int[] income) {
        this.year = year;
        this.fio = fio;
        this.company = company;
        this.income = income;
    }

    public int getYear() {
        return year;
    }
    public String getFio() {
        return fio;
    }
    public String getCompany() {
        return company;
    }
    public int[] getIncome() {
        return income;
    }

}

