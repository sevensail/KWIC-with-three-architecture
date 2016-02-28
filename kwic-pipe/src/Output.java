import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * Created by Seven on 2/28/16.
 */
public class Output extends Filter {
    @Override
    public ArrayList<ArrayList<String>> handle() {
        try {
            PrintWriter writer=new PrintWriter(new FileOutputStream("output.txt"));
            for(int i=0;i<input.size();i++){
                String outString="";
                for(int j=0;j<input.get(i).size();j++){
                    outString+=input.get(i).get(j);
                    outString+=" ";
                }
                writer.println(outString);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
