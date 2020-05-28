package ar.empanada.ddd.snackmachine.domain

class Wallet {
    private static int EMPTY = 0
    int total
    Set<Money> money

    private Wallet(int startingTotal){
        total = startingTotal
    }

    int value(){
        money.sum{ coin -> coin.value()}
    }

    void add(Money coin){
        assert coin
        money.add(coin)
    }
    class Factory{
        static create(int valueCoin){
            return new Wallet(valueCoin)
        }
        /**
         * Zero value money
         * */
        static empty(){
            return new Wallet(EMPTY)
        }
    }
}
