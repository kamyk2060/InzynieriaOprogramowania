class PhoneNumber {
    String countryCode;
    String areaCode;
    String localNumber;
    
    public PhoneNumber(String countryCode, String areaCode, String localNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.localNumber = localNumber;
    }
    
    // Opcjonalnie: metody pomocnicze do formatowania numeru
    public String getFullNumber() {
        return "+" + countryCode + " " + areaCode + " " + localNumber;
    }
}