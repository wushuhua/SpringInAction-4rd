import com.zh.config.CDPlayerConfig;
import com.zh.soundsystem.CompactDisc;
import com.zh.soundsystem.MediaPlayer;
import org.junit.Test;
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

    @Autowired
    @Qualifier("cdPlayer")
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
