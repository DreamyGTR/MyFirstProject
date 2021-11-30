package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public void test(){
        Assert.assertEquals("1","2");
    }

    @Test
    public void test1(){
        Assert.assertEquals("1","1");
    }
    @Test
    public void logDemo(){
        Reporter.log("测试日志!");
        throw new RuntimeException();
    }
}
