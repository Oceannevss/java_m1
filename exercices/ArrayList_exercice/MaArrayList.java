package exercices.ArrayList_exercice;

public class MaArrayList implements MyList{

    private String[] list;
    private Object[] listObject;
    private int counter;

    public MaArrayList(int taille) {
        this.listObject = new Object[taille];
        this.list = new String[taille];
        this.counter = 0;
    }
    /*public MaArrayList{
        this.listObject = new ArrayList<Object>();
    }*/
    public void ajouter(String s) {
        for(int i=0; i< list.length; i++){
            if(list[i] == null){
                list[i] = s;
                break;
            }
            i++;
        }
        System.out.println("le tableau est rempli");
    }

    @Override
    public void ajouterObj(Object s) {
        if(counter < listObject.length){
            listObject[counter] = s;
            counter++;
        }else{
            System.out.println("le tableau est rempli");
        }
    }

    public void supp(int index){

        list[index] = null;
    }

    @Override
    public void suppObj(int index) {
        listObject[index] = null;
    }

    @Override
    public void modifierObj(int index, Object nvObj) {

    }

    public void modifier(int index, String nouvelleValeur){

        list[index] = nouvelleValeur;
    }
    public int position(String valeur) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int positionObj(Object obj) {
        return 0;
    }

    public void afficher(){
        for (int i=0; i< list.length; i++){
            if(list[i] != null){
                System.out.println(list[i]);
            }
        }
    }

    @Override
    public void afficherObj() {

    }
}
