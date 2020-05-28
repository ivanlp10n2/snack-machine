package ar.empanada.ddd.snackmachine.domain

enum Money {
    OneCent(1), TenCent(10), QuarterCent(25),
    OneDollar(100), FiveDollars(500), TwentyDollars(20000)

    private final int centValue

    Money(int value){
        centValue = value;
    }

    @Override
    String toString() {
        return name() +"="+ centValue;
    }

    int value() {
        centValue
    }
}
