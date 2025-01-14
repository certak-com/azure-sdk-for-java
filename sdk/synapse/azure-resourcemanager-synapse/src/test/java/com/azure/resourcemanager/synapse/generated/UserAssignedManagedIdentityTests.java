// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.UserAssignedManagedIdentity;

public final class UserAssignedManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAssignedManagedIdentity model = BinaryData.fromString(
            "{\"clientId\":\"f05980dc-2221-4842-a2c9-a95751cdf162\",\"principalId\":\"70efa340-ce84-48ca-b546-27b939b7b8b9\"}")
            .toObject(UserAssignedManagedIdentity.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAssignedManagedIdentity model = new UserAssignedManagedIdentity();
        model = BinaryData.fromObject(model).toObject(UserAssignedManagedIdentity.class);
    }
}
