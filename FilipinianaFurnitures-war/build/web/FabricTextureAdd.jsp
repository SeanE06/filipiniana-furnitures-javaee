<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FabricTextureAdd
    Created on : 09 29, 17, 2:12:24 PM
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
                        <webuijsf:label id="label1" style="font-size: 36px; left: 504px; top: 48px; position: absolute" text="Add Fabric Texture"/>
                        <webuijsf:textField binding="#{FabricTextureAdd._txtFabricTextureName}" id="_txtFabricTextureName" style="left: 648px; top: 144px; position: absolute"/>
                        <webuijsf:label id="label2" style="left: 552px; top: 144px; position: absolute" text="*Texture Name"/>
                        <webuijsf:textField binding="#{FabricTextureAdd._txtFabricTextureRating}" id="_txtFabricTextureRating" style="left: 648px; top: 192px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 552px; top: 192px; position: absolute" text="*Texture Rating"/>
                        <webuijsf:label id="label4" style="left: 552px; top: 240px; position: absolute" text="Description"/>
                        <webuijsf:textArea binding="#{FabricTextureAdd._txtFabricTextureDescription}" id="_txtFabricTextureDescription" style="left: 648px; top: 240px; position: absolute"/>
                        <webuijsf:button actionExpression="#{FabricTextureAdd._btnTextureAdd_action}" binding="#{FabricTextureAdd._btnTextureAdd}"
                            id="_btnTextureAdd" style="height: 48px; left: 575px; top: 312px; position: absolute; width: 72px" text="Add"/>
                        <webuijsf:button binding="#{FabricTextureAdd._btnClearTextureFields}" id="_btnClearTextureFields"
                            style="height: 48px; left: 671px; top: 312px; position: absolute; width: 72px" text="Clear"/>
                        <webuijsf:hyperlink actionExpression="#{FabricTextureAdd._lnkFabricTextureAddToMenu_action}"
                            binding="#{FabricTextureAdd._lnkFabricTextureAddToMenu}" id="_lnkFabricTextureAddToMenu"
                            style="left: 648px; top: 384px; position: absolute" text="Back"/>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 576px; top: 408px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
