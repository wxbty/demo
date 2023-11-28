package site.zfei.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Client {

    public void addByMap() {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 10000; i++) {
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
