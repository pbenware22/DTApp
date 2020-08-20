package com.benware.dtapp.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.benware.dtapp.R;
import com.benware.dtapp.databinding.ListItemLayoutBinding;
import com.benware.dtapp.model.AdItem2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

import java.util.List;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ListItemViewHolder>
        implements CustomClickListener {

    private List<AdItem2> listItems;
    private Context context;

    public ListItemAdapter(List<AdItem2> listItems, Context ctx) {
        this.listItems = listItems;
        this.context = ctx;
    }

    @NonNull
    @Override
    public ListItemAdapter.ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListItemLayoutBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_layout, parent,false);
        return new ListItemViewHolder((binding));
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder holder, int position) {
        AdItem2 item = listItems.get(position);
        holder.bind(item);
        holder.binding.setItemClickListener(this);

        ImageView thumbnail = holder.binding.image;
        String url = item.getProductThumbnail();
        // TODO: need to workaround https vs http (certificate issues)
        url = url.replace("https", "http");

        Glide
                .with(context)
                .load(url)
                .thumbnail(0.1f)
                .into(thumbnail);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class ListItemViewHolder extends RecyclerView.ViewHolder {
        private ListItemLayoutBinding binding;

        public ListItemViewHolder(ListItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(AdItem2 dataModel) {
            binding.setDataContext(dataModel);
            binding.executePendingBindings();
        }
    }

    public void itemClicked(AdItem2 item) {
        Intent myIntent = new Intent(context, DetailActivity.class);
        myIntent.putExtra("key", item); //Optional parameters
        context.startActivity(myIntent);

        Toast.makeText(context, "You clicked " + item.getAppId(),
                Toast.LENGTH_LONG).show();
    }}
