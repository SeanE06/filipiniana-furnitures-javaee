<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FrameworkMaterialMenu
    Created on : 09 28, 17, 11:09:40 PM
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
                        <webuijsf:label id="label1" style="font-size: 36px; left: 504px; top: 72px; position: absolute" text="Frame Material"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 408px; top: 144px; position: absolute; width: 450px" title="Table" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.framematerialArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="materialName" id="tableColumn1" sort="materialName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['materialName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="materialRemarks" id="tableColumn2" sort="materialRemarks">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['materialRemarks']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Actions" id="tableColumn3">
                                    <webuijsf:button id="button2" text="Update"/>
                                    <webuijsf:button id="button3" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:hyperlink actionExpression="#{FrameworkMaterialMenu._lnkFrameMaterialToMenu_action}" id="_lnkFrameMaterialToMenu"
                            style="left: 408px; top: 120px; position: absolute" text="Back"/>
                        <webuijsf:button id="button1" style="height: 48px; left: 599px; top: 336px; position: absolute; width: 72px" text="New"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
