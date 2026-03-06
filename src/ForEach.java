public class ForEach {
    public static void main(String[] args) {
        String[] frutas = {"Banana", "Laranja", "Maça", "Pera", "Uva"};
        // for (int i = o; i < frutas.length; i++) {
        for (String fruta : frutas) {
            System.out.println("A fruta e: " + fruta);
        }
    }
}
