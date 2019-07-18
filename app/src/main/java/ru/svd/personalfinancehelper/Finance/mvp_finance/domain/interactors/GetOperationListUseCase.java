package ru.svd.personalfinancehelper.Finance.mvp_finance.domain.interactors;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;

public class GetOperationListUseCase(
        List<FinancialOperation list>)
        ) {

    private final Object List;
    private List<FinancialOperation>;


    public getOperationList(){

    return Observable.defer( () ->
            Observable.just( List<FinancialOperation> ))
    Observable<List<FinancialOperation>> rxList = Observable.just( List<FinancialOperation> )

}
}
