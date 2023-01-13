// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.Department;
import com.azure.resourcemanager.billing.models.EnrollmentAccount;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DepartmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Department model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"departmentName\":\"hhbcsglummajtjao\",\"costCenter\":\"obnbdxkqpxokaj\",\"status\":\"npime\",\"enrollmentAccounts\":[{\"id\":\"xgcp\",\"name\":\"dg\",\"type\":\"aajrm\"},{\"id\":\"jwzrl\",\"name\":\"vmclw\",\"type\":\"ijcoejctb\"}]},\"id\":\"aqsqsycbkbfk\",\"name\":\"ukdkexxppofmxa\",\"type\":\"c\"}")
                .toObject(Department.class);
        Assertions.assertEquals("hhbcsglummajtjao", model.departmentName());
        Assertions.assertEquals("obnbdxkqpxokaj", model.costCenter());
        Assertions.assertEquals("npime", model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Department model =
            new Department()
                .withDepartmentName("hhbcsglummajtjao")
                .withCostCenter("obnbdxkqpxokaj")
                .withStatus("npime")
                .withEnrollmentAccounts(Arrays.asList(new EnrollmentAccount(), new EnrollmentAccount()));
        model = BinaryData.fromObject(model).toObject(Department.class);
        Assertions.assertEquals("hhbcsglummajtjao", model.departmentName());
        Assertions.assertEquals("obnbdxkqpxokaj", model.costCenter());
        Assertions.assertEquals("npime", model.status());
    }
}