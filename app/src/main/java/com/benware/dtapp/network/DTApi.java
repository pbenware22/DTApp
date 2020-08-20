package com.benware.dtapp.network;

import com.benware.dtapp.model.AdsRoot;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DTApi {
    public static String DTApiUrl = "http://ads.appia.com/";
    static String getStr = "getAds?id=236&password=OVUJ1DJN&lname=benware&siteId=10777&deviceId=4230&sessionId=techtestsession&totalCampaignsRequested=10";

    @GET(getStr) Call<AdsRoot> doGetAds();

}
