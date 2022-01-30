import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Zad1 {
    private ArrayList<String> lista  = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> getList(){
        return this.lista;
    }

    public void setElementOfList(String lista1){
        this.lista.add(lista1);
    }

    public void showElemnentsOfList(ArrayList<String> listaElement){
        for(String animal : listaElement){
            System.out.println(animal);
        }
    }
    public void removeLastTwoElements(){
        lista.remove(lista.size()-1);
        lista.remove(lista.size()-1);
        lista.remove(1);


        for(int i = 0;i<4;i++){
            System.out.println("Podaj nazwe kolejnych zwierzat: ");
            lista.add(scanner.nextLine());
        }
    }

    public void sortList(){
        Collections.sort(lista);
        System.out.println("Sortowanie: ");
        showElemnentsOfList(lista);
        Collections.reverse(lista);
        System.out.println("Odwrotne sortowanie: ");
        showElemnentsOfList(lista);
    }
}

