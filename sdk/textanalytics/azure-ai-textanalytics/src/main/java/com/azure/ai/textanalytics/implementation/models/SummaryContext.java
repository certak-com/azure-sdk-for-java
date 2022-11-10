// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The context of the summary. */
@Fluent
public final class SummaryContext {
    /*
     * Start position for the context. Use of different 'stringIndexType' values can affect the offset returned.
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * The length of the context. Use of different 'stringIndexType' values can affect the length returned.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /**
     * Get the offset property: Start position for the context. Use of different 'stringIndexType' values can affect the
     * offset returned.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: Start position for the context. Use of different 'stringIndexType' values can affect the
     * offset returned.
     *
     * @param offset the offset value to set.
     * @return the SummaryContext object itself.
     */
    public SummaryContext setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: The length of the context. Use of different 'stringIndexType' values can affect the
     * length returned.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: The length of the context. Use of different 'stringIndexType' values can affect the
     * length returned.
     *
     * @param length the length value to set.
     * @return the SummaryContext object itself.
     */
    public SummaryContext setLength(int length) {
        this.length = length;
        return this;
    }
}