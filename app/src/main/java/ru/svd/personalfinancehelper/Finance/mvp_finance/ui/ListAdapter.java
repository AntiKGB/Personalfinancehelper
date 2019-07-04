package ru.svd.personalfinancehelper.Finance.mvp_finance.ui;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.R;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private List<FinancialOperation> listOperation = new ArrayList<>();

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        private final TextView bodyOperation;

        public ListViewHolder(View view){
            super(view);
            bodyOperation = view.findViewById(R.id.infoFin);
        }
    }

    public void setList(List<FinancialOperation> list){
        listOperation.addAll(list);
        notifyDataSetChanged();
    }

    public  void clearList() {
        listOperation.clear();
        notifyDataSetChanged();
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.finance_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position){
        FinancialOperation financialOperation = listOperation.get(position);
        holder.bodyOperation.setText(financialOperation.toString());
    }

    @Override
    public int getItemCount(){
        return listOperation.size();
    }




}
