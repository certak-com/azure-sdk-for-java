// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.RecommendedSensitivityLabelUpdateProperties;
import com.azure.resourcemanager.synapse.models.RecommendedSensitivityLabelUpdateKind;
import org.junit.jupiter.api.Assertions;

public final class RecommendedSensitivityLabelUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecommendedSensitivityLabelUpdateProperties model = BinaryData
            .fromString("{\"op\":\"enable\",\"schema\":\"jglikkxwslolb\",\"table\":\"pvuzlmv\",\"column\":\"elfk\"}")
            .toObject(RecommendedSensitivityLabelUpdateProperties.class);
        Assertions.assertEquals(RecommendedSensitivityLabelUpdateKind.ENABLE, model.op());
        Assertions.assertEquals("jglikkxwslolb", model.schema());
        Assertions.assertEquals("pvuzlmv", model.table());
        Assertions.assertEquals("elfk", model.column());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecommendedSensitivityLabelUpdateProperties model
            = new RecommendedSensitivityLabelUpdateProperties().withOp(RecommendedSensitivityLabelUpdateKind.ENABLE)
                .withSchema("jglikkxwslolb")
                .withTable("pvuzlmv")
                .withColumn("elfk");
        model = BinaryData.fromObject(model).toObject(RecommendedSensitivityLabelUpdateProperties.class);
        Assertions.assertEquals(RecommendedSensitivityLabelUpdateKind.ENABLE, model.op());
        Assertions.assertEquals("jglikkxwslolb", model.schema());
        Assertions.assertEquals("pvuzlmv", model.table());
        Assertions.assertEquals("elfk", model.column());
    }
}
