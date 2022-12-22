package Blessing;

public class Project23SetGet {
    public static void main(String[] args)
    {
        CreditCard card = new CreditCard();
        card.setName("Annabeth Chase");
        card.setCreditCardNumber("3242542123112744");
        card.setExpirationDate("01/25");
        card.setCvv(633);
        System.out.println(card.getName());
        System.out.println(card.getCreditCardNumber());
        System.out.println(card.getExpirationDate());
        System.out.println(card.getCvv());

    }
}
