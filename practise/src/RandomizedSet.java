import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedSet {

    private List<Integer> myRandomizedSet;
    public RandomizedSet() {
        this.myRandomizedSet = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(myRandomizedSet.contains(val)) return false;
        return myRandomizedSet.add(val);
    }

    public boolean remove(int val) {
        return myRandomizedSet.remove((Integer) val);
    }

    public int getRandom() {
        if(myRandomizedSet.isEmpty()) throw new RuntimeException("Empty set");
        int index = new Random().nextInt(myRandomizedSet.size());
        return myRandomizedSet.get(index);
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.remove(0));
        System.out.println(randomizedSet.remove(0));
        System.out.println(randomizedSet.insert(0));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(0));
        System.out.println(randomizedSet.insert(0));

    }
}
