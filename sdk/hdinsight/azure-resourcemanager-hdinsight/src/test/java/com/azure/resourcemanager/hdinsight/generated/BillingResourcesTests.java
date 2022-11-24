// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.BillingMeters;
import com.azure.resourcemanager.hdinsight.models.BillingResources;
import com.azure.resourcemanager.hdinsight.models.DiskBillingMeters;
import com.azure.resourcemanager.hdinsight.models.Tier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BillingResourcesTests {
    @Test
    public void testDeserialize() {
        BillingResources model =
            BinaryData
                .fromString(
                    "{\"region\":\"ruvdmov\",\"billingMeters\":[{\"meterParameter\":\"xwabmqoe\",\"meter\":\"ifrvtpu\",\"unit\":\"jmqlgkfb\"},{\"meterParameter\":\"doaon\",\"meter\":\"jcntuj\",\"unit\":\"c\"},{\"meterParameter\":\"df\",\"meter\":\"waezkojvd\",\"unit\":\"zfoqouicybxar\"},{\"meterParameter\":\"szufoxciqopidoa\",\"meter\":\"iodhkhazxkhnz\",\"unit\":\"nlwntoe\"}],\"diskBillingMeters\":[{\"diskRpMeter\":\"wbw\",\"sku\":\"szzcmrvexztv\",\"tier\":\"Premium\"},{\"diskRpMeter\":\"sfraoyzko\",\"sku\":\"tlmngu\",\"tier\":\"Standard\"},{\"diskRpMeter\":\"aldsy\",\"sku\":\"ximerqfobwyznk\",\"tier\":\"Standard\"}]}")
                .toObject(BillingResources.class);
        Assertions.assertEquals("ruvdmov", model.region());
        Assertions.assertEquals("xwabmqoe", model.billingMeters().get(0).meterParameter());
        Assertions.assertEquals("ifrvtpu", model.billingMeters().get(0).meter());
        Assertions.assertEquals("jmqlgkfb", model.billingMeters().get(0).unit());
        Assertions.assertEquals("wbw", model.diskBillingMeters().get(0).diskRpMeter());
        Assertions.assertEquals("szzcmrvexztv", model.diskBillingMeters().get(0).sku());
        Assertions.assertEquals(Tier.PREMIUM, model.diskBillingMeters().get(0).tier());
    }

    @Test
    public void testSerialize() {
        BillingResources model =
            new BillingResources()
                .withRegion("ruvdmov")
                .withBillingMeters(
                    Arrays
                        .asList(
                            new BillingMeters()
                                .withMeterParameter("xwabmqoe")
                                .withMeter("ifrvtpu")
                                .withUnit("jmqlgkfb"),
                            new BillingMeters().withMeterParameter("doaon").withMeter("jcntuj").withUnit("c"),
                            new BillingMeters()
                                .withMeterParameter("df")
                                .withMeter("waezkojvd")
                                .withUnit("zfoqouicybxar"),
                            new BillingMeters()
                                .withMeterParameter("szufoxciqopidoa")
                                .withMeter("iodhkhazxkhnz")
                                .withUnit("nlwntoe")))
                .withDiskBillingMeters(
                    Arrays
                        .asList(
                            new DiskBillingMeters()
                                .withDiskRpMeter("wbw")
                                .withSku("szzcmrvexztv")
                                .withTier(Tier.PREMIUM),
                            new DiskBillingMeters()
                                .withDiskRpMeter("sfraoyzko")
                                .withSku("tlmngu")
                                .withTier(Tier.STANDARD),
                            new DiskBillingMeters()
                                .withDiskRpMeter("aldsy")
                                .withSku("ximerqfobwyznk")
                                .withTier(Tier.STANDARD)));
        model = BinaryData.fromObject(model).toObject(BillingResources.class);
        Assertions.assertEquals("ruvdmov", model.region());
        Assertions.assertEquals("xwabmqoe", model.billingMeters().get(0).meterParameter());
        Assertions.assertEquals("ifrvtpu", model.billingMeters().get(0).meter());
        Assertions.assertEquals("jmqlgkfb", model.billingMeters().get(0).unit());
        Assertions.assertEquals("wbw", model.diskBillingMeters().get(0).diskRpMeter());
        Assertions.assertEquals("szzcmrvexztv", model.diskBillingMeters().get(0).sku());
        Assertions.assertEquals(Tier.PREMIUM, model.diskBillingMeters().get(0).tier());
    }
}