// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2024-06-30-
     * preview/examples/OperationsList.json
     */
    /**
     * Sample code: Get a list of Payment HSM operations.
     * 
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void getAListOfPaymentHSMOperations(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2024-06-30-
     * preview/examples/OperationsList.json
     */
    /**
     * Sample code: Get a list of Dedicated HSM operations.
     * 
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void getAListOfDedicatedHSMOperations(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
