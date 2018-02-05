package ooplab9;

public class Address {
    private String homenumber;
    private String privice;
    private String postcode;

    public Address(String homenumber, String privice, String postcode) {
        this.homenumber = homenumber;
        this.privice = privice;
        this.postcode = postcode;
    }

    public Address() {
    }

    public String getHomenumber() {
        return homenumber;
    }

    public void setHomenumber(String homenumber) {
        this.homenumber = homenumber;
    }

    public String getPrivice() {
        return privice;
    }

    public void setPrivice(String privice) {
        this.privice = privice;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homenumber='" + homenumber + '\'' +
                ", privice='" + privice + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
