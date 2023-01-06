package teachmeskills;

public class CreditDemo {
    public static void main(String[] args) {


        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        CreditCard creditCard3 = new CreditCard();


        creditCard1.number = 123456789;
        creditCard1.cash = 1000;
        creditCard1.withdraw = 0;
        creditCard1.replenish = 20;
        creditCard1.noMoneyNoHoney = creditCard1.cash + creditCard1.replenish -creditCard1.withdraw ;
        System.out.println("У Лебовски " + creditCard1.noMoneyNoHoney+" бел.руб.");

        creditCard2.number = 223456789;
        creditCard2.cash = 1000;
        creditCard2.withdraw = 0;
        creditCard2.replenish = 10;
        creditCard2.noMoneyNoHoney = creditCard2.cash + creditCard2.replenish -creditCard2.withdraw ;
        System.out.println("У Гейба "+creditCard2.noMoneyNoHoney+" бел.руб.");

        creditCard3.number = 323456789;
        creditCard3.cash = 1000;
        creditCard3.withdraw = 20;
        creditCard3.replenish = 0;
        creditCard3.noMoneyNoHoney = creditCard3.cash + creditCard3.replenish -creditCard3.withdraw ;
        System.out.println("У Илона "+creditCard3.noMoneyNoHoney+" бел.руб.");
    }
}


