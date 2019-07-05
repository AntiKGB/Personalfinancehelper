package ru.svd.personalfinancehelper.Finance.mvp_finance.domain;

import dagger.Module;
import dagger.Provides;

@Module
public class FinancialOperation {
    private String nameOperation;
    private String typeOperation;
    private int summOperation;
    private String description;

    public FinancialOperation(String nameOperation, String typeOperation, int summOperation, String description) {
        this.nameOperation = nameOperation;
        this.typeOperation = typeOperation;
        this.summOperation = summOperation;
        this.description = description;
    }

    public String toString(){
        return "FinancialOperation{" +
                "nameOperation='" + nameOperation + '\'' +
                ", typeOperation='" + typeOperation + '\'' +
                ", summOperation='" + summOperation + '\'' +
                ", description='" + description +
                '}';
    }

    public String getName() {
        return nameOperation;
    }

    public String getType() {
        return typeOperation;
    }

    public int getSumm() {
        return summOperation;
    }

    public String getDescription() {
        return description;
    }
}
