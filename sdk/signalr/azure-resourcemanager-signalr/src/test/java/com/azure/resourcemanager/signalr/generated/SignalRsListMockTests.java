// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.models.AclAction;
import com.azure.resourcemanager.signalr.models.FeatureFlags;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SignalRRequestType;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SignalRsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"sku\":{\"name\":\"mf\",\"tier\":\"Basic\",\"size\":\"asqvd\",\"family\":\"y\",\"capacity\":1460947945},\"properties\":{\"provisioningState\":\"Creating\",\"externalIP\":\"sqzhzbezkg\",\"hostName\":\"sidxasicdd\",\"publicPort\":83141311,\"serverPort\":1032831795,\"version\":\"gfmo\",\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Creating\",\"privateEndpoint\":{},\"groupIds\":[\"jeaahhvjhh\",\"akz\",\"bbjjidjksyxk\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"xevbl\",\"name\":\"jednlj\",\"type\":\"age\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"xuns\",\"privateLinkResourceId\":\"jbnkpp\",\"provisioningState\":\"Failed\",\"requestMessage\":\"nlsvxeiz\",\"status\":\"Disconnected\"},\"id\":\"lnsrmffe\",\"name\":\"cxcktpi\",\"type\":\"merteeammxqiek\"},{\"properties\":{\"groupId\":\"zddrt\",\"privateLinkResourceId\":\"g\",\"provisioningState\":\"Creating\",\"requestMessage\":\"mxvavrefdee\",\"status\":\"Pending\"},\"id\":\"uij\",\"name\":\"xtxsuwprtujw\",\"type\":\"awddjibab\"},{\"properties\":{\"groupId\":\"ititvtzeexavoxt\",\"privateLinkResourceId\":\"glecdmdqbwpypq\",\"provisioningState\":\"Creating\",\"requestMessage\":\"jacbslhhxudbxvod\",\"status\":\"Disconnected\"},\"id\":\"irudh\",\"name\":\"m\",\"type\":\"es\"},{\"properties\":{\"groupId\":\"dlpagzrcxfail\",\"privateLinkResourceId\":\"f\",\"provisioningState\":\"Succeeded\",\"requestMessage\":\"boxdfgsftufq\",\"status\":\"Rejected\"},\"id\":\"lnacgcc\",\"name\":\"knh\",\"type\":\"kizvytn\"}],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"jraaeranokqguk\",\"features\":[{\"flag\":\"EnableMessagingLogs\",\"value\":\"vbroylaxxu\",\"properties\":{\"jbjsvgjrwh\":\"isdos\",\"nwm\":\"yvycytdclxgcckn\",\"a\":\"tmvpdvjdhtt\",\"rjdqnsdfzp\":\"fedxihchrphkm\"}}],\"liveTraceConfiguration\":{\"enabled\":\"gkylkdghr\",\"categories\":[{\"name\":\"tl\",\"enabled\":\"ez\"},{\"name\":\"hokvbwnh\",\"enabled\":\"qlgehg\"},{\"name\":\"ipifhpfeoajvg\",\"enabled\":\"txjcsheafidlt\"},{\"name\":\"sr\",\"enabled\":\"mks\"}]},\"resourceLogConfiguration\":{\"categories\":[{\"name\":\"ftxfkf\",\"enabled\":\"gpr\"},{\"name\":\"tillucbiqtg\",\"enabled\":\"ohmcwsld\"},{\"name\":\"zetpwbra\",\"enabled\":\"libph\"},{\"name\":\"zmizakakan\",\"enabled\":\"p\"}]},\"cors\":{\"allowedOrigins\":[\"ha\",\"oylhjlmuoyxprimr\",\"opteecj\",\"eislstvasylwx\"]},\"serverless\":{\"connectionTimeoutInSeconds\":2139579132},\"upstream\":{\"templates\":[{\"hubPattern\":\"ohguuf\",\"eventPattern\":\"boyjathwt\",\"categoryPattern\":\"lbaemwmdxmeb\",\"urlTemplate\":\"jscjpahl\",\"auth\":{}},{\"hubPattern\":\"a\",\"eventPattern\":\"qxnmwmqt\",\"categoryPattern\":\"xyi\",\"urlTemplate\":\"ddtvqctt\",\"auth\":{}},{\"hubPattern\":\"jaeukmrsieekpn\",\"eventPattern\":\"aapm\",\"categoryPattern\":\"qmeqwigpibudqwyx\",\"urlTemplate\":\"beybpmzznrtffyaq\",\"auth\":{}},{\"hubPattern\":\"hheioqaqhvseuf\",\"eventPattern\":\"yrxpdlcgqls\",\"categoryPattern\":\"mjqfrddgamquhio\",\"urlTemplate\":\"rsjuivfcdisyir\",\"auth\":{}}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"ServerConnection\",\"Trace\",\"ServerConnection\"],\"deny\":[\"RESTAPI\",\"Trace\",\"ServerConnection\"]},\"privateEndpoints\":[{\"name\":\"qvwre\",\"allow\":[\"ClientConnection\"],\"deny\":[\"ServerConnection\",\"Trace\",\"ServerConnection\",\"Trace\"]},{\"name\":\"zlrpiqywncvj\",\"allow\":[\"ClientConnection\"],\"deny\":[\"RESTAPI\",\"ServerConnection\",\"ClientConnection\"]},{\"name\":\"htd\",\"allow\":[\"ClientConnection\",\"ClientConnection\",\"ServerConnection\"],\"deny\":[\"ServerConnection\",\"ServerConnection\",\"RESTAPI\",\"Trace\"]},{\"name\":\"murvzm\",\"allow\":[\"RESTAPI\",\"ServerConnection\",\"ServerConnection\"],\"deny\":[\"ServerConnection\",\"RESTAPI\",\"ClientConnection\",\"ServerConnection\"]}],\"ipRules\":[{\"value\":\"erbdk\",\"action\":\"Deny\"},{\"value\":\"di\",\"action\":\"Deny\"}]},\"publicNetworkAccess\":\"db\",\"disableLocalAuth\":false,\"disableAadAuth\":true,\"regionEndpointEnabled\":\"nfdgn\",\"resourceStopped\":\"cypuuwwlt\"},\"kind\":\"RawWebSockets\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"boldforobwj\":{\"principalId\":\"keifzzhmkdasv\",\"clientId\":\"yhbxcudchxgs\"}},\"principalId\":\"izbfhfovvacq\",\"tenantId\":\"tuodxeszabbelaw\"},\"location\":\"ua\",\"tags\":{\"cqucwyhahnom\":\"kwrrwo\",\"utlwexxwla\":\"rkywuhpsvfuu\",\"yb\":\"niexzsrzpgepq\"},\"id\":\"wwpgdakchzyvlixq\",\"name\":\"rkcxkj\",\"type\":\"bn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SignalRManager manager = SignalRManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SignalRResource> response = manager.signalRs().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ua", response.iterator().next().location());
        Assertions.assertEquals("kwrrwo", response.iterator().next().tags().get("cqucwyhahnom"));
        Assertions.assertEquals("mf", response.iterator().next().sku().name());
        Assertions.assertEquals(SignalRSkuTier.BASIC, response.iterator().next().sku().tier());
        Assertions.assertEquals(1460947945, response.iterator().next().sku().capacity());
        Assertions.assertEquals(ServiceKind.RAW_WEB_SOCKETS, response.iterator().next().kind());
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals(false, response.iterator().next().tls().clientCertEnabled());
        Assertions.assertEquals(FeatureFlags.ENABLE_MESSAGING_LOGS,
            response.iterator().next().features().get(0).flag());
        Assertions.assertEquals("vbroylaxxu", response.iterator().next().features().get(0).value());
        Assertions.assertEquals("isdos", response.iterator().next().features().get(0).properties().get("jbjsvgjrwh"));
        Assertions.assertEquals("gkylkdghr", response.iterator().next().liveTraceConfiguration().enabled());
        Assertions.assertEquals("tl", response.iterator().next().liveTraceConfiguration().categories().get(0).name());
        Assertions.assertEquals("ez",
            response.iterator().next().liveTraceConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("ftxfkf",
            response.iterator().next().resourceLogConfiguration().categories().get(0).name());
        Assertions.assertEquals("gpr",
            response.iterator().next().resourceLogConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("ha", response.iterator().next().cors().allowedOrigins().get(0));
        Assertions.assertEquals(2139579132, response.iterator().next().serverless().connectionTimeoutInSeconds());
        Assertions.assertEquals("ohguuf", response.iterator().next().upstream().templates().get(0).hubPattern());
        Assertions.assertEquals("boyjathwt", response.iterator().next().upstream().templates().get(0).eventPattern());
        Assertions.assertEquals("lbaemwmdxmeb",
            response.iterator().next().upstream().templates().get(0).categoryPattern());
        Assertions.assertEquals("jscjpahl", response.iterator().next().upstream().templates().get(0).urlTemplate());
        Assertions.assertEquals(AclAction.DENY, response.iterator().next().networkACLs().defaultAction());
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION,
            response.iterator().next().networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(SignalRRequestType.RESTAPI,
            response.iterator().next().networkACLs().publicNetwork().deny().get(0));
        Assertions.assertEquals(SignalRRequestType.CLIENT_CONNECTION,
            response.iterator().next().networkACLs().privateEndpoints().get(0).allow().get(0));
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION,
            response.iterator().next().networkACLs().privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("qvwre", response.iterator().next().networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("erbdk", response.iterator().next().networkACLs().ipRules().get(0).value());
        Assertions.assertEquals(AclAction.DENY, response.iterator().next().networkACLs().ipRules().get(0).action());
        Assertions.assertEquals("db", response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals(false, response.iterator().next().disableLocalAuth());
        Assertions.assertEquals(true, response.iterator().next().disableAadAuth());
        Assertions.assertEquals("nfdgn", response.iterator().next().regionEndpointEnabled());
        Assertions.assertEquals("cypuuwwlt", response.iterator().next().resourceStopped());
    }
}
