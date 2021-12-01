package Test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Test {
    @org.testng.annotations.Test
    public void test() throws IOException {
        String result;
        HttpGet get=new HttpGet("http://www.baidu.com");
        HttpClient client=new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result=EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}
