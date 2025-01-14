// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ClipTime;
import com.azure.resourcemanager.mediaservices.models.InputDefinition;
import com.azure.resourcemanager.mediaservices.models.JobInputHttp;
import com.azure.resourcemanager.mediaservices.models.TrackDescriptor;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JobInputHttpTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobInputHttp model = BinaryData.fromString(
            "{\"@odata.type\":\"#Microsoft.Media.JobInputHttp\",\"baseUri\":\"h\",\"files\":[\"yxoaf\",\"aoqltfaey\"],\"start\":{\"@odata.type\":\"ClipTime\"},\"end\":{\"@odata.type\":\"ClipTime\"},\"label\":\"fgvxirpghriypoqe\",\"inputDefinitions\":[{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]}]}")
            .toObject(JobInputHttp.class);
        Assertions.assertEquals("yxoaf", model.files().get(0));
        Assertions.assertEquals("fgvxirpghriypoqe", model.label());
        Assertions.assertEquals("h", model.baseUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobInputHttp model = new JobInputHttp().withFiles(Arrays.asList("yxoaf", "aoqltfaey"))
            .withStart(new ClipTime())
            .withEnd(new ClipTime())
            .withLabel("fgvxirpghriypoqe")
            .withInputDefinitions(
                Arrays.asList(new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor())),
                    new InputDefinition().withIncludedTracks(
                        Arrays.asList(new TrackDescriptor(), new TrackDescriptor(), new TrackDescriptor())),
                    new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor(), new TrackDescriptor(),
                        new TrackDescriptor(), new TrackDescriptor()))))
            .withBaseUri("h");
        model = BinaryData.fromObject(model).toObject(JobInputHttp.class);
        Assertions.assertEquals("yxoaf", model.files().get(0));
        Assertions.assertEquals("fgvxirpghriypoqe", model.label());
        Assertions.assertEquals("h", model.baseUri());
    }
}
