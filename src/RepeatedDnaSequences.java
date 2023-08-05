import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> set = new HashSet<>();
        Set<String> list= new HashSet<>();
        for (int i=0;i<s.length()-10;i++){
            String subsrtring=s.substring(i,i+10);
            if (set.contains(subsrtring)){
                list.add(subsrtring);
            }
            else {
                set.add(subsrtring);
            }
        }
        return new ArrayList(list);
    }
}
