// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appcomplianceautomation.models.ComplianceReportItem;
import com.azure.resourcemanager.appcomplianceautomation.models.DownloadResponseComplianceDetailedPdfReport;
import com.azure.resourcemanager.appcomplianceautomation.models.DownloadResponseCompliancePdfReport;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes all the possible response for the download operation. */
@Immutable
public final class DownloadResponseInner {
    /*
     * List of the reports
     */
    @JsonProperty(value = "resourceList", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceItem> resourceList;

    /*
     * List of the compliance result
     */
    @JsonProperty(value = "complianceReport", access = JsonProperty.Access.WRITE_ONLY)
    private List<ComplianceReportItem> complianceReport;

    /*
     * compliance pdf report
     */
    @JsonProperty(value = "compliancePdfReport", access = JsonProperty.Access.WRITE_ONLY)
    private DownloadResponseCompliancePdfReport compliancePdfReport;

    /*
     * compliance detailed pdf report
     */
    @JsonProperty(value = "complianceDetailedPdfReport", access = JsonProperty.Access.WRITE_ONLY)
    private DownloadResponseComplianceDetailedPdfReport complianceDetailedPdfReport;

    /** Creates an instance of DownloadResponseInner class. */
    public DownloadResponseInner() {
    }

    /**
     * Get the resourceList property: List of the reports.
     *
     * @return the resourceList value.
     */
    public List<ResourceItem> resourceList() {
        return this.resourceList;
    }

    /**
     * Get the complianceReport property: List of the compliance result.
     *
     * @return the complianceReport value.
     */
    public List<ComplianceReportItem> complianceReport() {
        return this.complianceReport;
    }

    /**
     * Get the compliancePdfReport property: compliance pdf report.
     *
     * @return the compliancePdfReport value.
     */
    public DownloadResponseCompliancePdfReport compliancePdfReport() {
        return this.compliancePdfReport;
    }

    /**
     * Get the complianceDetailedPdfReport property: compliance detailed pdf report.
     *
     * @return the complianceDetailedPdfReport value.
     */
    public DownloadResponseComplianceDetailedPdfReport complianceDetailedPdfReport() {
        return this.complianceDetailedPdfReport;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceList() != null) {
            resourceList().forEach(e -> e.validate());
        }
        if (complianceReport() != null) {
            complianceReport().forEach(e -> e.validate());
        }
        if (compliancePdfReport() != null) {
            compliancePdfReport().validate();
        }
        if (complianceDetailedPdfReport() != null) {
            complianceDetailedPdfReport().validate();
        }
    }
}