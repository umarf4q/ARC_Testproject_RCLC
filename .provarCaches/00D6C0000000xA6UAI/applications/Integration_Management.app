<?xml version="1.0" encoding="UTF-8"?>
<CustomApplication xmlns="http://soap.sforce.com/2006/04/metadata">
    <actionOverrides>
        <actionName>View</actionName>
        <comment>Action override created by Lightning App Builder during activation.</comment>
        <content>Account_Record_Page</content>
        <formFactor>Large</formFactor>
        <skipRecordTypeSelect>false</skipRecordTypeSelect>
        <type>Flexipage</type>
        <pageOrSobjectType>Account</pageOrSobjectType>
    </actionOverrides>
    <brand>
        <headerColor>#000000</headerColor>
        <shouldOverrideOrgTheme>false</shouldOverrideOrgTheme>
    </brand>
    <description>Consolidates tools to  manage integration</description>
    <formFactors>Large</formFactors>
    <isNavAutoTempTabsDisabled>false</isNavAutoTempTabsDisabled>
    <isNavPersonalizationDisabled>false</isNavPersonalizationDisabled>
    <label>Integration Management</label>
    <navType>Console</navType>
    <tabs>standard-Account</tabs>
    <tabs>ccrz__E_Order__c</tabs>
    <tabs>Fulfillment__c</tabs>
    <tabs>Geo_Location__c</tabs>
    <tabs>Fulfillment_Item__c</tabs>
    <tabs>Integration_Files__c</tabs>
    <tabs>Integration_Error_Log__c</tabs>
    <uiType>Lightning</uiType>
    <utilityBar>Integration_Management_UtilityBar</utilityBar>
    <workspaceConfig>
        <mappings>
            <tab>Fulfillment_Item__c</tab>
        </mappings>
        <mappings>
            <tab>Fulfillment__c</tab>
        </mappings>
        <mappings>
            <tab>Geo_Location__c</tab>
        </mappings>
        <mappings>
            <tab>Integration_Error_Log__c</tab>
        </mappings>
        <mappings>
            <tab>Integration_Files__c</tab>
        </mappings>
        <mappings>
            <tab>ccrz__E_Order__c</tab>
        </mappings>
        <mappings>
            <tab>standard-Account</tab>
        </mappings>
    </workspaceConfig>
</CustomApplication>
