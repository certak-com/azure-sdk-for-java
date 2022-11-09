// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Viewport Response object. */
@Immutable
public final class TrafficIncidentViewportResponse {
    /*
     * Traffic State information
     */
    @JsonProperty(value = "trafficState", access = JsonProperty.Access.WRITE_ONLY)
    private TrafficState trafficState;

    /*
     * When the copyright parameter value is true, this contains the full text
     * of the copyright information that must be displayed with the tiles in
     * the viewport
     */
    @JsonProperty(value = "copyrightIds", access = JsonProperty.Access.WRITE_ONLY)
    private String copyrightInformation;

    /*
     * Indicates the software version used to generate the information. For use
     * with support queries.
     */
    @JsonProperty(value = "@version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Indicates the data provider's internal names for the map data used in
     * the viewport. For use with support queries.
     */
    @JsonProperty(value = "@maps", access = JsonProperty.Access.WRITE_ONLY)
    private String maps;

    /** Set default constructor to private */
    private TrafficIncidentViewportResponse() {}

    /**
     * Get the trafficState property: Traffic State information.
     *
     * @return the trafficState value.
     */
    public TrafficState getTrafficState() {
        return this.trafficState;
    }

    /**
     * Get the copyrightInformation property: When the copyright parameter value is true, this contains the full text of
     * the copyright information that must be displayed with the tiles in the viewport.
     *
     * @return the copyrightInformation value.
     */
    public String getCopyrightInformation() {
        return this.copyrightInformation;
    }

    /**
     * Get the version property: Indicates the software version used to generate the information. For use with support
     * queries.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Get the maps property: Indicates the data provider's internal names for the map data used in the viewport. For
     * use with support queries.
     *
     * @return the maps value.
     */
    public String getMaps() {
        return this.maps;
    }
}