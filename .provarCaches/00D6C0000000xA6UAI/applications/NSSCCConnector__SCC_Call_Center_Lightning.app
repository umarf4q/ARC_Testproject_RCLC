<?xml version="1.0" encoding="UTF-8"?>
<CustomApplication xmlns="http://soap.sforce.com/2006/04/metadata">
    <brand>
        <headerColor>#0070D2</headerColor>
        <shouldOverrideOrgTheme>false</shouldOverrideOrgTheme>
    </brand>
    <description>Call Center Console for Commerce Cloud</description>
    <formFactors>Large</formFactors>
    <isNavAutoTempTabsDisabled>false</isNavAutoTempTabsDisabled>
    <isNavPersonalizationDisabled>false</isNavPersonalizationDisabled>
    <label>SCC Call Center Lightning</label>
    <navType>Console</navType>
    <tabs>standard-Contact</tabs>
    <tabs>standard-Case</tabs>
    <tabs>standard-Order</tabs>
    <uiType>Lightning</uiType>
    <utilityBar>NSSCCConnector__SCC_Call_Center_Lightning_UtilityBar</utilityBar>
    <workspaceConfig>
        <mappings>
            <fieldName>ContactId</fieldName>
            <tab>standard-Case</tab>
        </mappings>
        <mappings>
            <tab>standard-Contact</tab>
        </mappings>
        <mappings>
            <fieldName>BillToContactId</fieldName>
            <tab>standard-Order</tab>
        </mappings>
    </workspaceConfig>
</CustomApplication>
