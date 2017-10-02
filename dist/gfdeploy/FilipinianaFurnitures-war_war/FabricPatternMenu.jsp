<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FabricPatternMenu
    Created on : 09 28, 17, 12:45:00 PM
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
                        <webuijsf:label id="label1" style="font-size: 36px; left: 528px; top: 96px; position: absolute" text="Fabric Patterns"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 360px; top: 168px; position: absolute; width: 576px" title="Table" width="576">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.fabricPatternArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="fpatternName" id="tableColumn1" sort="fpatternName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['fpatternName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="fpatternRemarks" id="tableColumn2" sort="fpatternRemarks">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['fpatternRemarks']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn3">
                                    <webuijsf:button id="button2" text="Update"/>
                                    <webuijsf:button id="button3" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:hyperlink actionExpression="#{FabricPatternMenu._lnkFabricPatternToMenu_action}"
                            binding="#{FabricPatternMenu._lnkFabricPatternToMenu}" id="_lnkFabricPatternToMenu"
                            style="left: 360px; top: 144px; position: absolute" text="Back"/>
                        <webuijsf:button id="button1" style="height: 48px; left: 623px; top: 312px; position: absolute; width: 72px" text="New"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
