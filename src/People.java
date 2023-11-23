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

    @Override
    public String FavoriteFood() {
        return "Pasta";
    }
}
