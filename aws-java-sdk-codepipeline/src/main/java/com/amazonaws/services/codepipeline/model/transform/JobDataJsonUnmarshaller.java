/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDataJsonUnmarshaller implements Unmarshaller<JobData, JsonUnmarshallerContext> {

    public JobData unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobData jobData = new JobData();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actionTypeId", targetDepth)) {
                    context.nextToken();
                    jobData.setActionTypeId(ActionTypeIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("actionConfiguration", targetDepth)) {
                    context.nextToken();
                    jobData.setActionConfiguration(ActionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pipelineContext", targetDepth)) {
                    context.nextToken();
                    jobData.setPipelineContext(PipelineContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputArtifacts", targetDepth)) {
                    context.nextToken();
                    jobData.setInputArtifacts(new ListUnmarshaller<Artifact>(ArtifactJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputArtifacts", targetDepth)) {
                    context.nextToken();
                    jobData.setOutputArtifacts(new ListUnmarshaller<Artifact>(ArtifactJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("artifactCredentials", targetDepth)) {
                    context.nextToken();
                    jobData.setArtifactCredentials(AWSSessionCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("continuationToken", targetDepth)) {
                    context.nextToken();
                    jobData.setContinuationToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionKey", targetDepth)) {
                    context.nextToken();
                    jobData.setEncryptionKey(EncryptionKeyJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobData;
    }

    private static JobDataJsonUnmarshaller instance;

    public static JobDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobDataJsonUnmarshaller();
        return instance;
    }
}
