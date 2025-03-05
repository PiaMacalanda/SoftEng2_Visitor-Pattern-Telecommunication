public class UnliCallTextPackage implements UnliCallTextOffer {
    
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        String result = telcoName + " unlimited calls and text package: " + 
               (unliCallText ? "Unlimited" : "Per-use");
        System.out.println(result);
        return result;
    }
}