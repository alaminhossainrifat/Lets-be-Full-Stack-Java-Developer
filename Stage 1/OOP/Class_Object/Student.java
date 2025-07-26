package Class_Object;

public class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Student st1 = new Student();//Create object
        st1.name = "Rifat";
        st1.age = 23;
        st1.display();
    }
}
