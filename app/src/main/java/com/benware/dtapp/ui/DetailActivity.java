package com.benware.dtapp.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.benware.dtapp.R;
import com.benware.dtapp.databinding.DetailActivityBinding;
import com.benware.dtapp.model.AdItem2;
import com.benware.dtapp.model.DetailRowData;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    DetailActivityBinding binding;

    AdItem2 data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
        data = i.getParcelableExtra("key");

        binding = DataBindingUtil.setContentView(this, R.layout.detail_activity);

        binding.setDataContext(data);

        ListView listView = binding.listView;
        ArrayList<DetailRowData> items = getDetailArrayList();
        DetailRowArrayAdapter adapter = new DetailRowArrayAdapter(this, items);
        listView.setAdapter(adapter);

    }

    private ArrayList<DetailRowData> getDetailArrayList() {
        Resources resources = getResources();
        ArrayList<DetailRowData> result = new ArrayList<>();

        DetailRowData item1 = new DetailRowData(resources.getString(R.string.averageRatingImageURL_label), data.getAveRatingImageUrl());
        result.add(item1);

        DetailRowData item2 = new DetailRowData(resources.getString(R.string.bidRate_label), data.getBidRate());
        result.add(item2);
        DetailRowData item3 = new DetailRowData(resources.getString(R.string.billingTypeId_label), Integer.toString(data.getBillingTypeId()));
        result.add(item3);
        DetailRowData item4 = new DetailRowData(resources.getString(R.string.callToAction_label), data.getCallToAction());
        result.add(item4);
        DetailRowData item5 = new DetailRowData(resources.getString(R.string.campaignId_label), Integer.toString(data.getCampaignId()));
        result.add(item5);
        DetailRowData item6 = new DetailRowData(resources.getString(R.string.campaignDisplayOrder_label), Integer.toString(data.getCampaignDisplayOrder()));
        result.add(item6);
        DetailRowData item7 = new DetailRowData(resources.getString(R.string.campaignTypeId_label), Integer.toString(data.getCampaignTypeId()));
        result.add(item7);
        DetailRowData item8 = new DetailRowData(resources.getString(R.string.categoryName_label), data.getCategoryName());
        result.add(item8);
        DetailRowData item9 = new DetailRowData(resources.getString(R.string.clickProxyURL_label), data.getClickProxyURL());
        result.add(item9);
        DetailRowData item10 = new DetailRowData(resources.getString(R.string.creativeId_label), Integer.toString(data.getCreativeId()));
        result.add(item10);
        DetailRowData item11 = new DetailRowData(resources.getString(R.string.homeScreen_label), data.getHomeScreen() ? "true" : "false");
        result.add(item11);
        DetailRowData item12 = new DetailRowData(resources.getString(R.string.impressionTrackingURL_label), data.getImpressionTrackingURL());
        result.add(item12);
        DetailRowData item13 = new DetailRowData(resources.getString(R.string.isRandomPick_label), data.isRandomPick() ? "true" : "false");
        result.add(item13);
        DetailRowData item14 = new DetailRowData(resources.getString(R.string.numberOfRatings_label), data.getNumberOfRatings());
        result.add(item14);
        DetailRowData item15 = new DetailRowData(resources.getString(R.string.productId_label), Integer.toString(data.getProductId()));
        result.add(item15);
        DetailRowData item16 = new DetailRowData(resources.getString(R.string.productName_label), data.getProductName());
        result.add(item16);
        DetailRowData item17 = new DetailRowData(resources.getString(R.string.productThumbnail_label), data.getProductThumbnail());
        result.add(item17);
        DetailRowData item18 = new DetailRowData(resources.getString(R.string.rating_label), data.getRating());
        result.add(item18);
        DetailRowData item19 = new DetailRowData(resources.getString(R.string.numberOfDownloads_label), data.getNumberOfDownloads());
        result.add(item19);
        DetailRowData item20 = new DetailRowData(resources.getString(R.string.tstiEligible_label), data.getTstiEligible() ? "true" : "false");
        result.add(item20);
        DetailRowData item21 = new DetailRowData(resources.getString(R.string.stiEnabled_label), data.getStiEnabled() ? "true" : "false");
        result.add(item21);

        return result;
    }
}
