package ar.empanada.ddd.snackmachine.domain

trait MoneyMachine {
    Wallet virtualWallet = Wallet.Factory.empty()
    Wallet transactionalWallet

    void insert(Money money){
        transactionalWallet.add(money)
    }
    int value(){
        transactionalWallet
        ? transactionalWallet.value()
        : virtualWallet.value()
    }
    void buy(int moneyAmmount){
        if (transactionalWallet.value() < moneyAmmount)
            return
    }
}