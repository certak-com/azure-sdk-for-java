// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentFavoriteInner;
import com.azure.resourcemanager.applicationinsights.models.FavoriteType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApplicationInsightsComponentFavoriteInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationInsightsComponentFavoriteInner model = BinaryData.fromString(
            "{\"Name\":\"dzxibqeojnxqbzvd\",\"Config\":\"t\",\"Version\":\"deicbtwnpzao\",\"FavoriteId\":\"uhrhcffcyddgl\",\"FavoriteType\":\"shared\",\"SourceType\":\"jqkwpyeicx\",\"TimeModified\":\"ciwqvhk\",\"Tags\":[\"uigdtopbobjog\",\"m\",\"w\"],\"Category\":\"m\",\"IsGeneratedFromTemplate\":true,\"UserId\":\"z\"}")
            .toObject(ApplicationInsightsComponentFavoriteInner.class);
        Assertions.assertEquals("dzxibqeojnxqbzvd", model.name());
        Assertions.assertEquals("t", model.config());
        Assertions.assertEquals("deicbtwnpzao", model.version());
        Assertions.assertEquals(FavoriteType.SHARED, model.favoriteType());
        Assertions.assertEquals("jqkwpyeicx", model.sourceType());
        Assertions.assertEquals("uigdtopbobjog", model.tags().get(0));
        Assertions.assertEquals("m", model.category());
        Assertions.assertEquals(true, model.isGeneratedFromTemplate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationInsightsComponentFavoriteInner model
            = new ApplicationInsightsComponentFavoriteInner().withName("dzxibqeojnxqbzvd")
                .withConfig("t")
                .withVersion("deicbtwnpzao")
                .withFavoriteType(FavoriteType.SHARED)
                .withSourceType("jqkwpyeicx")
                .withTags(Arrays.asList("uigdtopbobjog", "m", "w"))
                .withCategory("m")
                .withIsGeneratedFromTemplate(true);
        model = BinaryData.fromObject(model).toObject(ApplicationInsightsComponentFavoriteInner.class);
        Assertions.assertEquals("dzxibqeojnxqbzvd", model.name());
        Assertions.assertEquals("t", model.config());
        Assertions.assertEquals("deicbtwnpzao", model.version());
        Assertions.assertEquals(FavoriteType.SHARED, model.favoriteType());
        Assertions.assertEquals("jqkwpyeicx", model.sourceType());
        Assertions.assertEquals("uigdtopbobjog", model.tags().get(0));
        Assertions.assertEquals("m", model.category());
        Assertions.assertEquals(true, model.isGeneratedFromTemplate());
    }
}
