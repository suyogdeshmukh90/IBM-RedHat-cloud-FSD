package comm.example;

public class Address {
    private String addressLine1;
    private String addressLine2;
    public Address(String addressLine1,String addressLine2)
    {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    public String getAddress() {
        return "addressLine1 "+addressLine1+" addressLine2 "+addressLine2;
    }
}
