public class Main {
    String name;

    static String name2; //Static attribute

    protected int salary; //This variable is visible to Pessoa.java

    private String lastName; //This variable is not visible to Pessoa.java

    public static void main(String[] args) {
      System.out.println(name2);
    }

    public Main(String name) {
        this.name = name;
    }
    //^Constructor, it should have the same name as class^ 
}