package tp.structurededonnees.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fifo {
    /*
    Question 1 :
    - si la queue = 0 donc elle est vide
    - si la tete = 0 c'est la premiere valeur
    donc on rajoute toujours 1 quand on rajoute un element a la queue pour que la taille commence a 1
     */

    private int maxElem;
    private List<Object> file;
    private int end = 0;

    public Fifo(int maxElem) {
        if(maxElem <= 0){
            throw new IllegalArgumentException();
        }else{
            this.file = new ArrayList<>(maxElem);
        }
        this.maxElem = maxElem;
    }
    public Object offer(Object obj){
        Object ob = Objects.requireNonNull(obj, "object must be not null");
        if(this.end == this.maxElem){
            System.out.println("la liste est pleine");
            throw new IllegalStateException();
        }else{
            this.file.add(ob);
            this.end++;
            return ob;
        }
    }

    public Object poll(){
        if(this.end == 0){
            System.out.println("La file est vide");
            throw new IllegalStateException();
        }else{
            Object headObj = this.file.get(0);
            this.file.remove(headObj);
            this.end--;
            return headObj;
        }
    }

    public int size(){
        return this.end;
    }

    public boolean isEmpty(){
        if(this.end == 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return file.toString();
    }
}
