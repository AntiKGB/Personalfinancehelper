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

import ru.svd.personalfinancehelper.Finance.OperationList;
import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.R;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private List<FinancialOperation> listOperation = new ArrayList<>();

    /*public static class ListViewHolder extends RecyclerView.ViewHolder {
        public  TextView nameOperation;
        public   TextView typeOperation;
        public   TextView summOperation;
        public  TextView descOperation;

        public ListViewHolder(View view){
            super(view);
            nameOperation = view.findViewById(R.id.nameOperation);
            typeOperation = view.findViewById(R.id.typeOperation);
            summOperation = view.findViewById(R.id.summOperation);
            descOperation = view.findViewById(R.id.decrOperation);
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

       // holder.nameOperation.setText();
    }

    @Override
    public int getItemCount(){
        return listOperation.size();
    }



*/

    private List<FinancialOperation> list = new ArrayList<>();

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
        FinancialOperation finOp = list.get(position);
        holder.nameView.setText(finOp.getName());
        holder.typeView.setText(finOp.getType());
        holder.summView.setText(finOp.getSumm());
        holder.descView.setText(finOp.getDescription());
    }

    public int getItemCount(){
        return list.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView nameView;
        private TextView typeView;
        private TextView summView;
        private TextView descView;



        public ListViewHolder(View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.nameOperation);
            typeView = itemView.findViewById(R.id.typeOperation);
            summView = itemView.findViewById(R.id.summOperation);
            descView = itemView.findViewById(R.id.descriptionOp);

        }
    }
}
