public class Telco implements TeleSubscription {
    private String telcoName;
    private double promoPrice;
    private double dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice, double dataAllowance, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public double getDataAllowance() {
        return dataAllowance;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }

    @Override
    public void accept(UsagePromo usagePromo) {
        usagePromo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public void accept(UnliCallTextOffer unliCallTextOffer) {
        unliCallTextOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}