package ru.svd.personalfinancehelper.Finance.mvp_finance.ui;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ru.svd.personalfinancehelper.Finance.mvp_finance.domain.FinancialOperation;
import ru.svd.personalfinancehelper.R;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private List<FinancialOperation> list;

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ListViewHolder(TextView view){
            super(view);
            textView = view;
        }
    }

    public ListAdapter(list) {

    }


}
