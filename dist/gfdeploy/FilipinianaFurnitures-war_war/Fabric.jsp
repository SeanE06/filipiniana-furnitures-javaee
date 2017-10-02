<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Fabric
    Created on : 09 28, 17, 5:50:16 PM
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
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="font-size: 36px; left: 600px; top: 72px; position: absolute" text="Fabrics"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 360px; top: 144px; position: absolute; width: 0px" title="Table" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.fabricsArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="fabricName" id="tableColumn1" sort="fabricName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['fabricName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="fabricColor" id="tableColumn2" sort="fabricColor">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['fabricColor']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="fabricPic" id="tableColumn3" sort="fabricPic">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['fabricPic']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="fabricRemarks" id="tableColumn4" sort="fabricRemarks">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['fabricRemarks']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Actions" id="tableColumn5">
                                    <webuijsf:button id="button2" text="Update"/>
                                    <webuijsf:button id="button3" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:hyperlink actionExpression="#{Fabric._lnkFabricToMenu_action}" binding="#{Fabric._lnkFabricToMenu}" id="_lnkFabricToMenu"
                            style="left: 360px; top: 120px; position: absolute" text="Back"/>
                        <webuijsf:button id="button1" style="height: 48px; left: 647px; top: 336px; position: absolute; width: 71px" text="New"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
