package ru.svd.personalfinancehelper.Finance;

import java.util.ArrayList;
import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import rx.Observable;
import rx.Observer;

public class FinanceOperationList {
    private List<FinancialOperation> list;
    private FinancialOperation financialOperation;

    Observer<FinancialOperation> observerFO = new Observer<FinancialOperation>() {
        @Override
        public void onCompleted() {
            list.add(financialOperation);
        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(FinancialOperation operation) {

        }
    };




}
