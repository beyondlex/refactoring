package ch7_IntroduceForeignMethod;

import java.util.Date;

public class Service {

    String walk() {
        return "walk";
    }
    String talk() {
        return "talk";
    }
    String sleep() {
        return "sleep";
    }
    // 你需要为这个类增加一个函数，但你无法修改这个类。
}

class Client {

    private Service service;

    void doSth() {
        String dailyAction = service.walk()
                + " " + service.talk()
                + " " + service.sleep();

    }
}
