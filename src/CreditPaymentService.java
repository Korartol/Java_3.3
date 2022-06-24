public class CreditPaymentService {
    public double variable(double loanAmount, double interestRate, int month) {
        double percentMonth = (interestRate / 12) / 100;
        double degree = Math.pow(1 + percentMonth, -month * 12);
        double calculate = loanAmount * percentMonth / (1 - degree);
        return calculate;
    }
}


/*
Формула расчета ануитентного платежа:
ежм.плат = суммаКредита * (процВмесяц) / (1 - (1 + (процВмесяц) ^ (- кол-воМесяцев)))

loanAmount - Сумма кредита
interestRate - Процентная ставка
months - месяцы
 */