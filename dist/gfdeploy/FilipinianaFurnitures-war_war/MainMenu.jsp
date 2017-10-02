<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : MainMenu
    Created on : 09 28, 17, 12:51:06 PM
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
                        <webuijsf:label id="label1"
                            style="background-color: rgb(255, 255, 255); color: #996600; font-size: 72px; left: 288px; top: 0px; position: absolute; z-index: 500" text="Filipiniana Furnitures"/>
                        <webuijsf:button actionExpression="#{MainMenu._btnFabricTexture_action}" binding="#{MainMenu._btnFabricTexture}" id="_btnFabricTexture"
                            style="font-size: 24px; height: 48px; left: 335px; top: 216px; position: absolute; width: 168px; z-index: 502" text="Texture"/>
                        <webuijsf:button actionExpression="#{MainMenu._btnFabrics_action}" binding="#{MainMenu._btnFabrics}" id="_btnFabrics"
                            style="font-size: 36px; height: 144px; left: 167px; top: 216px; position: absolute; width: 168px; z-index: 502" text="Fabrics"/>
                        <webuijsf:button actionExpression="#{MainMenu._btnFabricType_action}" binding="#{MainMenu._btnFabricType}" id="_btnFabricType"
                            style="font-size: 24px; height: 48px; left: 335px; top: 264px; position: absolute; width: 168px; z-index: 502" text="Type"/>
                        <webuijsf:button actionExpression="#{MainMenu._btnFabricPattern_action}" binding="#{MainMenu._btnFabricPattern}" id="_btnFabricPattern"
                            style="font-size: 24px; height: 48px; left: 335px; top: 312px; position: absolute; width: 168px; z-index: 502" text="Pattern"/>
                        <webuijsf:label id="label2"
                            style="background-color: rgb(255, 255, 255); color: rgb(0, 0, 0); font-size: 44px; height: 48px; left: 216px; top: 120px; position: absolute; width: 190px; z-index: 501" text="Maintenance"/>
                        <webuijsf:button actionExpression="#{MainMenu._btnFramework_action}" binding="#{MainMenu._btnFramework}" id="_btnFramework"
                            style="font-size: 24px; height: 96px; left: 167px; top: 360px; position: absolute; width: 168px" text="Frameworks"/>
                        <webuijsf:button actionExpression="#{MainMenu._btnFrameworkDesign_action}" binding="#{MainMenu._btnFrameworkDesign}"
                            id="_btnFrameworkDesign" style="font-size: 24px; height: 48px; left: 335px; top: 360px; position: absolute; width: 168px" text="Design"/>
                        <webuijsf:button actionExpression="#{MainMenu._btnFrameworkMaterial_action}" binding="#{MainMenu._btnFrameworkMaterial}"
                            id="_btnFrameworkMaterial" style="font-size: 24px; height: 48px; left: 335px; top: 408px; position: absolute; width: 168px" text="Material"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
