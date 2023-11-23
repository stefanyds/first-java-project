public class Dog extends Being {

    String ownerName;

    public Dog(String name, int age, String ownerName) {
        super(name, age);
        this.ownerName = ownerName;
    }

    @Override
    public String FavoriteFood() {
        return "Meat";
    }
    
}
