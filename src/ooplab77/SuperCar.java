package ooplab77;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String country;

    public SuperCar(){}

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SuperCar (String b, String col, String e, String m, String con){
        this.carbrand = b;
        this.carcolor = col;
        this.carenginesize = e;
        this.maxspeed = m;
        this.country = con;



    }//constructor
}//class
