// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeInner;
import com.azure.resourcemanager.elasticsan.models.ManagedByInfo;
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import com.azure.resourcemanager.elasticsan.models.VolumeCreateOption;
import com.azure.resourcemanager.elasticsan.models.VolumeList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumeListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"volumeId\":\"uosvmkfssxqukk\",\"creationData\":{\"createSource\":\"Disk\",\"sourceId\":\"gsxnkjzkdeslpv\"},\"sizeGiB\":3908057410560236537,\"storageTarget\":{\"targetIqn\":\"yighxpk\",\"targetPortalHostname\":\"zb\",\"targetPortalPort\":823200813,\"provisioningState\":\"Creating\",\"status\":\"Invalid\"},\"managedBy\":{\"resourceId\":\"nyqupedeojnabck\"},\"provisioningState\":\"Creating\"},\"id\":\"xpsiebtfhvpes\",\"name\":\"pskrdqmh\",\"type\":\"jdhtldwkyzxu\"}],\"nextLink\":\"kn\"}")
            .toObject(VolumeList.class);
        Assertions.assertEquals(VolumeCreateOption.DISK, model.value().get(0).creationData().createSource());
        Assertions.assertEquals("gsxnkjzkdeslpv", model.value().get(0).creationData().sourceId());
        Assertions.assertEquals(3908057410560236537L, model.value().get(0).sizeGiB());
        Assertions.assertEquals("nyqupedeojnabck", model.value().get(0).managedBy().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeList model = new VolumeList().withValue(Arrays.asList(new VolumeInner()
            .withCreationData(
                new SourceCreationData().withCreateSource(VolumeCreateOption.DISK).withSourceId("gsxnkjzkdeslpv"))
            .withSizeGiB(3908057410560236537L)
            .withManagedBy(new ManagedByInfo().withResourceId("nyqupedeojnabck"))));
        model = BinaryData.fromObject(model).toObject(VolumeList.class);
        Assertions.assertEquals(VolumeCreateOption.DISK, model.value().get(0).creationData().createSource());
        Assertions.assertEquals("gsxnkjzkdeslpv", model.value().get(0).creationData().sourceId());
        Assertions.assertEquals(3908057410560236537L, model.value().get(0).sizeGiB());
        Assertions.assertEquals("nyqupedeojnabck", model.value().get(0).managedBy().resourceId());
    }
}
