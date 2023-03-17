package cour_4_poo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //linkedList
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.contains(20));

        //stack
        //LIFO ( last in , first out)
        var stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop(); //recupere le dernier element de la liste et le supprime de la liste
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek(); //recupere le dernier element de la liste
        System.out.println(top);
        System.out.println(stack);

        //Queue : liste d'attente , FIFO ( first in , first out )
        var queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        var first = queue.remove();
        System.out.println(first);
        System.out.println(queue);

        /*Map : clé unique + valeur
        key : numero employee
        valeur : name employee
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name1");
        map.put(2, "name2");
        map.put(3, "name3");
        System.out.println(map);
        map.put(3, "name4");
        System.out.println(map);
        map.put(null, null);
        var value = map.get(3);
        System.out.println(value);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("name1"));
        for(var item: map.entrySet());


        //Exercice 1 : inverser une chaine de caractere

        //Exercice 2 : verifier que (<[ commence et fini par caractere et que se soit bien fermer
        //ex : " (kldk <> )[]

        //Exercice 3 : trouvé les caracteres non répété -> map

        //Exercice 4 : trouvé les caracteres répété -> map
    }
}
