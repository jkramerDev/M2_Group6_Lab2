package template;

/**
 *   model a PhonebookEntry 
 *   
 *   PhonebookEntry has a phoneNumber and type
 *   
 *   
 *   
 */

class PhonebookEntry{
	private String phoneNumber;
    private String type;

	public PhonebookEntry(String phoneNumber, String type) {
		this.phoneNumber = phoneNumber;
		this.type = type;
	}
	public String getPhoneNumber() {
        return phoneNumber;
    }
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return phoneNumber + " / " + type;
    }
	 
}
	