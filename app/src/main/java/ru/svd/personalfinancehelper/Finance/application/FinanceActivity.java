package ru.svd.personalfinancehelper.Finance.application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.AddNewOperationFragment;
import ru.svd.personalfinancehelper.Finance.OperationListFragment;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.R;

public class FinanceActivity extends FragmentActivity {


    private Button buttonAdd;
    private Button buttonDel;
    public List<FinancialOperation> list;
    private OperationListFragment operationListFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private AddNewOperationFragment addNewOperationFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);

        addNewOperationFragment = new AddNewOperationFragment();
        operationListFragment = new OperationListFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, operationListFragment);
        fragmentTransaction.commit();
    }



    public void onClick(View view) {
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.addNewFinList: {
                fragmentTransaction.replace(R.id.container, addNewOperationFragment );
                break;}
            case R.id.okButton: {
                fragmentTransaction.replace(R.id.container, operationListFragment);
                break;}
        }
        fragmentTransaction.commit();
    }




}
