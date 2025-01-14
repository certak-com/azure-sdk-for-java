// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.PrivateLinkHubProperties;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkHubPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkHubProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"avxbniwdjswztsdb\",\"privateEndpointConnections\":[{\"id\":\"ytxhp\",\"properties\":{\"privateEndpoint\":{\"id\":\"pfza\"},\"privateLinkServiceConnectionState\":{\"status\":\"cuh\",\"description\":\"tcty\",\"actionsRequired\":\"klbb\"},\"provisioningState\":\"plwzbhvgyugu\"}},{\"id\":\"vmkfssxqu\",\"properties\":{\"privateEndpoint\":{\"id\":\"l\"},\"privateLinkServiceConnectionState\":{\"status\":\"sxnkjzkdeslpvlo\",\"description\":\"i\",\"actionsRequired\":\"ghxpkdw\"},\"provisioningState\":\"aiuebbaumnyqu\"}}]}")
            .toObject(PrivateLinkHubProperties.class);
        Assertions.assertEquals("avxbniwdjswztsdb", model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkHubProperties model = new PrivateLinkHubProperties().withProvisioningState("avxbniwdjswztsdb");
        model = BinaryData.fromObject(model).toObject(PrivateLinkHubProperties.class);
        Assertions.assertEquals("avxbniwdjswztsdb", model.provisioningState());
    }
}
