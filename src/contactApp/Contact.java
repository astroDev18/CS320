package contactApp;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String contactAddress;

    // constructor
    public Contact(String id, String fName, String lName, String pNumber, String contAddress) {
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }

        if (fName == null || fName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }

        if (lName == null || lName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }

        if (pNumber == null || pNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        if (contAddress == null || contAddress.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.contactID = id;
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = pNumber;
        this.contactAddress = contAddress;
    }

    // Getters Section
    public int getContactID() {
        return Integer.parseInt(this.contactID);
    }

    public String getName() {
        return this.firstName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getContactAddress() {
        return this.contactAddress;
    }


    public void setContactID(String contactID) {
        this.contactID = contactID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.contactAddress = address;
    }
}