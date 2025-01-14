// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Workflow model custom properties. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = WorkflowModelCustomProperties.class)
@JsonTypeName("WorkflowModelCustomProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FailoverWorkflowDetails", value = FailoverWorkflowModelCustomProperties.class),
    @JsonSubTypes.Type(
        name = "TestFailoverCleanupWorkflowDetails",
        value = TestFailoverCleanupWorkflowModelCustomProperties.class),
    @JsonSubTypes.Type(name = "TestFailoverWorkflowDetails", value = TestFailoverWorkflowModelCustomProperties.class) })
@Immutable
public class WorkflowModelCustomProperties {
    /*
     * Gets or sets any custom properties of the affected object.
     */
    @JsonProperty(value = "affectedObjectDetails", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> affectedObjectDetails;

    /** Creates an instance of WorkflowModelCustomProperties class. */
    public WorkflowModelCustomProperties() {
    }

    /**
     * Get the affectedObjectDetails property: Gets or sets any custom properties of the affected object.
     *
     * @return the affectedObjectDetails value.
     */
    public Map<String, String> affectedObjectDetails() {
        return this.affectedObjectDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
