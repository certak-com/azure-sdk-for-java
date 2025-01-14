// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.dnsresolver.fluent.models.VirtualNetworkDnsForwardingRulesetInner;
import com.azure.resourcemanager.dnsresolver.models.VirtualNetworkDnsForwardingRuleset;

public final class VirtualNetworkDnsForwardingRulesetImpl implements VirtualNetworkDnsForwardingRuleset {
    private VirtualNetworkDnsForwardingRulesetInner innerObject;

    private final com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager;

    VirtualNetworkDnsForwardingRulesetImpl(VirtualNetworkDnsForwardingRulesetInner innerObject,
        com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public SubResource virtualNetworkLink() {
        return this.innerModel().virtualNetworkLink();
    }

    public VirtualNetworkDnsForwardingRulesetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dnsresolver.DnsResolverManager manager() {
        return this.serviceManager;
    }
}
