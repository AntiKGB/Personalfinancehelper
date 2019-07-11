package ru.svd.personalfinancehelper.Finance;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.Finance.mvp_finance.ui.ListAdapter;
import ru.svd.personalfinancehelper.R;
import rx.Observable;
import rx.Observer;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;

public class OperationListFragment extends Fragment {
    private List<FinancialOperation> list;
    private ListAdapter listAdapter;
    private RecyclerView recyclerViewList;
    private Button addOp;
    private Button remOp;
    private Observer<FinancialOperation> observerOF;
    private Parcelable recyclerViewState;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.finance_list, container, false);
        list = new ArrayList<>();
        listAdapter = new ListAdapter(list);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String nameOp = bundle.getString("name");
            String typeOp = bundle.getString("type");
            String summOp = bundle.getString("summ");
            String descOp = bundle.getString("description");
            FinancialOperation financialOperation = new FinancialOperation(nameOp, typeOp, summOp, descOp);
            newItem(financialOperation);
        }

        listAdapter.setItems(list);
        recyclerViewList = view.findViewById(R.id.rvListView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerViewList.setLayoutManager(layoutManager);
        recyclerViewList.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
        recyclerViewState = recyclerViewList.getLayoutManager().onSaveInstanceState();
        return view;
    }


    private List<FinancialOperation> newItem(FinancialOperation operation){

        Single.just(operation)
                .subscribe(new SingleSubscriber<FinancialOperation>() {
                    @Override
                    public void onSuccess(FinancialOperation operation) {
                        list.add(operation);
                    }

                    @Override
                    public void onError(Throwable error) {

                    }
                });
        return list;
    }
}
