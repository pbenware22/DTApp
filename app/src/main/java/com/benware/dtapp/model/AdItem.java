package com.benware.dtapp.model;

import android.os.Parcelable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ad", strict = false)
public class AdItem {
    @Element(name = "appId")
    public String appId;   // <appId>com.zynga.ozmatch</appId>

    @Element(name = "averageRatingImageURL")
    public String aveRatingImageUrl; // <averageRatingImageURL>https://cdn1.appia.com/cdn/adpub/appwallv1/rated-5-5.png</averageRatingImageURL>

    @Element(name = "bidRate")
    public String bidRate; // <bidRate>0.000</bidRate>

    @Element(name = "billingTypeId")
    public int billingTypeId; // <billingTypeId>1</billingTypeId>

    @Element(name = "callToAction")
    public String callToAction; // <callToAction>Install Now</callToAction>

    @Element(name = "campaignDisplayOrder")
    public int campaignDisplayOrder; // <campaignDisplayOrder>1</campaignDisplayOrder>

    @Element(name = "campaignId")
    public int campaignId; // <campaignId>24058</campaignId>

    @Element(name = "campaignTypeId")
    public int campaignTypeId; // <campaignTypeId>2</campaignTypeId>

    @Element(name = "categoryName")
    public String categoryName; // <categoryName>Puzzle</categoryName>

    @Element(name = "clickProxyURL")
    public String clickProxyURL; // <clickProxyURL>https://prlds.amer-prod.digitalturbine.com/v2/preloadAd.jsp?siteId=10777&deviceId=4230&spotId=&sessionId=techtestsession&campaignId=24058&creativeId=483970&packageName=com.zynga.ozmatch&fulfillmentTypeId=1&placementId=&campaignDisplayOrder=1&enc=true&ts=17401d8bfd2&algorithmId=-4&partner=154&homeScreen=false</clickProxyURL>

    @Element(name = "creativeId")
    public int creativeId; //<creativeId>483970</creativeId>

//    @Element(name = "externalMetaData")
//    public String externalMetaData; //<externalMetadata xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:nil="true"/>

    @Element(name = "homeScreen")
    public boolean homeScreen; // <homeScreen>false</homeScreen>

    @Element(name = "impressionTrackingURL")
    public String impressionTrackingURL; // <impressionTrackingURL>https://imps.appia.com/v2/impressionAd.jsp?siteId=10777&campaignId=24058&creativeId=483970&campaignDisplayOrder=1&ts=17401d8bfd2&sessionId=techtestsession&packageName=com.zynga.ozmatch&enc=true&eventGroupId=EVTGID1597758815947960435293143&algorithmId=-4&partner=154&subSite=[SUBSITE]</impressionTrackingURL>

    @Element(name = "isRandomPick")
    public boolean isRandomPick; // <isRandomPick>false</isRandomPick>

    @Element(name = "numberOfRatings")
    public String numberOfRatings; // <numberOfRatings>10,000+</numberOfRatings>

    @Element(name = "productDescription")
    public String productDescription; // <productDescription>Match your way to meet the wonderful Wizard of Oz in this amazing puzzle adventure!</productDescription>

    @Element(name = "productId")
    public int productId; // <productId>15338</productId>

    @Element(name = "productName")
    public String productName; // <productName>Wizard of Oz: Magic Match</productName>

    @Element(name = "productThumbnail")
    public String productThumbnail; // <productThumbnail>https://prod-static-images.s3.amazonaws.com/shared/creatives/15338/1385be772f424a3cb42cd8f07747b05b.png</productThumbnail>

    @Element(name = "rating")
    public String rating; // <rating>5.0</rating>

    @Element(name = "numberOfDownloads")
    public String numberOfDownloads; // <numberOfDownloads>10,000+</numberOfDownloads>

    @Element(name = "tstiEligible")
    public boolean tstiEligible; // <tstiEligible>false</tstiEligible>

    @Element(name = "stiEnabled")
    public boolean stiEnabled; // <stiEnabled>false</stiEnabled>

    // @Element(name = "")
    // <postInstallActions

    public AdItem() {
    }
}
