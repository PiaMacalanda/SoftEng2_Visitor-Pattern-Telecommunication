class TelcoAllowance implements UsagePromo{

    @Override
    public String showAllowance(String telcoName, double price) {

        return telcoName + "data usage offers" + price + "subscription until";
    }
}