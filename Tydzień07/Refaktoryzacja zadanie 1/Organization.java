class Organization {
    String id;
    String eName; // English name
    String cName; // Chinese name
    PhoneNumber tel;
    PhoneNumber fax;
    ContactPerson contactPerson;
    
    public Organization(String id, String eName, String cName) {
        this.id = id;
        this.eName = eName;
        this.cName = cName;
    }
}