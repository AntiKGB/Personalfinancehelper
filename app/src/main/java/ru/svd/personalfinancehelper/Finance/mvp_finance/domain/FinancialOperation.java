package ru.svd.personalfinancehelper.Finance.mvp_finance.domain;

import dagger.Module;
import dagger.Provides;

@Module
public class FinancialOperation {
    private String nameOperation;
    private String typeOperation;
    private String summOperation;
    private String description;

    public FinancialOperation(String nameOperation, String typeOperation, String summOperation, String description) {
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
    public void setName(String nameOperation) {
        this.nameOperation = nameOperation;
    }

    public String getType() {
        return typeOperation;
    }
    public void setType(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getSumm() {
        return summOperation;
    }
    public void setSumm(String summOperation) {
        this.summOperation = summOperation;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }


}
