public class Main {
    String name;

    static String name2; //Static attribute

    public static void main(String[] args) {
      System.out.println(name2);
    }

    void declareName() {
        name = "John";
    }
    
    String getName() {
        return name;
    }
}