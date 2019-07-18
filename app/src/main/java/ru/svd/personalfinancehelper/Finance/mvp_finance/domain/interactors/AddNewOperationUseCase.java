package ru.svd.personalfinancehelper.Finance.mvp_finance.domain.interactors;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.PostExecutionTread;
import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;

public class AddNewOperationUseCase {
    Observable<List<FinancialOperation>> list;

    public AddNewOperationUseCase(
            ThreadPoolExecutor threadPoolExecutor,
            PostExecutionTread postExecutionTread
    ) {
        super(threadPoolExecutor, postExecutionTread);
    }

    protected Observable<List<FinancialOperation>> newItem() {
        return Observable.merge(  )
    }
}
