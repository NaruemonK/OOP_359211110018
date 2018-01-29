package ooplab8;

public class Pet {
    private String name;
    private String nairColor;
    private String gender;
    private int age;

    public void makenoise(){}

    //constructor   //กดAlt + Insert

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                "name='" + name + '\'' +
                ", nairColor='" + nairColor + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Pet(String name, String nairColor, String gender, int age) {
        //assign data to object properties
        this.name = name;
        this.nairColor = nairColor;
        this.gender = gender;
        this.age = age;

            }
//getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNairColor() {
        return nairColor;
    }

    public void setNairColor(String nairColor) {
        this.nairColor = nairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
