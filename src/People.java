class Being {
    String name;
    int age;

    public Being(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}


public class People extends Being {

    String lastName;

    public People(String name, int age, String lastName) {
        super(name, age);
        this.lastName = lastName;
    }

    void createMain() {
        Main myMain = new Main("John");
        System.out.println(myMain.name);
        System.out.println(myMain.salary);
        System.out.println(Main.lastName);
        this.age = 45;
    }
}
