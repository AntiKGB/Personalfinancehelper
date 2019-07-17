package ru.svd.personalfinancehelper.Finance.mvp_finance.domain.interactors;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import rx.Single;
import rx.SingleSubscriber;

public class AddNewOperationUseCase extends Single<FinancialOperation> {
    protected AddNewOperationUseCase(OnSubscribe<FinancialOperation> f) {
        super( f );
    }

    private List<FinancialOperation> newItem(FinancialOperation operation){

        Single.just(operation)
                .subscribe(new SingleSubscriber<FinancialOperation>() {
                    @Override
                    public void onSuccess(FinancialOperation operation) {
                        list.add(operation);
                    }
                    @Override
                    public void onError(Throwable error) {
                    }
                });
        return list;
    }
}
