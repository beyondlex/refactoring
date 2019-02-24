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
        dailyAction(service);
        // service.dailyAction()的替代版
    }

    /**
     * 在Client中建立一个函数，传入服务类实例，假装在Service创建了一个dailyAction函数
     * @param service
     */
    void dailyAction(Service service) {
        String dailyAction = service.walk()
                + " " + service.talk()
                + " " + service.sleep();
    }
}
