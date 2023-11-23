public class Main {
    String name;

    static String name2; //Static attribute

    public static void main(String[] args) {
      System.out.println(name2);
    }

    public Main(String name) {
        this.name = name;
    }
    //^Constructor, it should have the same name as class^ 
}