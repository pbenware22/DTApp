package com.benware.dtapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.benware.dtapp.R;
import com.benware.dtapp.model.DetailRowData;

import java.util.ArrayList;
import java.util.List;

public class DetailRowArrayAdapter extends ArrayAdapter<DetailRowData> {
    private Context mContext;
    private List<DetailRowData> itemList = new ArrayList<>();

    public DetailRowArrayAdapter(@NonNull Context context, ArrayList<DetailRowData> list) {
        super(context, 0 , list);
        mContext = context;
        itemList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.detail_list_row, parent, false);

        DetailRowData currentItem = itemList.get(position);

        TextView label = (TextView) listItem.findViewById(R.id.label);
        label.setText(currentItem.getLabel());

        TextView field = (TextView) listItem.findViewById(R.id.field);
        field.setText(currentItem.getField());

        return listItem;
    }

}
