<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FabricTypeMenu
    Created on : 09 28, 17, 1:21:01 PM
    Author     : Publico
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="background-color: rgb(255, 255, 255); -rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="font-size: 36px; left: 552px; top: 48px; position: absolute" text="Fabric Type"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 408px; top: 120px; position: absolute; width: 0px" title="Table" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.fabricTypeArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="ftypeName" id="tableColumn1" sort="ftypeName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['ftypeName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="ftypeWeaves" id="tableColumn2" sort="ftypeWeaves">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['ftypeWeaves']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="ftypeStatus" id="tableColumn3" sort="ftypeStatus">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['ftypeStatus']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Actions" id="tableColumn4">
                                    <webuijsf:button id="button2" text="Update"/>
                                    <webuijsf:button id="button3" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:hyperlink actionExpression="#{FabricTypeMenu._lnkFabricTypeToMenu_action}" binding="#{FabricTypeMenu._lnkFabricTypeToMenu}"
                            id="_lnkFabricTypeToMenu" style="left: 408px; top: 96px; position: absolute" text="Back"/>
                        <webuijsf:button id="button1" style="height: 48px; left: 623px; top: 312px; position: absolute; width: 72px" text="New"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
