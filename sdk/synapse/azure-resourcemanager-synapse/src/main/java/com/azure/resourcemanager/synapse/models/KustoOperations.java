// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of KustoOperations.
 */
public interface KustoOperations {
    /**
     * Lists available operations for the Kusto sub-resources inside Microsoft.Synapse provider.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list REST API operations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Operation> list();

    /**
     * Lists available operations for the Kusto sub-resources inside Microsoft.Synapse provider.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list REST API operations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Operation> list(Context context);
}
