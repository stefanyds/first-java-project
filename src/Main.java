import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] idades = new int[10]; //Array
        ArrayList<Integer> ages = new ArrayList<Integer>(); //Array list (it's dynamically allocated)
        ages.add(30);
        ages.add(40);
        ages.remove(0); //It will delete the age from the index 0 (30)
        ages.get(1);
        ages.size();
    }
}