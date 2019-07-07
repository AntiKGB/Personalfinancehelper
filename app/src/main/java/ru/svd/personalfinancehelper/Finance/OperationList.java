package ru.svd.personalfinancehelper.Finance;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;

public class OperationList {
    public List<FinancialOperation> list;

    private FinancialOperation financialOperation;
    public OperationList(Context context) {
        OperationList operationList = new OperationList(context);

    }

    public List<FinancialOperation> getOperationList() {
        List<FinancialOperation> operationList = new ArrayList<>();
        list.add(financialOperation);
        return operationList;
    }


}
