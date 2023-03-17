package exercices.ArrayList_exercice;

public interface MyList {
     void ajouterObj(Object s);
     void ajouter (String s);
     void supp(int index);
     void suppObj(int index);
     void modifierObj(int index, Object nvObj);
     void modifier(int index, String nouvelleValeur);
     int position(String valeur);
     int positionObj(Object obj);
     void afficher();
     void afficherObj();


}
