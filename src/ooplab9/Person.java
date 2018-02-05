package ooplab9;

import jdk.nashorn.internal.scripts.JO;

public class Person {
    private String name;
    private String personid;
    private Address Address;
    private Job job;

    public Person(String name, String personid, ooplab9.Address address, Job job) {
        this.name = name;
        this.personid = personid;
        Address = address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public ooplab9.Address getAddress() {
        return Address;
    }

    public void setAddress(ooplab9.Address address) {
        Address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid='" + personid + '\'' +
                ", Address=" + Address +
                ", job=" + job +
                '}';
    }
}
