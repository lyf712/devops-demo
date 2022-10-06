package com.lyf;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * @author liyunfei
 */
public class RequestTests {
    
    /**
     * 模拟测试
     */
    @Test
    public void testMock(){
        Object o = null;
        Random random =new Random();
        int num = random.nextInt(10);
        if(num%2==0)
            o = num;
        Assert.assertNotNull(o);
    }
}
