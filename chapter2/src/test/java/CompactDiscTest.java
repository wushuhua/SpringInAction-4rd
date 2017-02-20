import com.zh.config.ExpressiveConfig;
import com.zh.soundsystem.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zh on 2017-02-20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class CompactDiscTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void isNotNull() {
        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }
}
