package ru.svd.personalfinancehelper.Finance.mvp_finance.ui;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.R;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private List<FinancialOperation> list = new ArrayList<>();

    public ListAdapter(List<FinancialOperation> mFinOpList){
        list = mFinOpList;
    }


    public void setItems(List<FinancialOperation> listOperation){
        list.addAll(listOperation);
        notifyDataSetChanged();
    }

    public void clearItems(){
        list.clear();
        notifyDataSetChanged();
    }

    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ListViewHolder(view);
    }

    public void onBindViewHolder(ListViewHolder holder, int position) {
        FinancialOperation operation = list.get(position);
        holder.bind(operation);


    }

    public int getItemCount(){
        return list.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView nameView;
        private TextView typeView;
        private TextView summView;
        private TextView descView;
        private FinancialOperation fOperation;



        public ListViewHolder(View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.nameOperation);
            typeView = itemView.findViewById(R.id.typeOperation);
            summView = itemView.findViewById(R.id.summOperation);
            descView = itemView.findViewById(R.id.descriptionOp);
        }

        public void bind(FinancialOperation operation){
            fOperation = operation;
            nameView.setText(fOperation.getName());
            typeView.setText(fOperation.getType());
            summView.setText(fOperation.getSumm());
//            descView.setText(fOperation.getDescription());
        }
    }
}
