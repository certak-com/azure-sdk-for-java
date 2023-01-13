// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.billingbenefits.fluent.models.ReservationOrderAliasResponseInner;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasRequest;

/** An instance of this class provides access to all the operations defined in ReservationOrderAliasClient. */
public interface ReservationOrderAliasClient {
    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReservationOrderAliasResponseInner>, ReservationOrderAliasResponseInner> beginCreate(
        String reservationOrderAliasName, ReservationOrderAliasRequest body);

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReservationOrderAliasResponseInner>, ReservationOrderAliasResponseInner> beginCreate(
        String reservationOrderAliasName, ReservationOrderAliasRequest body, Context context);

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReservationOrderAliasResponseInner create(String reservationOrderAliasName, ReservationOrderAliasRequest body);

    /**
     * Create a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param body Request body for creating a reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReservationOrderAliasResponseInner create(
        String reservationOrderAliasName, ReservationOrderAliasRequest body, Context context);

    /**
     * Get a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reservation order alias along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReservationOrderAliasResponseInner> getWithResponse(String reservationOrderAliasName, Context context);

    /**
     * Get a reservation order alias.
     *
     * @param reservationOrderAliasName Name of the reservation order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a reservation order alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReservationOrderAliasResponseInner get(String reservationOrderAliasName);
}