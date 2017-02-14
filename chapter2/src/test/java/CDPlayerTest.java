import com.zh.config.CDPlayerConfig;
import com.zh.soundsystem.CompactDisc;
import com.zh.soundsystem.MediaPlayer;
import com.zh.soundsystem.SgtPeppers;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zh on 2017-02-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final TestWatcher testWatcher = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);
        }
    };

    @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    @Qualifier("sgtPeppers")  //修饰，获取具体的bean
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
        System.out.printf(cd.getClass().getSimpleName());
    }

    @Test
    public void play() {
        mediaPlayer.play();
    }
}
