// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.MetricName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetricNameTests {
    @Test
    public void testDeserialize() {
        MetricName model =
            BinaryData
                .fromString("{\"value\":\"pqyegualhbxxh\",\"localizedValue\":\"jzzvdud\"}")
                .toObject(MetricName.class);
        Assertions.assertEquals("pqyegualhbxxh", model.value());
        Assertions.assertEquals("jzzvdud", model.localizedValue());
    }

    @Test
    public void testSerialize() {
        MetricName model = new MetricName().withValue("pqyegualhbxxh").withLocalizedValue("jzzvdud");
        model = BinaryData.fromObject(model).toObject(MetricName.class);
        Assertions.assertEquals("pqyegualhbxxh", model.value());
        Assertions.assertEquals("jzzvdud", model.localizedValue());
    }
}