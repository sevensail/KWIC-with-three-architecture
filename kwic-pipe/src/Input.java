import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Seven on 2/28/16.
 */
public class Input extends Filter {

    private String filePath = "input.txt";
    private ArrayList<ArrayList<String>> textWords=new ArrayList<ArrayList<String>>();

    public ArrayList<ArrayList<String>> handle(){
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filePath));
            String line=reader.readLine();
            while (line!=null){
                String[] words=line.split(" ");
                ArrayList<String> wordsList=new ArrayList<String>();
                for(int i=0;i<words.length;i++){
                    wordsList.add(words[i]);
                }
                textWords.add(wordsList);
                line=reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
        } catch (Exception e1){
        }
        return textWords;

    }
}
