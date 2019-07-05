package ru.svd.personalfinancehelper.Finance.application;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.AddNewOperationFragment;
import ru.svd.personalfinancehelper.Finance.OperationListFragment;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.Finance.mvp_finance.ui.ListAdapter;
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
        fragmentTransaction.replace(R.id.container, operationListFragment);
    }



    public void onClick(View v) {
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
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
