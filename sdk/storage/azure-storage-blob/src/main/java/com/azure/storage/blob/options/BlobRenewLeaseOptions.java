// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.options;

import com.azure.core.annotation.Fluent;
import com.azure.storage.blob.models.BlobLeaseRequestConditions;

/**
 * Extended options that may be passed when renewing a lease to a blob or container.
 */
@Fluent
public class BlobRenewLeaseOptions {
    private BlobLeaseRequestConditions requestConditions;

    /**
     * Creates a new instance of {@link BlobRenewLeaseOptions}.
     */
    public BlobRenewLeaseOptions() {
    }

    /**
     * Gets the {@link BlobLeaseRequestConditions}.
     *
     * @return {@link BlobLeaseRequestConditions}
     */
    public BlobLeaseRequestConditions getRequestConditions() {
        return requestConditions;
    }

    /**
     * Sets the {@link BlobLeaseRequestConditions}.
     *
     * @param requestConditions {@link BlobLeaseRequestConditions}
     * @return The updated options.
     */
    public BlobRenewLeaseOptions setRequestConditions(BlobLeaseRequestConditions requestConditions) {
        this.requestConditions = requestConditions;
        return this;
    }
}
