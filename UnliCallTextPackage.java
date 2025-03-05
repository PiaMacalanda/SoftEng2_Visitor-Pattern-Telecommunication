class UnliCallTextPackage implements UnliCallsTextOffer {
    
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hashunliCallText) {
        if (hashunliCallText) return telcoName + " includes unlimited calls and texts packages.";
        return telcoName + " does not offer unlimited calls and texts packages.";
    }
}