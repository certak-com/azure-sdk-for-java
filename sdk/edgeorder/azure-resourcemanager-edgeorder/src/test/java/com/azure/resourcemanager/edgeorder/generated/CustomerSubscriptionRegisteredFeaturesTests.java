// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.edgeorder.models.CustomerSubscriptionRegisteredFeatures;
import org.junit.jupiter.api.Assertions;

public final class CustomerSubscriptionRegisteredFeaturesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomerSubscriptionRegisteredFeatures model
            = BinaryData.fromString("{\"name\":\"jfddgmbmbe\",\"state\":\"pbhtqqrolfpfpsa\"}")
                .toObject(CustomerSubscriptionRegisteredFeatures.class);
        Assertions.assertEquals("jfddgmbmbe", model.name());
        Assertions.assertEquals("pbhtqqrolfpfpsa", model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomerSubscriptionRegisteredFeatures model
            = new CustomerSubscriptionRegisteredFeatures().withName("jfddgmbmbe").withState("pbhtqqrolfpfpsa");
        model = BinaryData.fromObject(model).toObject(CustomerSubscriptionRegisteredFeatures.class);
        Assertions.assertEquals("jfddgmbmbe", model.name());
        Assertions.assertEquals("pbhtqqrolfpfpsa", model.state());
    }
}
