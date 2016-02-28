import java.util.ArrayList;

/**
 * Created by Seven on 2/28/16.
 */
public abstract class Pipe {

    protected Filter filter;

    public void setFilter(Filter f){
        this.filter=f;

    }

    public void handle(ArrayList<ArrayList<String>> al){
        filter.process(al);
    }
}
