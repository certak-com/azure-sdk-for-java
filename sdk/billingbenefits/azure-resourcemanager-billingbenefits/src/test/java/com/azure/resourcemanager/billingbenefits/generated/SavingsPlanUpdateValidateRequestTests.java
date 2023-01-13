// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.RenewProperties;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanUpdateRequestProperties;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanUpdateValidateRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SavingsPlanUpdateValidateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SavingsPlanUpdateValidateRequest model =
            BinaryData
                .fromString(
                    "{\"benefits\":[{\"displayName\":\"mmqhgyxzkonocuk\",\"appliedScopeType\":\"Shared\",\"appliedScopeProperties\":{\"tenantId\":\"xuconu\",\"managementGroupId\":\"zf\",\"subscriptionId\":\"eyp\",\"resourceGroupId\":\"rmjmwvvjektc\",\"displayName\":\"enhwlrs\"},\"renew\":true,\"renewProperties\":{}},{\"displayName\":\"v\",\"appliedScopeType\":\"Shared\",\"appliedScopeProperties\":{\"tenantId\":\"biqylihkaet\",\"managementGroupId\":\"tvfcivfsn\",\"subscriptionId\":\"m\",\"resourceGroupId\":\"tqhjfbebrjcx\",\"displayName\":\"fuwutttxf\"},\"renew\":false,\"renewProperties\":{}}]}")
                .toObject(SavingsPlanUpdateValidateRequest.class);
        Assertions.assertEquals("mmqhgyxzkonocuk", model.benefits().get(0).displayName());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.benefits().get(0).appliedScopeType());
        Assertions.assertEquals("xuconu", model.benefits().get(0).appliedScopeProperties().tenantId());
        Assertions.assertEquals("zf", model.benefits().get(0).appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("eyp", model.benefits().get(0).appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("rmjmwvvjektc", model.benefits().get(0).appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("enhwlrs", model.benefits().get(0).appliedScopeProperties().displayName());
        Assertions.assertEquals(true, model.benefits().get(0).renew());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SavingsPlanUpdateValidateRequest model =
            new SavingsPlanUpdateValidateRequest()
                .withBenefits(
                    Arrays
                        .asList(
                            new SavingsPlanUpdateRequestProperties()
                                .withDisplayName("mmqhgyxzkonocuk")
                                .withAppliedScopeType(AppliedScopeType.SHARED)
                                .withAppliedScopeProperties(
                                    new AppliedScopeProperties()
                                        .withTenantId("xuconu")
                                        .withManagementGroupId("zf")
                                        .withSubscriptionId("eyp")
                                        .withResourceGroupId("rmjmwvvjektc")
                                        .withDisplayName("enhwlrs"))
                                .withRenew(true)
                                .withRenewProperties(new RenewProperties()),
                            new SavingsPlanUpdateRequestProperties()
                                .withDisplayName("v")
                                .withAppliedScopeType(AppliedScopeType.SHARED)
                                .withAppliedScopeProperties(
                                    new AppliedScopeProperties()
                                        .withTenantId("biqylihkaet")
                                        .withManagementGroupId("tvfcivfsn")
                                        .withSubscriptionId("m")
                                        .withResourceGroupId("tqhjfbebrjcx")
                                        .withDisplayName("fuwutttxf"))
                                .withRenew(false)
                                .withRenewProperties(new RenewProperties())));
        model = BinaryData.fromObject(model).toObject(SavingsPlanUpdateValidateRequest.class);
        Assertions.assertEquals("mmqhgyxzkonocuk", model.benefits().get(0).displayName());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.benefits().get(0).appliedScopeType());
        Assertions.assertEquals("xuconu", model.benefits().get(0).appliedScopeProperties().tenantId());
        Assertions.assertEquals("zf", model.benefits().get(0).appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("eyp", model.benefits().get(0).appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("rmjmwvvjektc", model.benefits().get(0).appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("enhwlrs", model.benefits().get(0).appliedScopeProperties().displayName());
        Assertions.assertEquals(true, model.benefits().get(0).renew());
    }
}