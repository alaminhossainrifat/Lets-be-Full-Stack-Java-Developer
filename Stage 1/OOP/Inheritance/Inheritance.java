
public class Inheritance {
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

    void car(){
        System.out.println("I am Car");
    }
    

    public static void main(String[] args) {
         InnerInheritance obj = new InnerInheritance();
        obj.setName("Rifat");
        obj.setAge(23);
        obj.setCrntYear(2025);
        obj.display();          // From Inheritance
        obj.showCurrentYear();  // From InnerInheritance;
        obj.car();
    }
}

class InnerInheritance extends Inheritance {
    private int crntYear;
    public int getCrntYear() {
        return crntYear;
    }

    public void setCrntYear(int crntYear) {
        this.crntYear = crntYear;
    }
    void showCurrentYear(){
        System.out.println("Current Year: "+crntYear);
    }
}