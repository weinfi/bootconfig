package com.leo;

import com.leo.entities.Department1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * Description:
 * Created by Liuq on 2020-01-13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void test1(){
       String a = Arrays.asList(new Department1(1,"h")).toString();
        System.out.println(a);
    }
}
