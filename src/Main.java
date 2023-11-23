public class Main {
    String name;

    static String name2; //Static attribute

    protected int salary; //This variable is visible to Pessoa.java

    private String lastName; //This variable is not visible to Pessoa.java

    public static void main(String[] args) {
      Being myBeing = new People("Carrie", 50, "Perry"); //You can call People here because it is a derived class from Being
      People myPeople = new People("Charlotte", 28, "Grey"); //You can not call Being here
    }

    public Main(String name) {
        this.name = name;
    }
    //^Constructor, it should have the same name as class^ 
}