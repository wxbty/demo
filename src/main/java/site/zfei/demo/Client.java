package site.zfei.demo;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public void addByMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            map.put("key" + i, i);
        }
    }


}
