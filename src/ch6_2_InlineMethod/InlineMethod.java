package ch6_2_InlineMethod;

public class InlineMethod {
    private int _numberOfLateDeliveries;

    int getRating() {
        return _numberOfLateDeliveries > 5 ? 2 : 1;
    }

    ///**
    // * 内部代码 和 函数名称同样清晰易读
    // * @return boolean
    // */
    //private boolean moreThanFiveLateDeliveries() {
    //    // 内部代码
    //    return _numberOfLateDeliveries > 5;
    //}
}
