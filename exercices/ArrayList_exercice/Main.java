package exercices.ArrayList_exercice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User ("ad@gmail.com"));
        users.add(new User ("addd@gmail.com"));
        users.add(new User ("addddd@gmail.com"));
        users.add(new User ("ad@gmail.com"));

        var ad = users.get(0);
        var ad1 = users.get(3);
        //System.out.println(ad.equals(ad1));

        var maList = new MaArrayList(2);
        //maList.ajouter("");
        //maList.supp(1);
        //maList.modifier(2, "quatre");
        //maList.position("trois");

        System.out.println("ajoute");
        maList.ajouter("un");
        maList.afficher();
        System.out.println("supprime");
        maList.supp(0);
        maList.afficher();
        System.out.println("ajoute");
        maList.ajouter("un");
        maList.afficher();
        System.out.println("modifie");
        maList.modifier(0, "deux");
        maList.afficher();
        System.out.println("ajoute au dessu taille tableau");


        String[] s = new String[2];
        for (int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }

    }
}
