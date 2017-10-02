<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FrameworkDesignAdd
    Created on : 09 30, 17, 8:13:42 AM
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
                        <webuijsf:label id="label1" style="font-size: 36px; left: 480px; top: 72px; position: absolute" text="Add Framework Design"/>
                        <webuijsf:label id="label2" style="left: 528px; top: 144px; position: absolute" text="Design Name"/>
                        <webuijsf:textField binding="#{FrameworkDesignAdd._txtFrameworkDesignName}" id="_txtFrameworkDesignName" style="position: absolute; left: 624px; top: 144px"/>
                        <webuijsf:textArea binding="#{FrameworkDesignAdd._txtFrameworkDesignDescription}" id="_txtFrameworkDesignDescription" style="left: 624px; top: 192px; position: absolute"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 528px; top: 192px" text="Description"/>
                        <webuijsf:button actionExpression="#{FrameworkDesignAdd._btnAddFrameworkDesign_action}"
                            binding="#{FrameworkDesignAdd._btnAddFrameworkDesign}" id="_btnAddFrameworkDesign"
                            style="height: 48px; left: 551px; top: 264px; position: absolute; width: 72px" text="Add"/>
                        <webuijsf:hyperlink actionExpression="#{FrameworkDesignAdd._lnkFrameworkDesignAddToFrameworkDesignMenu_action}"
                            binding="#{FrameworkDesignAdd._lnkFrameworkDesignAddToFrameworkDesignMenu}" id="_lnkFrameworkDesignAddToFrameworkDesignMenu"
                            style="left: 624px; top: 336px; position: absolute" text="Back"/>
                        <webuijsf:button binding="#{FrameworkDesignAdd._btnClearFrameworkDesignFields}" id="_btnClearFrameworkDesignFields"
                            style="height: 48px; left: 647px; top: 264px; position: absolute; width: 72px" text="Clear"/>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 552px; top: 360px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
