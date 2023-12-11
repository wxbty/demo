package site.zfei.demo;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public void addByMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 3000; i++) {
            map.put("key" + i, i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("use concurrentHashMap");
    }


}
