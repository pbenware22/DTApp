package com.benware.dtapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.benware.dtapp.R;
import com.benware.dtapp.databinding.MainActivityBinding;
import com.benware.dtapp.model.AdItem2;
import com.benware.dtapp.model.AdsRoot;
import com.benware.dtapp.network.DTApi;
import com.benware.dtapp.network.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding binding;
    Retrofit retrofit;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: change to a progress bar
        progress = new ProgressDialog(MainActivity.this);
        progress.setMessage("loading");
        progress.show();

        retrofit = RetrofitClient.getClient(DTApi.DTApiUrl);
        DTApi api = retrofit.create(DTApi.class);
        Call<AdsRoot> result = api.doGetAds();
        result.enqueue(new Callback<AdsRoot>() {

            @Override
            public void onResponse(Call<AdsRoot> call, Response<AdsRoot> response) {
                if (response.body() != null) {
                    setupRecyclerView(response.body().ad);
                    Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_LONG);
                } else {
                    Toast.makeText(MainActivity.this, "not so much?!?", Toast.LENGTH_LONG);
                }
                progress.dismiss();
            }

            @Override
            public void onFailure(Call<AdsRoot> call, Throwable t) {
                t.printStackTrace();
                progress.dismiss();
            }
        });

        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

    }

    private void setupRecyclerView(List<AdItem2> adsList) {
        // setup the adapter for the recycler view
        ListItemAdapter adapter = new ListItemAdapter(adsList, this);
        binding.setListAdapter(adapter);

        // dismiss progress
        progress.dismiss();
    }
}