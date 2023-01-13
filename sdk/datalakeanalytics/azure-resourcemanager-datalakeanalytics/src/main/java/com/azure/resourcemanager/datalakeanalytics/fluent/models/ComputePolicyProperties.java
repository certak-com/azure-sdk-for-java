// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.datalakeanalytics.models.AadObjectType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The compute policy properties. */
@Immutable
public final class ComputePolicyProperties {
    /*
     * The AAD object identifier for the entity to create a policy for.
     */
    @JsonProperty(value = "objectId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID objectId;

    /*
     * The type of AAD object the object identifier refers to.
     */
    @JsonProperty(value = "objectType", access = JsonProperty.Access.WRITE_ONLY)
    private AadObjectType objectType;

    /*
     * The maximum degree of parallelism per job this user can use to submit jobs.
     */
    @JsonProperty(value = "maxDegreeOfParallelismPerJob", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxDegreeOfParallelismPerJob;

    /*
     * The minimum priority per job this user can use to submit jobs.
     */
    @JsonProperty(value = "minPriorityPerJob", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minPriorityPerJob;

    /** Creates an instance of ComputePolicyProperties class. */
    public ComputePolicyProperties() {
    }

    /**
     * Get the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.objectId;
    }

    /**
     * Get the objectType property: The type of AAD object the object identifier refers to.
     *
     * @return the objectType value.
     */
    public AadObjectType objectType() {
        return this.objectType;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Get the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs.
     *
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}