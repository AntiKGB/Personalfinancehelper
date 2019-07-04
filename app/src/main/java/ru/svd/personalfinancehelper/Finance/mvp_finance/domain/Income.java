package ru.svd.personalfinancehelper.Finance.mvp_finance.domain;

public class Income extends FinancialOperation {


    public Income(String nameOperation, String typeOperation, int summOperation, String description) {
        super(nameOperation, typeOperation, summOperation, description);
    }
}
