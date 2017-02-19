package com.zh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * 测试中激活profiles
 * Created by zh on 2017-02-19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceTestConfig.class)
@ActiveProfiles("dev")
public class PersistenceTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MagicBean magicBean;

    /**
     * 测试profiles加载
     */
    @Test
    public void test1() {
        assert dataSource != null;
    }

    /**
     * 测试@Conditional注解
     */
    @Test
    public void testCondition() {
        assert magicBean != null;
    }
}
