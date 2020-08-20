package com.benware.dtapp.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

@Root(name = "ads", strict = false)
public class AdsRoot {
    @ElementList(name = "ad", inline = true)
    public ArrayList<AdItem2> ad;

    @Element(name = "responseTime")
    String responseTime;

    @Element(name = "totalCampaignsRequested")
    int totalCampaigns;

    @Element(name = "version")
    String version;

    public AdsRoot() {

    }
}
