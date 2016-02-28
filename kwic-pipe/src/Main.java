import java.util.ArrayList;

/**
 * Created by Seven on 2/28/16.
 */
public class Main {
    public static void main(String[] args){



        Filter input = new Input();
        Filter output = new Output();
        Filter alpha = new Alphabetize();
        Filter shift = new Shift();

        Pipe pipe1 = new Pipeline();
        Pipe pipe2 = new Pipeline();
        Pipe pipe3 = new Pipeline();

        input.setPipe(pipe1);
        pipe1.setFilter(shift);
        shift.setPipe(pipe2);
        pipe2.setFilter(alpha);
        alpha.setPipe(pipe3);
        pipe3.setFilter(output);

        input.process(null);


    }
}
