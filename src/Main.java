public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int x = 1_000_000;  // Сумма кредита
        double y = 9.99;  // Процентная ставка

        System.out.println("Сумма кредита: " + x + " руб.");
        System.out.println("Процентная ставка: " + y + "%");
        System.out.println("Срок кредита: 1 год");
        System.out.println("Ежемесячный платеж: " + Math.round(service.variable(x, y, 1)) + " руб.");
        System.out.println();

        System.out.println("Сумма кредита: " + x + " руб.");
        System.out.println("Процентная ставка: " + y + "%");
        System.out.println("Срок кредита: 2 года");
        System.out.println("Ежемесячный платеж: " + Math.round(service.variable(x, y, 2)) + " руб.");
        System.out.println();

        System.out.println("Сумма кредита: " + x + " руб.");
        System.out.println("Процентная ставка: " + y + "%");
        System.out.println("Срок кредита: 3 года");
        System.out.println("Ежемесячный платеж: " + Math.round(service.variable(x, y, 3)) + " руб.");
        System.out.println();
    }
}
