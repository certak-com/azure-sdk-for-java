// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of the track.
 */
public final class LiveEventTrackType extends ExpandableStringEnum<LiveEventTrackType> {
    /**
     * Static value audio for LiveEventTrackType.
     */
    public static final LiveEventTrackType AUDIO = fromString("audio");

    /**
     * Static value video for LiveEventTrackType.
     */
    public static final LiveEventTrackType VIDEO = fromString("video");

    /**
     * Creates a new instance of LiveEventTrackType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LiveEventTrackType() {
    }

    /**
     * Creates or finds a LiveEventTrackType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LiveEventTrackType.
     */
    public static LiveEventTrackType fromString(String name) {
        return fromString(name, LiveEventTrackType.class);
    }

    /**
     * Gets known LiveEventTrackType values.
     * 
     * @return known LiveEventTrackType values.
     */
    public static Collection<LiveEventTrackType> values() {
        return values(LiveEventTrackType.class);
    }
}
