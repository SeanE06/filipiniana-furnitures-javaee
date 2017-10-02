<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FrameworkDesignMenu
    Created on : 09 28, 17, 10:59:03 PM
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
                        <webuijsf:label id="label1" style="font-size: 36px; left: 528px; top: 72px; position: absolute" text="Framework Design"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 408px; top: 144px; position: absolute" title="Table" width="456">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.framedesignArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="designName" id="tableColumn1" sort="designName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['designName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="designDescription" id="tableColumn2" sort="designDescription">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['designDescription']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn3">
                                    <webuijsf:button id="button2" text="Update"/>
                                    <webuijsf:button id="button3" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:hyperlink actionExpression="#{FrameworkDesignMenu._lnkFrameworkDesignToMenu_action}"
                            binding="#{FrameworkDesignMenu._lnkFrameworkDesignToMenu}" id="_lnkFrameworkDesignToMenu"
                            style="left: 408px; top: 72px; position: absolute" text="Back"/>
                        <webuijsf:button actionExpression="#{FrameworkDesignMenu._btnFrameworkDesignAdd_action}"
                            binding="#{FrameworkDesignMenu._btnFrameworkDesignAdd}" id="_btnFrameworkDesignAdd"
                            style="height: 48px; left: 407px; top: 96px; position: absolute; width: 72px" text="New"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
