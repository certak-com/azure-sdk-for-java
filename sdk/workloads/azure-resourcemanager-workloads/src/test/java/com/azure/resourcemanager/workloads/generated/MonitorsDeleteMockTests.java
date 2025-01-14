// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.workloads.WorkloadsManager;
import com.azure.resourcemanager.workloads.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MonitorsDeleteMockTests {
    @Test
    public void testDelete() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"smgbzahgxqdl\",\"name\":\"tlt\",\"status\":\"ap\",\"percentComplete\":8.252752,\"startTime\":\"2021-01-18T16:57:33Z\",\"endTime\":\"2021-06-30T17:25:30Z\",\"operations\":[{\"id\":\"mznnbsoqeqalarvl\",\"name\":\"un\",\"status\":\"tgfebwln\",\"percentComplete\":36.78445,\"startTime\":\"2021-02-09T00:26:12Z\",\"endTime\":\"2021-12-01T07:49:22Z\",\"operations\":[]}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        WorkloadsManager manager = WorkloadsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response
            = manager.monitors().delete("aosrxuz", "oamktcq", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("smgbzahgxqdl", response.id());
        Assertions.assertEquals("tlt", response.name());
        Assertions.assertEquals("ap", response.status());
        Assertions.assertEquals(8.252752F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-18T16:57:33Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T17:25:30Z"), response.endTime());
        Assertions.assertEquals("mznnbsoqeqalarvl", response.operations().get(0).id());
        Assertions.assertEquals("un", response.operations().get(0).name());
        Assertions.assertEquals("tgfebwln", response.operations().get(0).status());
        Assertions.assertEquals(36.78445F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-09T00:26:12Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-01T07:49:22Z"), response.operations().get(0).endTime());
    }
}
