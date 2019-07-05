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

import java.util.List;

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

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        return inflater.inflate(R.layout.finance_list, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addOp = view.findViewById(R.id.addNewFinList);
        remOp = view.findViewById(R.id.delFinList);
        //recyclerViewList = view.findViewById(R.id.infoFin);
    }

    public void setupList(RecyclerView recyclerViewList) {
        listAdapter = new ListAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerViewList.setLayoutManager(layoutManager);
        recyclerViewList.setAdapter(listAdapter);
        //presenter.getOperationList();
    }
}
