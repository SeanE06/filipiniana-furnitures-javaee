<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : FabricTextureMenu
    Created on : 09 28, 17, 1:08:37 PM
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
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 336px; top: 168px; position: absolute; width: 600px" title="Table" width="600">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.fabricTextureArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="textureName" id="tableColumn1" sort="textureName">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['textureName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="textureRating" id="tableColumn2" sort="textureRating" width="294">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['textureRating']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="textureDescription" id="tableColumn3" sort="textureDescription" width="286">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['textureDescription']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn4" width="153">
                                    <webuijsf:button id="button1" text="Update"/>
                                    <webuijsf:button id="button2" text="Deactivate"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label id="label1" style="font-size: 36px; left: 528px; top: 96px; position: absolute" text="Fabric Texture"/>
                        <webuijsf:hyperlink actionExpression="#{FabricTextureMenu._lnkFabricTextureToMenu_action}"
                            binding="#{FabricTextureMenu._lnkFabricTextureToMenu}" id="_lnkFabricTextureToMenu"
                            style="left: 336px; top: 96px; position: absolute" text="Back"/>
                        <webuijsf:button actionExpression="#{FabricTextureMenu._btnNewFabricTexture1_action}"
                            binding="#{FabricTextureMenu._btnNewFabricTexture1}" id="_btnNewFabricTexture1"
                            style="height: 48px; left: 335px; top: 120px; position: absolute; width: 72px" text="New"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
