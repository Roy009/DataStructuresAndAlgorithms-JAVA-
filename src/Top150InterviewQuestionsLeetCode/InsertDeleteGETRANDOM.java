package Top150InterviewQuestionsLeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InsertDeleteGETRANDOM {

    HashSet<Integer> hashset;
    public void RandomizedSet() {
        hashset = new HashSet<>();
    }

    public boolean insert(int val) {
        if(!hashset.contains(val)){
            hashset.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(hashset.contains(val)){
            hashset.remove(val);
            return true;
        }
        return false;
    }
    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(hashset);
        int random = (int)(Math.random() * hashset.size());
        return list.get(random);
    }

    public static void main(String[] args) {

    }
}
