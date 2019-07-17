package ru.svd.personalfinancehelper.Finance.mvp_finance.domain.interactors;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;

public class GetOperationListUseCase extends Observable<List<FinancialOperation>> {



    private List<FinancialOperation> list;




    protected List<FinancialOperation> GetOperationListUseCase() {
        return Observable.defer(() -> (
                return Observable.just( list ));

    }

    protected Observable<List<>>
}
