package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
         Person person =
                 new Person(
                         "Naruemon",
                         "359211110018",
                 new Address(
                         "2/4",
                         "Trang",
                         "92160"),
                 new Job(
                         "Student",
                         20000));
         System.out.println(person.toString());
         //ต้องการเปลี่ยนแค่เงินเดือนอย่างเดียว
        person.getJob().setSalary(30000);
        System.out.println(person.getJob());


    }
}
