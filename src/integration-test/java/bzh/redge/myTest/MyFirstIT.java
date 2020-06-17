package bzh.redge.myTest;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

public class MyFirstIT {

    @Test
    public void myTest(){
        MatcherAssert.assertThat("hello it", CoreMatchers.equalTo("hello it"));
    }
}
