public class TelcoPromo {   
    public static void main(String[] args) {

        TeleSubscription smart = new Telco("Smart", 500, 15, false);
        TeleSubscription globe = new Telco("Globe", 450, 10, true);
        TeleSubscription ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        System.out.println("Data Usage Offers:");
        smart.accept(promo);
        globe.accept(promo);
        ditto.accept(promo);

        System.out.println("\nUnli Calls and Text Packages:");
        smart.accept(unli);
        globe.accept(unli);
        ditto.accept(unli);
    }
}