package com.cdk.hackathon.customer.assist.dto;

public class DealerInfo
{
    private String csStoreId;

    private String siteStoreId;

    private String ownerStoreId;

    private String locationName;

    public String getCsStoreId ()
    {
        return csStoreId;
    }

    public void setCsStoreId (String csStoreId)
    {
        this.csStoreId = csStoreId;
    }

    public String getSiteStoreId ()
    {
        return siteStoreId;
    }

    public void setSiteStoreId (String siteStoreId)
    {
        this.siteStoreId = siteStoreId;
    }

    public String getOwnerStoreId ()
    {
        return ownerStoreId;
    }

    public void setOwnerStoreId (String ownerStoreId)
    {
        this.ownerStoreId = ownerStoreId;
    }

    public String getLocationName ()
    {
        return locationName;
    }

    public void setLocationName (String locationName)
    {
        this.locationName = locationName;
    }
}
