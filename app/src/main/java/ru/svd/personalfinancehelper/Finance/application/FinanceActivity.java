package ru.svd.personalfinancehelper.Finance.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.Wallet;
import ru.svd.personalfinancehelper.Finance.mvp_finance.ui.ListAdapter;
import ru.svd.personalfinancehelper.Login.LoginActivity;
import ru.svd.personalfinancehelper.R;

public class FinanceActivity extends FragmentActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private Button buttonAdd;
    private Button buttonDel;
    public List<FinancialOperation> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);

        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ListAdapter(List<FinancialOperation> list);
        recyclerView.setAdapter(adapter);

        buttonAdd = findViewById(R.id.addNewFinList);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinanceActivity.this, AddFinanceOperaionActivity.class);
                startActivity(intent);
            }
        });

        buttonDel = findViewById(R.id.delFinList);



        String nameOp = getIntent().getStringExtra("name");

        String typeOp = getIntent().getStringExtra("type");
        int summOp = Integer.parseInt(getIntent().getStringExtra("summ"));
        String descriptionOp = getIntent().getStringExtra("description");

        FinancialOperation financialOperation = new FinancialOperation(nameOp, typeOp, summOp, descriptionOp);
        list.add(financialOperation);


    }
}
