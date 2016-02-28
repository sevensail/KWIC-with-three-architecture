import java.util.ArrayList;

/**
 * Created by Seven on 2/28/16.
 */
public class Shift extends Filter {
    @Override
    public ArrayList<ArrayList<String>> handle() {

        ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        ArrayList<String> tmp = new ArrayList<>();

        for(int i = 0;i<input.size();i++){
            tmp = input.get(i);
            for (int j = 0 ; j < tmp.size() ; j ++){
                ArrayList<String> shiftwords = new ArrayList<>();
                for(int k = 0 ; k < tmp.size() ; k ++){

                    shiftwords.add(tmp.get((j+k)%tmp.size()));
                }
                al.add(shiftwords);

            }
        }
        return al;
    }
}
