package ru.svd.personalfinancehelper.Finance.mvp_finance;

import java.util.List;

import ru.svd.personalfinancehelper.FakeSingleSubscriber;
import ru.svd.personalfinancehelper.Finance.OperationListPresenterContract;
import ru.svd.personalfinancehelper.Finance.OperationListViewContract;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.interactors.GetOperationListUseCase;
import rx.Observable;

public class OperationListPresenter implements OperationListPresenterContract {

    public GetOperationListUseCase getOperationListUseCase;

    public OperationListPresenter(
            GetOperationListUseCase getOperationListUseCase,
            OperationListViewContract view
    ) {
        super( view);
        this.getOperationListUseCase = getOperationListUseCase;
    }

    public void getOperationList() {
        getOperationListUseCase.execute(new FakeSingleSubscriber<List<FinancialOperation>>)
    }

    protected Observable<List<FinancialOperation>>

}
