package ru.svd.personalfinancehelper.Finance.mvp_finance.domain;

import android.support.v4.app.FragmentActivity;

import dagger.Component;
import ru.svd.personalfinancehelper.Finance.application.FinanceActivity;

@Component(modules = {FinancialOperation.class})
public interface AppComponent {
    void InjectsFinanceActivity(FinanceActivity financeActivity);
}
