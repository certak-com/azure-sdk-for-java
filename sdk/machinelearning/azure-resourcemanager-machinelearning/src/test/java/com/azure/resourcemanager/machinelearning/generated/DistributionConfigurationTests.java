// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.DistributionConfiguration;
import org.junit.jupiter.api.Test;

public final class DistributionConfigurationTests {
    @Test
    public void testDeserialize() {
        DistributionConfiguration model =
            BinaryData
                .fromString("{\"distributionType\":\"DistributionConfiguration\"}")
                .toObject(DistributionConfiguration.class);
    }

    @Test
    public void testSerialize() {
        DistributionConfiguration model = new DistributionConfiguration();
        model = BinaryData.fromObject(model).toObject(DistributionConfiguration.class);
    }
}