public class Main {

    public static void main(String[] args) {
        var nome = "Julia"; //This variable exists only inside this function
        int idade = 22; //This variable exists outside the function too

        if(idade > 22) {
            System.out.println("maior");
        } else if (idade == 22) {
            System.out.println("igual");
        } else {
            System.out.println("menor");
        }
    }
}