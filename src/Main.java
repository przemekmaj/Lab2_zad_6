
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zad1 zad1 = new Zad1();
        Zad2 zad2 = new Zad2();



        for(int i = 0; i < 5; i++) {
            System.out.println("Podaj zwierzeta: ");
            zad1.setElementOfList(scanner.nextLine());
        }
        zad1.showElemnentsOfList(zad1.getList());

        zad1.removeLastTwoElements();
        System.out.println("Dlugosc listy to: "+zad1.getList().size());
        zad1.showElemnentsOfList(zad1.getList());

        zad1.sortList();
        //Zad2

        for(int i=0; i < 10; i++){
            System.out.println("Podaj "+(i+1)+" liczbe");
            zad2.getValue(scanner.nextInt());

        }
        System.out.println(zad2.getSet());
        zad2.setForEach();

    }
}
