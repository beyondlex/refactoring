package ch6_4_ReplaceTempWithQuery;

public class ReplaceTempWithQuery {
    private double _quantity;
    private double _itemPrice;

    double getPrice() {
        // 以一个临时变量保存着某一表达式的运算结果：
        //double basePrice = _quantity * _itemPrice;
        //if (basePrice > 1000)
        //    return basePrice * 0.95;
        //else
        //    return basePrice * 0.98;

        // 临时变量的问题在于：它是暂时性的，而且只能在所属函数内使用。
        // 如果把临时变量替换为一个查询 ，那么同一个类中的所有函数 都可以获得这份信息。
        // Temp变量往往使Extract Method难以进行， 所以你应该尽可能把它们替换为Query

        if (basePrice() > 1000)
            return basePrice() * 0.95;
        else
            return basePrice() * 0.98;

        // 将这个表达式提炼到独立函数中。
        // 将这个临时变量的所有引用点，替换为对新函数的调用。
        // 此后，新函数就可被其他函数使用。
    }

    // Query
    private double basePrice() {
        return _quantity * _itemPrice;
    }

    double getHalfPrice() {
        // 使类中其它函数(getHalfPrice)可使用basePrice, 而不是局限在getPrice()方法中
        return basePrice() * 0.5;
    }
}
