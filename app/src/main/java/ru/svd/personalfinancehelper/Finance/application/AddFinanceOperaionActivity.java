package ru.svd.personalfinancehelper.Finance.application;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.R;

public class AddFinanceOperaionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_finance_operaion);

        Button btnOK = findViewById(R.id.okButton);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editName = findViewById(R.id.editName);
                final String nameOp = editName.getText().toString();

                EditText editType = findViewById(R.id.editType);
                final String typeOp = editType.getText().toString();

                EditText editSumm = findViewById(R.id.editSumm);
                final String summOp = editSumm.getText().toString();

                EditText editDescription = findViewById(R.id.editDescription);
                final String descriptionOp = editDescription.getText().toString();

                Intent intentAdd = new Intent(AddFinanceOperaionActivity.this, FinanceActivity.class);
                intentAdd.putExtra("name", nameOp);
                intentAdd.putExtra("type", typeOp);
                intentAdd.putExtra("summ", summOp);
                intentAdd.putExtra("description", descriptionOp);
                startActivity(intentAdd);
            }
        });
    }


}
