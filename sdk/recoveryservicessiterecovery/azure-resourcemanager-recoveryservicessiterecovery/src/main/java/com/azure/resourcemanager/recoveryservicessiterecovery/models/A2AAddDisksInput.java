// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A2A add disk(s) input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2AAddDisksInput extends AddDisksProviderSpecificInput {
    /*
     * The list of vm disk details.
     */
    @JsonProperty(value = "vmDisks")
    private List<A2AVmDiskInputDetails> vmDisks;

    /*
     * The list of vm managed disk details.
     */
    @JsonProperty(value = "vmManagedDisks")
    private List<A2AVmManagedDiskInputDetails> vmManagedDisks;

    /** Creates an instance of A2AAddDisksInput class. */
    public A2AAddDisksInput() {
    }

    /**
     * Get the vmDisks property: The list of vm disk details.
     *
     * @return the vmDisks value.
     */
    public List<A2AVmDiskInputDetails> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the vmDisks property: The list of vm disk details.
     *
     * @param vmDisks the vmDisks value to set.
     * @return the A2AAddDisksInput object itself.
     */
    public A2AAddDisksInput withVmDisks(List<A2AVmDiskInputDetails> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the vmManagedDisks property: The list of vm managed disk details.
     *
     * @return the vmManagedDisks value.
     */
    public List<A2AVmManagedDiskInputDetails> vmManagedDisks() {
        return this.vmManagedDisks;
    }

    /**
     * Set the vmManagedDisks property: The list of vm managed disk details.
     *
     * @param vmManagedDisks the vmManagedDisks value to set.
     * @return the A2AAddDisksInput object itself.
     */
    public A2AAddDisksInput withVmManagedDisks(List<A2AVmManagedDiskInputDetails> vmManagedDisks) {
        this.vmManagedDisks = vmManagedDisks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (vmDisks() != null) {
            vmDisks().forEach(e -> e.validate());
        }
        if (vmManagedDisks() != null) {
            vmManagedDisks().forEach(e -> e.validate());
        }
    }
}