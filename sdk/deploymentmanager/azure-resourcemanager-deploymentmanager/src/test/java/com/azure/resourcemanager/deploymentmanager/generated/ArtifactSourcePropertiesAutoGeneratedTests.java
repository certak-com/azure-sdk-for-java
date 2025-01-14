// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.ArtifactSourcePropertiesAutoGenerated;
import com.azure.resourcemanager.deploymentmanager.models.Authentication;
import org.junit.jupiter.api.Assertions;

public final class ArtifactSourcePropertiesAutoGeneratedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArtifactSourcePropertiesAutoGenerated model = BinaryData
            .fromString(
                "{\"sourceType\":\"imjm\",\"artifactRoot\":\"ied\",\"authentication\":{\"type\":\"Authentication\"}}")
            .toObject(ArtifactSourcePropertiesAutoGenerated.class);
        Assertions.assertEquals("imjm", model.sourceType());
        Assertions.assertEquals("ied", model.artifactRoot());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArtifactSourcePropertiesAutoGenerated model = new ArtifactSourcePropertiesAutoGenerated().withSourceType("imjm")
            .withArtifactRoot("ied")
            .withAuthentication(new Authentication());
        model = BinaryData.fromObject(model).toObject(ArtifactSourcePropertiesAutoGenerated.class);
        Assertions.assertEquals("imjm", model.sourceType());
        Assertions.assertEquals("ied", model.artifactRoot());
    }
}
