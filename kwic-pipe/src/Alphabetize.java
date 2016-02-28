import java.util.ArrayList;

/**
 * Created by Seven on 2/28/16.
 */
public class Alphabetize extends Filter {
    @Override
    public ArrayList<ArrayList<String>> handle() {
        for(int i=1;i<input.size();i++){
            String word=input.get(i).get(0);
            ArrayList<String> line=input.get(i);
            int index=0;
            for(index=i-1;index>=0;index--){
                String compareWord=input.get(index).get(0);
                if(word.compareTo(compareWord)<0){
                    input.set(index+1,input.get(index));
                }else{
                    break;
                }
            }
            input.set(index+1,line);
        }
        return input;
    }
}
