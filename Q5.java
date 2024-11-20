public class Q5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Boucle pour afficher le triangle inversé
        for (int i = n; i >= 1; i--) { 
            for (int j = 0; j < i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
