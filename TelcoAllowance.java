public class TelcoAllowance implements UsagePromo {
    
    @Override
    public String showAllowance(String telcoName, double price) {
        String result = telcoName + " Data Usage Offer and price: " + price;
        System.out.println(result);
        return result;
    }
}