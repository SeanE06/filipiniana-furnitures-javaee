<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Framework
    Created on : 09 28, 17, 8:18:31 PM
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
                        <webuijsf:label id="label1" style="font-size: 36px; left: 528px; top: 48px; position: absolute" text="Frameworks"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 336px; top: 120px; position: absolute; width: 0px" title="Table" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.frameworksArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="frameworkName" id="tableColumn1" sort="frameworkName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['frameworkName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="frameworkPic" id="tableColumn2" sort="frameworkPic">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['frameworkPic']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="frameworkRemarks" id="tableColumn3" sort="frameworkRemarks">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['frameworkRemarks']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn4">
                                    <webuijsf:button id="button2" text="Update"/>
                                    <webuijsf:button id="button3" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:hyperlink actionExpression="#{Framework._lnkFrameworkToMenu_action}" binding="#{Framework._lnkFrameworkToMenu}"
                            id="_lnkFrameworkToMenu" style="left: 336px; top: 96px; position: absolute" text="Back"/>
                        <webuijsf:button id="button1" style="height: 48px; left: 599px; top: 312px; position: absolute; width: 71px" text="New"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
