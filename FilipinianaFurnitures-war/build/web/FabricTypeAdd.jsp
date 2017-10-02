<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FabricTypeAdd
    Created on : 09 30, 17, 7:35:20 AM
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
                        <webuijsf:label id="label1" style="font-size: 36px; left: 528px; top: 48px; position: absolute" text="Add Fabric Type"/>
                        <webuijsf:textField id="textField1" style="left: 624px; top: 144px; position: absolute"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 552px; top: 144px" text="Type Name"/>
                        <webuijsf:textField id="textField2" style="left: 624px; top: 192px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 552px; top: 192px; position: absolute" text="Weaves"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
