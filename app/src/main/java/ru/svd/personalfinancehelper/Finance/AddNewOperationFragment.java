package ru.svd.personalfinancehelper.Finance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import ru.svd.personalfinancehelper.R;

public class AddNewOperationFragment extends Fragment {
    private Button btnOk;
    private EditText editName;
    private EditText editType;
    private EditText editSumm;
    private EditText editDescription;



    public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.add_new_operation_layout, parent, false);


        editName = view.findViewById(R.id.editName);
        String nameOp = editName.getText().toString();

        editType = view.findViewById(R.id.editType);
        String typeOp = editType.getText().toString();

        editSumm = view.findViewById(R.id.editSumm);
        String summOp = editSumm.getText().toString();

        editDescription = view.findViewById(R.id.editDescription);
        String descriptionOp = editDescription.getText().toString();


        Button btnOK = view.findViewById(R.id.addNewFinList);

        return view;
    }



}
