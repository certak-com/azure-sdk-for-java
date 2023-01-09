// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** A value indicating the type authentication to use for automation Account. */
public final class AutomationAccountAuthenticationType
    extends ExpandableStringEnum<AutomationAccountAuthenticationType> {
    /** Static value RunAsAccount for AutomationAccountAuthenticationType. */
    public static final AutomationAccountAuthenticationType RUN_AS_ACCOUNT = fromString("RunAsAccount");

    /** Static value SystemAssignedIdentity for AutomationAccountAuthenticationType. */
    public static final AutomationAccountAuthenticationType SYSTEM_ASSIGNED_IDENTITY =
        fromString("SystemAssignedIdentity");

    /**
     * Creates or finds a AutomationAccountAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutomationAccountAuthenticationType.
     */
    @JsonCreator
    public static AutomationAccountAuthenticationType fromString(String name) {
        return fromString(name, AutomationAccountAuthenticationType.class);
    }

    /**
     * Gets known AutomationAccountAuthenticationType values.
     *
     * @return known AutomationAccountAuthenticationType values.
     */
    public static Collection<AutomationAccountAuthenticationType> values() {
        return values(AutomationAccountAuthenticationType.class);
    }
}