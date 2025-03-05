public class Telco implements TelcoSubscription {
    private final String telcoName;
    private final double promoPrice;
    private final boolean unliCallText;

    public Telco(String telcoName, double promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promoShowAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return promoShowUnliCalls(telcoName, unliCallText);
    }

    private String promoShowAllowance(String telcoName, double promoPrice) {
        return "Telco: " + telcoName + " | Price: " + promoPrice;
    }


    private String promoShowUnliCalls(String telcoName, boolean unliCallText) {
        return "Telco: " + telcoName + " | Unlimited Calls & Text: " + (unliCallText ? "Yes" : "No");
    }
}
