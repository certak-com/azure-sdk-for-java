// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.streamanalytics.models.AzureMachineLearningServiceInputColumn;
import com.azure.resourcemanager.streamanalytics.models.AzureMachineLearningServiceOutputColumn;
import java.io.IOException;
import java.util.List;

/**
 * The binding properties associated with an Azure Machine learning web service.
 */
@Fluent
public final class AzureMachineLearningServiceFunctionBindingProperties
    implements JsonSerializable<AzureMachineLearningServiceFunctionBindingProperties> {
    /*
     * The Request-Response execute endpoint of the Azure Machine Learning web service.
     */
    private String endpoint;

    /*
     * The API key used to authenticate with Request-Response endpoint.
     */
    private String apiKey;

    /*
     * The inputs for the Azure Machine Learning web service endpoint.
     */
    private List<AzureMachineLearningServiceInputColumn> inputs;

    /*
     * A list of outputs from the Azure Machine Learning web service endpoint execution.
     */
    private List<AzureMachineLearningServiceOutputColumn> outputs;

    /*
     * Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is
     * 1000.
     */
    private Integer batchSize;

    /*
     * The number of parallel requests that will be sent per partition of your job to the machine learning service.
     * Default is 1.
     */
    private Integer numberOfParallelRequests;

    /*
     * Label for the input request object.
     */
    private String inputRequestName;

    /*
     * Label for the output request object.
     */
    private String outputResponseName;

    /**
     * Creates an instance of AzureMachineLearningServiceFunctionBindingProperties class.
     */
    public AzureMachineLearningServiceFunctionBindingProperties() {
    }

    /**
     * Get the endpoint property: The Request-Response execute endpoint of the Azure Machine Learning web service.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The Request-Response execute endpoint of the Azure Machine Learning web service.
     * 
     * @param endpoint the endpoint value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the apiKey property: The API key used to authenticate with Request-Response endpoint.
     * 
     * @return the apiKey value.
     */
    public String apiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: The API key used to authenticate with Request-Response endpoint.
     * 
     * @param apiKey the apiKey value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the inputs property: The inputs for the Azure Machine Learning web service endpoint.
     * 
     * @return the inputs value.
     */
    public List<AzureMachineLearningServiceInputColumn> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: The inputs for the Azure Machine Learning web service endpoint.
     * 
     * @param inputs the inputs value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties
        withInputs(List<AzureMachineLearningServiceInputColumn> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the outputs property: A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     * @return the outputs value.
     */
    public List<AzureMachineLearningServiceOutputColumn> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     * @param outputs the outputs value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties
        withOutputs(List<AzureMachineLearningServiceOutputColumn> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the batchSize property: Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS
     * execute request. Default is 1000.
     * 
     * @return the batchSize value.
     */
    public Integer batchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS
     * execute request. Default is 1000.
     * 
     * @param batchSize the batchSize value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the numberOfParallelRequests property: The number of parallel requests that will be sent per partition of
     * your job to the machine learning service. Default is 1.
     * 
     * @return the numberOfParallelRequests value.
     */
    public Integer numberOfParallelRequests() {
        return this.numberOfParallelRequests;
    }

    /**
     * Set the numberOfParallelRequests property: The number of parallel requests that will be sent per partition of
     * your job to the machine learning service. Default is 1.
     * 
     * @param numberOfParallelRequests the numberOfParallelRequests value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties
        withNumberOfParallelRequests(Integer numberOfParallelRequests) {
        this.numberOfParallelRequests = numberOfParallelRequests;
        return this;
    }

    /**
     * Get the inputRequestName property: Label for the input request object.
     * 
     * @return the inputRequestName value.
     */
    public String inputRequestName() {
        return this.inputRequestName;
    }

    /**
     * Set the inputRequestName property: Label for the input request object.
     * 
     * @param inputRequestName the inputRequestName value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties withInputRequestName(String inputRequestName) {
        this.inputRequestName = inputRequestName;
        return this;
    }

    /**
     * Get the outputResponseName property: Label for the output request object.
     * 
     * @return the outputResponseName value.
     */
    public String outputResponseName() {
        return this.outputResponseName;
    }

    /**
     * Set the outputResponseName property: Label for the output request object.
     * 
     * @param outputResponseName the outputResponseName value to set.
     * @return the AzureMachineLearningServiceFunctionBindingProperties object itself.
     */
    public AzureMachineLearningServiceFunctionBindingProperties withOutputResponseName(String outputResponseName) {
        this.outputResponseName = outputResponseName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
        if (outputs() != null) {
            outputs().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("endpoint", this.endpoint);
        jsonWriter.writeStringField("apiKey", this.apiKey);
        jsonWriter.writeArrayField("inputs", this.inputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", this.outputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("batchSize", this.batchSize);
        jsonWriter.writeNumberField("numberOfParallelRequests", this.numberOfParallelRequests);
        jsonWriter.writeStringField("inputRequestName", this.inputRequestName);
        jsonWriter.writeStringField("outputResponseName", this.outputResponseName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureMachineLearningServiceFunctionBindingProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMachineLearningServiceFunctionBindingProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureMachineLearningServiceFunctionBindingProperties.
     */
    public static AzureMachineLearningServiceFunctionBindingProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            AzureMachineLearningServiceFunctionBindingProperties deserializedAzureMachineLearningServiceFunctionBindingProperties
                = new AzureMachineLearningServiceFunctionBindingProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpoint".equals(fieldName)) {
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.endpoint = reader.getString();
                } else if ("apiKey".equals(fieldName)) {
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.apiKey = reader.getString();
                } else if ("inputs".equals(fieldName)) {
                    List<AzureMachineLearningServiceInputColumn> inputs
                        = reader.readArray(reader1 -> AzureMachineLearningServiceInputColumn.fromJson(reader1));
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.inputs = inputs;
                } else if ("outputs".equals(fieldName)) {
                    List<AzureMachineLearningServiceOutputColumn> outputs
                        = reader.readArray(reader1 -> AzureMachineLearningServiceOutputColumn.fromJson(reader1));
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.outputs = outputs;
                } else if ("batchSize".equals(fieldName)) {
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.batchSize
                        = reader.getNullable(JsonReader::getInt);
                } else if ("numberOfParallelRequests".equals(fieldName)) {
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.numberOfParallelRequests
                        = reader.getNullable(JsonReader::getInt);
                } else if ("inputRequestName".equals(fieldName)) {
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.inputRequestName
                        = reader.getString();
                } else if ("outputResponseName".equals(fieldName)) {
                    deserializedAzureMachineLearningServiceFunctionBindingProperties.outputResponseName
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureMachineLearningServiceFunctionBindingProperties;
        });
    }
}
