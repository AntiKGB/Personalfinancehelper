package ru.svd.personalfinancehelper.Finance;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.interactors.GetOperationListUseCase;
import ru.svd.personalfinancehelper.Finance.mvp_finance.ui.ListAdapter;
import ru.svd.personalfinancehelper.R;

public class OperationListFragment extends Fragment {
    private List<FinancialOperation> operationList;
    private OperationListPresenter presenter;
    private ListAdapter listAdapter;
    private RecyclerView recyclerViewList;
    private Button addOp;
    private Button remOp;
    private TextView textView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.finance_list, container, false);
 //
 //       ListAdapter listAdapter = new ListAdapter();
//        recyclerViewList.setAdapter(listAdapter);
 //       recyclerViewList.setLayoutManager(new LinearLayoutManager(getActivity()));
        //textView = view.findViewById(R.id.rvList);
        Bundle bundle = getArguments();
        if (bundle != null) {
            textView.setText(bundle.getString("newItem"));
            String nameOp = bundle.getString("name");
            String typeOp = bundle.getString("type");
            int summOp = Integer.parseInt(bundle.getString("summ"));
            String descOP = bundle.getString("description");
            FinancialOperation financialOperation = new FinancialOperation(nameOp, typeOp, summOp, descOP);
            operationList.add(financialOperation);
            recyclerViewList.setAdapter(new ListAdapter());
        }
        if (operationList != null) {
            recyclerViewList = view.findViewById(R.id.rvListView);
            recyclerViewList.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerViewList.setAdapter(new ListAdapter());
        }
        addOp = view.findViewById(R.id.addNewFinList);
        remOp = view.findViewById(R.id.delFinList);
        return view;
    }

    private void addItem() {
        saveItem();
    }

    private void saveItem() {

    }

    public List<FinancialOperation> getOperationList() {
        return null;
    }
}