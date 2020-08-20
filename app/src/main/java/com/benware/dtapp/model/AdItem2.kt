package com.benware.dtapp.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "ad", strict = false)
class AdItem2() : Parcelable {  // @Element(name = "")
// <postInstallActions
    @set:Element(name = "appId")
    @get:Element(name = "appId")
    var appId // <appId>com.zynga.ozmatch</appId>
            : String? = null

    @set:Element(name = "averageRatingImageURL")
    @get:Element(name = "averageRatingImageURL")
    var aveRatingImageUrl // <averageRatingImageURL>https://cdn1.appia.com/cdn/adpub/appwallv1/rated-5-5.png</averageRatingImageURL>
            : String? = null

    @set:Element(name = "bidRate")
    @get:Element(name = "bidRate")
    var bidRate // <bidRate>0.000</bidRate>
            : String? = null

    @set:Element(name = "billingTypeId")
    @get:Element(name = "billingTypeId")
    var billingTypeId // <billingTypeId>1</billingTypeId>
            = 0

    @set:Element(name = "callToAction")
    @get:Element(name = "callToAction")
    var callToAction // <callToAction>Install Now</callToAction>
            : String? = null

    @set:Element(name = "campaignDisplayOrder")
    @get:Element(name = "campaignDisplayOrder")
    var campaignDisplayOrder // <campaignDisplayOrder>1</campaignDisplayOrder>
            = 0

    @set:Element(name = "campaignId")
    @get:Element(name = "campaignId")
    var campaignId // <campaignId>24058</campaignId>
            = 0

    @set:Element(name = "campaignTypeId")
    @get:Element(name = "campaignTypeId")
    var campaignTypeId // <campaignTypeId>2</campaignTypeId>
            = 0

    @set:Element(name = "categoryName")
    @get:Element(name = "categoryName")
    var categoryName // <categoryName>Puzzle</categoryName>
            : String? = null

    @set:Element(name = "clickProxyURL")
    @get:Element(name = "clickProxyURL")
    var clickProxyURL // <clickProxyURL>https://prlds.amer-prod.digitalturbine.com/v2/preloadAd.jsp?siteId=10777&deviceId=4230&spotId=&sessionId=techtestsession&campaignId=24058&creativeId=483970&packageName=com.zynga.ozmatch&fulfillmentTypeId=1&placementId=&campaignDisplayOrder=1&enc=true&ts=17401d8bfd2&algorithmId=-4&partner=154&homeScreen=false</clickProxyURL>
            : String? = null

    @set:Element(name = "creativeId")
    @get:Element(name = "creativeId")
    var creativeId //<creativeId>483970</creativeId>
            = 0

    //    @Element(name = "externalMetaData")
    //    public String externalMetaData; //<externalMetadata xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:nil="true"/>
    @set:Element(name = "homeScreen")
    @get:Element(name = "homeScreen")
    var homeScreen // <homeScreen>false</homeScreen>
            = false

    @set:Element(name = "impressionTrackingURL")
    @get:Element(name = "impressionTrackingURL")
    var impressionTrackingURL // <impressionTrackingURL>https://imps.appia.com/v2/impressionAd.jsp?siteId=10777&campaignId=24058&creativeId=483970&campaignDisplayOrder=1&ts=17401d8bfd2&sessionId=techtestsession&packageName=com.zynga.ozmatch&enc=true&eventGroupId=EVTGID1597758815947960435293143&algorithmId=-4&partner=154&subSite=[SUBSITE]</impressionTrackingURL>
            : String? = null

    @set:Element(name = "isRandomPick")
    @get:Element(name = "isRandomPick")
    var isRandomPick // <isRandomPick>false</isRandomPick>
            = false

    @set:Element(name = "numberOfRatings")
    @get:Element(name = "numberOfRatings")
    var numberOfRatings // <numberOfRatings>10,000+</numberOfRatings>
            : String? = null

    @set:Element(name = "productDescription")
    @get:Element(name = "productDescription")
    var productDescription // <productDescription>Match your way to meet the wonderful Wizard of Oz in this amazing puzzle adventure!</productDescription>
            : String? = null

    @set:Element(name = "productId")
    @get:Element(name = "productId")
    var productId // <productId>15338</productId>
            = 0

    @set:Element(name = "productName")
    @get:Element(name = "productName")
    var productName // <productName>Wizard of Oz: Magic Match</productName>
            : String? = null

    @set:Element(name = "productThumbnail")
    @get:Element(name = "productThumbnail")
    var productThumbnail // <productThumbnail>https://prod-static-images.s3.amazonaws.com/shared/creatives/15338/1385be772f424a3cb42cd8f07747b05b.png</productThumbnail>
            : String? = null

    @set:Element(name = "rating")
    @get:Element(name = "rating")
    var rating // <rating>5.0</rating>
            : String? = null

    @set:Element(name = "numberOfDownloads")
    @get:Element(name = "numberOfDownloads")
    var numberOfDownloads // <numberOfDownloads>10,000+</numberOfDownloads>
            : String? = null

    @set:Element(name = "tstiEligible")
    @get:Element(name = "tstiEligible")
    var tstiEligible // <tstiEligible>false</tstiEligible>
            = false

    @set:Element(name = "stiEnabled")
    @get:Element(name = "stiEnabled")
    var stiEnabled // <stiEnabled>false</stiEnabled>
            = false

    constructor(parcel: Parcel) : this() {
        appId = parcel.readString()
        aveRatingImageUrl = parcel.readString()
        bidRate = parcel.readString()
        billingTypeId = parcel.readInt()
        callToAction = parcel.readString()
        campaignDisplayOrder = parcel.readInt()
        campaignId = parcel.readInt()
        campaignTypeId = parcel.readInt()
        categoryName = parcel.readString()
        clickProxyURL = parcel.readString()
        creativeId = parcel.readInt()
        homeScreen = parcel.readByte() != 0.toByte()
        impressionTrackingURL = parcel.readString()
        isRandomPick = parcel.readByte() != 0.toByte()
        numberOfRatings = parcel.readString()
        productDescription = parcel.readString()
        productId = parcel.readInt()
        productName = parcel.readString()
        productThumbnail = parcel.readString()
        rating = parcel.readString()
        numberOfDownloads = parcel.readString()
        tstiEligible = parcel.readByte() != 0.toByte()
        stiEnabled = parcel.readByte() != 0.toByte()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(appId)
        parcel.writeString(aveRatingImageUrl)
        parcel.writeString(bidRate)
        parcel.writeInt(billingTypeId)
        parcel.writeString(callToAction)
        parcel.writeInt(campaignDisplayOrder)
        parcel.writeInt(campaignId)
        parcel.writeInt(campaignTypeId)
        parcel.writeString(categoryName)
        parcel.writeString(clickProxyURL)
        parcel.writeInt(creativeId)
        parcel.writeByte(if (homeScreen) 1 else 0)
        parcel.writeString(impressionTrackingURL)
        parcel.writeByte(if (isRandomPick) 1 else 0)
        parcel.writeString(numberOfRatings)
        parcel.writeString(productDescription)
        parcel.writeInt(productId)
        parcel.writeString(productName)
        parcel.writeString(productThumbnail)
        parcel.writeString(rating)
        parcel.writeString(numberOfDownloads)
        parcel.writeByte(if (tstiEligible) 1 else 0)
        parcel.writeByte(if (stiEnabled) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AdItem2> {
        override fun createFromParcel(parcel: Parcel): AdItem2 {
            return AdItem2(parcel)
        }

        override fun newArray(size: Int): Array<AdItem2?> {
            return arrayOfNulls(size)
        }
    }
}