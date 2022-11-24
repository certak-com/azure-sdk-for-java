// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A base class for event filter which determines whether an event should be sent to an event listener. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = EventListenerFilter.class)
@JsonTypeName("EventListenerFilter")
@JsonSubTypes({@JsonSubTypes.Type(name = "EventName", value = EventNameFilter.class)})
@Immutable
public class EventListenerFilter {
    /** Creates an instance of EventListenerFilter class. */
    public EventListenerFilter() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}