// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDevice;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.models.SkuName;
import com.azure.resourcemanager.databoxedge.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DevicesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"location\":\"hneuyowqkd\",\"tags\":{\"ib\":\"i\"},\"sku\":{\"name\":\"Edge\",\"tier\":\"Standard\"},\"etag\":\"pzimejzanlfzxi\",\"properties\":{\"dataBoxEdgeDeviceStatus\":\"Maintenance\",\"serialNumber\":\"zonokixrjqci\",\"description\":\"zpfrla\",\"modelDescription\":\"zrnw\",\"deviceType\":\"DataBoxEdgeDevice\",\"friendlyName\":\"dfpwpjylwbtlhfls\",\"culture\":\"dhszfjv\",\"deviceModel\":\"gofel\",\"deviceSoftwareVersion\":\"grqmqhldvrii\",\"deviceLocalCapacity\":7120842075984408943,\"timeZone\":\"lg\",\"deviceHcsVersion\":\"kvtvsexso\",\"configuredRoleTypes\":[\"Functions\"],\"nodeCount\":2013630700},\"id\":\"hhahhxvrhmzkwpjg\",\"name\":\"wspughftqsxhqx\",\"type\":\"j\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DataBoxEdgeManager manager =
            DataBoxEdgeManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DataBoxEdgeDevice> response =
            manager.devices().listByResourceGroup("x", "smwutwbdsrezpd", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hneuyowqkd", response.iterator().next().location());
        Assertions.assertEquals("i", response.iterator().next().tags().get("ib"));
        Assertions.assertEquals(SkuName.EDGE, response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, response.iterator().next().sku().tier());
        Assertions.assertEquals("pzimejzanlfzxi", response.iterator().next().etag());
        Assertions
            .assertEquals(DataBoxEdgeDeviceStatus.MAINTENANCE, response.iterator().next().dataBoxEdgeDeviceStatus());
        Assertions.assertEquals("zpfrla", response.iterator().next().description());
        Assertions.assertEquals("zrnw", response.iterator().next().modelDescription());
        Assertions.assertEquals("dfpwpjylwbtlhfls", response.iterator().next().friendlyName());
    }
}