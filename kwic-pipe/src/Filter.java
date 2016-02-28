import java.util.ArrayList;

/**
 * Created by Seven on 2/28/16.
 */
public abstract class Filter {
    private Pipe pipe;
    protected ArrayList<ArrayList<String>> input=new ArrayList<ArrayList<String>>();
    protected ArrayList<ArrayList<String>> output=new ArrayList<ArrayList<String>>();

    public void setPipe(Pipe p){
        this.pipe = p;

    }

    public abstract ArrayList<ArrayList<String>> handle ();

    public void process(ArrayList<ArrayList<String>> al){
        if(al!=null)
            this.input = al;
        output = handle();
        if (pipe!=null)
            pipe.handle(output);

    }
}
