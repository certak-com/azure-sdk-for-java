// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.ContactDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContactDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContactDetails model =
            BinaryData
                .fromString(
                    "{\"contactPerson\":\"lmwlxkvugfhzo\",\"companyName\":\"awjvzunluthnnp\",\"phone\":\"nxipeil\",\"emailList\":[\"zuaejxd\",\"ltskzbbtd\",\"umveekgpwozuhkf\",\"bsjyofdx\"]}")
                .toObject(ContactDetails.class);
        Assertions.assertEquals("lmwlxkvugfhzo", model.contactPerson());
        Assertions.assertEquals("awjvzunluthnnp", model.companyName());
        Assertions.assertEquals("nxipeil", model.phone());
        Assertions.assertEquals("zuaejxd", model.emailList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContactDetails model =
            new ContactDetails()
                .withContactPerson("lmwlxkvugfhzo")
                .withCompanyName("awjvzunluthnnp")
                .withPhone("nxipeil")
                .withEmailList(Arrays.asList("zuaejxd", "ltskzbbtd", "umveekgpwozuhkf", "bsjyofdx"));
        model = BinaryData.fromObject(model).toObject(ContactDetails.class);
        Assertions.assertEquals("lmwlxkvugfhzo", model.contactPerson());
        Assertions.assertEquals("awjvzunluthnnp", model.companyName());
        Assertions.assertEquals("nxipeil", model.phone());
        Assertions.assertEquals("zuaejxd", model.emailList().get(0));
    }
}