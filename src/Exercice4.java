public class Exercice4 {
    public static void execute() {
        for (int i = 1; i <= 500; i++) {
            //Conversion en chaine pour pouvoir parcourir
            String stringValue = String.valueOf(i);
            //On parcours chaque caractère et on converti en entier
            //pour ensuite l'élever au cube, puis on fait la somme des cubes.
            int total = 0;
            for (int j = 0; j < stringValue.length(); j++) {
                total += Math.pow(Integer.parseInt(stringValue.charAt(j) + ""), 3);
            }

            //Si le total est égal au nombe initia alors on affiche le nombre
            if (total == i) System.out.println(i);
        }
    }
}
