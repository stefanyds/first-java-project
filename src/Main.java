public class Main {

    public static void main(String[] args) {
        //Casting is used to transform the type of a variable into another one.
        int idade1 = 22;
        double idade2 = idade1;
        //^This works because double is bigger than integer^

        idade1 = (int) idade2;

        char letra = 'a';
        String nome = String.valueOf(letra);
        //^Char to String^
        letra = nome.charAt(0);
        //^String to Char^
        String nome2 = String.valueOf(idade2);
        //^Integer to String^
        idade1 = Integer.parseInt(nome2);
        //^String to Integer^
    }
}