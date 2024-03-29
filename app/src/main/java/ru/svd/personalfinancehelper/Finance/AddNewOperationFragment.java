package ru.svd.personalfinancehelper.Finance;

import android.os.Bundle;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.io.Serializable;
import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.R;
import rx.Single;
import rx.SingleSubscriber;

public class AddNewOperationFragment extends Fragment {
    private Button btnOk;
    private EditText editName;
    private EditText editType;
    private EditText editSumm;
    private EditText editDescription;
    public String nameO;
    public String typeO;
    public String summO;
    public String descO;
    public List<FinancialOperation> list;



    public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewANI = inflater.inflate(R.layout.add_new_operation_layout, parent, false);
        editName = viewANI.findViewById(R.id.editName);
        editType = viewANI.findViewById(R.id.editType);
        editSumm = viewANI.findViewById(R.id.editSumm);
        editSumm.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        editDescription = viewANI.findViewById(R.id.editDescription);
        btnOk = viewANI.findViewById(R.id.okButton);
        btnOk.setOnClickListener(mClickListener);
        return viewANI;
    }


    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            nameO = editName.getText().toString();
            typeO = editType.getText().toString();
            summO = editSumm.getText().toString();
            descO = editDescription.getText().toString();
            FragmentTransaction frt = getFragmentManager().beginTransaction();
            OperationListFragment operationListFragment = new OperationListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("name", nameO);
            bundle.putString("type", typeO);
            bundle.putString("summ", summO);
            bundle.putString("description", descO);
            operationListFragment.setArguments(bundle);
            frt.replace(R.id.container, operationListFragment);
            frt.isAddToBackStackAllowed();
            frt.addToBackStack(null);
            frt.commit();

        }
    };





}
