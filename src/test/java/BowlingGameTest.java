import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class BowlingGameTest {


    @Test
    public void doesGameExist(){
        new Game();
    }

    @Test
    public void sanity(){
        assertThat(0, is(0));
    }
}
