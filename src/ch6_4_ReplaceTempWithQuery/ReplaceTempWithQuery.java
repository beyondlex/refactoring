package ch6_4_ReplaceTempWithQuery;

public class ReplaceTempWithQuery {
    private double _quantity;
    private double _itemPrice;

    double getPrice() {
        // 以一个临时变量保存着某一表达式的运算结果：
        double basePrice = _quantity * _itemPrice;
        if (basePrice > 1000)
            return basePrice * 0.95;
        else
            return basePrice * 0.98;

        // 将这个表达式提炼到独立函数中。
        // 将这个临时变量的所有引用点，替换为对新函数的调用。
        // 此后，新函数就可被其他函数使用。
    }
}
