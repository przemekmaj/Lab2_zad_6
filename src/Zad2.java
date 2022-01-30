import java.util.TreeSet;
import java.util.Set;

public class Zad2 {
    private Set<Integer> liczby = new TreeSet<>();

    public void getValue(int value){
        liczby.add(value);
    }
    public Set<Integer> getSet(){
        return liczby;
    }
    public void setForEach(){
        for (int i : liczby){
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }
}
