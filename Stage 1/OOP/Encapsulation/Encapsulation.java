package Encapsulation;

public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Encapsulation p1 = new Encapsulation();
        p1.setName("Rifat");
        p1.setAge(23);
        p1.display();
    }
}