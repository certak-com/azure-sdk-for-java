// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.ProxyResourceReference;
import org.junit.jupiter.api.Assertions;

public final class ProxyResourceReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProxyResourceReference model = BinaryData.fromString("{\"name\":\"axibxujw\",\"sourceArmResourceId\":\"hqwa\"}")
            .toObject(ProxyResourceReference.class);
        Assertions.assertEquals("hqwa", model.sourceArmResourceId());
        Assertions.assertEquals("axibxujw", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProxyResourceReference model
            = new ProxyResourceReference().withSourceArmResourceId("hqwa").withName("axibxujw");
        model = BinaryData.fromObject(model).toObject(ProxyResourceReference.class);
        Assertions.assertEquals("hqwa", model.sourceArmResourceId());
        Assertions.assertEquals("axibxujw", model.name());
    }
}
