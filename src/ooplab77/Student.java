package ooplab77;
//design class
//taking abut student
//1.student id
//2.name                     //สั่ง run ไม่ได้ เพราะไม่มี Method//
//3.major
//4.group
public class Student {
    public  static String faculty = "Management Technology";
    private String id;
    private String name;
    private String major;
    private String group;

    //constructor
    //default
     public Student (){}
     public Student (String id,String n,String m,String g){
         this.id = id;
         this.name = n;
         this.major = m;
         this.group = g;
     }//constructor

    //getter and setter methods
    //id
    public void setId(String id){
         this.id = id;
    }//set id  //เปลี่ยนแปลงค่าข้อมูล setId
    public String getId(){
        return this.id;
    } //get id //เปลี่ยนแปลงค่าข้อมูล getId

    public  void setName(String name){
        this.name = name;
    }//set name
    public String getName(){
        return this.name;
    }//get name

    public void setMajor(String major){
        this.major = major;
    }//set major
    public String getMajor(){
        return this.major;
    }//get major

    public void setGroup(String group){
        this.group = group;
    }//set group
    public String getGroup(){
        return this.group;
    }//get group
}//class
