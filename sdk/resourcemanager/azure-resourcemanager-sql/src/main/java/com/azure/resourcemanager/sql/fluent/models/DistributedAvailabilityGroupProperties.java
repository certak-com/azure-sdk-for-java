// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.ReplicationMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The properties of a distributed availability group. */
@Fluent
public final class DistributedAvailabilityGroupProperties {
    /*
     * The name of the target database
     */
    @JsonProperty(value = "targetDatabase")
    private String targetDatabase;

    /*
     * The source endpoint
     */
    @JsonProperty(value = "sourceEndpoint")
    private String sourceEndpoint;

    /*
     * The primary availability group name
     */
    @JsonProperty(value = "primaryAvailabilityGroupName")
    private String primaryAvailabilityGroupName;

    /*
     * The secondary availability group name
     */
    @JsonProperty(value = "secondaryAvailabilityGroupName")
    private String secondaryAvailabilityGroupName;

    /*
     * The replication mode of a distributed availability group. Parameter will be ignored during link creation.
     */
    @JsonProperty(value = "replicationMode")
    private ReplicationMode replicationMode;

    /*
     * The distributed availability group id
     */
    @JsonProperty(value = "distributedAvailabilityGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID distributedAvailabilityGroupId;

    /*
     * The source replica id
     */
    @JsonProperty(value = "sourceReplicaId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID sourceReplicaId;

    /*
     * The target replica id
     */
    @JsonProperty(value = "targetReplicaId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID targetReplicaId;

    /*
     * The link state
     */
    @JsonProperty(value = "linkState", access = JsonProperty.Access.WRITE_ONLY)
    private String linkState;

    /*
     * The last hardened lsn
     */
    @JsonProperty(value = "lastHardenedLsn", access = JsonProperty.Access.WRITE_ONLY)
    private String lastHardenedLsn;

    /** Creates an instance of DistributedAvailabilityGroupProperties class. */
    public DistributedAvailabilityGroupProperties() {
    }

    /**
     * Get the targetDatabase property: The name of the target database.
     *
     * @return the targetDatabase value.
     */
    public String targetDatabase() {
        return this.targetDatabase;
    }

    /**
     * Set the targetDatabase property: The name of the target database.
     *
     * @param targetDatabase the targetDatabase value to set.
     * @return the DistributedAvailabilityGroupProperties object itself.
     */
    public DistributedAvailabilityGroupProperties withTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }

    /**
     * Get the sourceEndpoint property: The source endpoint.
     *
     * @return the sourceEndpoint value.
     */
    public String sourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * Set the sourceEndpoint property: The source endpoint.
     *
     * @param sourceEndpoint the sourceEndpoint value to set.
     * @return the DistributedAvailabilityGroupProperties object itself.
     */
    public DistributedAvailabilityGroupProperties withSourceEndpoint(String sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    /**
     * Get the primaryAvailabilityGroupName property: The primary availability group name.
     *
     * @return the primaryAvailabilityGroupName value.
     */
    public String primaryAvailabilityGroupName() {
        return this.primaryAvailabilityGroupName;
    }

    /**
     * Set the primaryAvailabilityGroupName property: The primary availability group name.
     *
     * @param primaryAvailabilityGroupName the primaryAvailabilityGroupName value to set.
     * @return the DistributedAvailabilityGroupProperties object itself.
     */
    public DistributedAvailabilityGroupProperties withPrimaryAvailabilityGroupName(
        String primaryAvailabilityGroupName) {
        this.primaryAvailabilityGroupName = primaryAvailabilityGroupName;
        return this;
    }

    /**
     * Get the secondaryAvailabilityGroupName property: The secondary availability group name.
     *
     * @return the secondaryAvailabilityGroupName value.
     */
    public String secondaryAvailabilityGroupName() {
        return this.secondaryAvailabilityGroupName;
    }

    /**
     * Set the secondaryAvailabilityGroupName property: The secondary availability group name.
     *
     * @param secondaryAvailabilityGroupName the secondaryAvailabilityGroupName value to set.
     * @return the DistributedAvailabilityGroupProperties object itself.
     */
    public DistributedAvailabilityGroupProperties withSecondaryAvailabilityGroupName(
        String secondaryAvailabilityGroupName) {
        this.secondaryAvailabilityGroupName = secondaryAvailabilityGroupName;
        return this;
    }

    /**
     * Get the replicationMode property: The replication mode of a distributed availability group. Parameter will be
     * ignored during link creation.
     *
     * @return the replicationMode value.
     */
    public ReplicationMode replicationMode() {
        return this.replicationMode;
    }

    /**
     * Set the replicationMode property: The replication mode of a distributed availability group. Parameter will be
     * ignored during link creation.
     *
     * @param replicationMode the replicationMode value to set.
     * @return the DistributedAvailabilityGroupProperties object itself.
     */
    public DistributedAvailabilityGroupProperties withReplicationMode(ReplicationMode replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    /**
     * Get the distributedAvailabilityGroupId property: The distributed availability group id.
     *
     * @return the distributedAvailabilityGroupId value.
     */
    public UUID distributedAvailabilityGroupId() {
        return this.distributedAvailabilityGroupId;
    }

    /**
     * Get the sourceReplicaId property: The source replica id.
     *
     * @return the sourceReplicaId value.
     */
    public UUID sourceReplicaId() {
        return this.sourceReplicaId;
    }

    /**
     * Get the targetReplicaId property: The target replica id.
     *
     * @return the targetReplicaId value.
     */
    public UUID targetReplicaId() {
        return this.targetReplicaId;
    }

    /**
     * Get the linkState property: The link state.
     *
     * @return the linkState value.
     */
    public String linkState() {
        return this.linkState;
    }

    /**
     * Get the lastHardenedLsn property: The last hardened lsn.
     *
     * @return the lastHardenedLsn value.
     */
    public String lastHardenedLsn() {
        return this.lastHardenedLsn;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}