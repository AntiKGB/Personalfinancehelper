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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.AddNewOperationFragment;
import ru.svd.personalfinancehelper.Finance.OperationListFragment;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.Finance.mvp_finance.ui.ListAdapter;
import ru.svd.personalfinancehelper.NewOperationIsCreated;
import ru.svd.personalfinancehelper.R;

public class FinanceActivity extends FragmentActivity implements NewOperationIsCreated {


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

                TextView textView = findViewById(R.id.rvList);

                EditText editName = view.findViewById(R.id.editName);
                String nameOp = editName.getText().toString();
                EditText editType = view.findViewById(R.id.editType);
                String typeOp = editType.getText().toString();
                EditText editSumm = view.findViewById(R.id.editSumm);
                String summOp = editSumm.getText().toString();
                EditText editDescription = view.findViewById(R.id.editDescription);
                String descriptonOp = editDescription.getText().toString();
                textView.setText("Имя" + nameOp + ", Тип:"+ typeOp + ", Сумма:" + summOp + ", Описание:" + descriptonOp);
                fragmentTransaction.replace(R.id.container, operationListFragment);
                break;}

        }
        fragmentTransaction.commit();
    }



    @Override
    public void addToList(String nameOp, String typeOp, int summOp, String descroptionOp){

    }
}
