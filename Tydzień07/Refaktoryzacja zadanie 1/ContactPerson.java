class ContactPerson {
    String eFirstName;
    String eLastName;
    String cFirstName;
    String cLastName;
    PhoneNumber tel;
    PhoneNumber fax;
    PhoneNumber mobile;
    
    public ContactPerson(String eFirstName, String eLastName, 
                        String cFirstName, String cLastName) {
        this.eFirstName = eFirstName;
        this.eLastName = eLastName;
        this.cFirstName = cFirstName;
        this.cLastName = cLastName;
    }
}