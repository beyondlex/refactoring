package ch6_3_InlineTemp;

public class InlineTemp {
    private Order _order;

    private boolean notCheap() {
        // 你有一个临时变量，只被一个简单表达式赋值一次。但它妨碍了其他重构手法，所以需要对其进行inline temp
        double basePrice = _order.basePrice();
        return basePrice > 1000;
    }
}

class Order {
    private int _basePrice;
    public int basePrice() {
        return _basePrice;
    }
}
