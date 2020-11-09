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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateFileSystemWindowsConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemWindowsConfigurationJsonUnmarshaller implements Unmarshaller<CreateFileSystemWindowsConfiguration, JsonUnmarshallerContext> {

    public CreateFileSystemWindowsConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateFileSystemWindowsConfiguration createFileSystemWindowsConfiguration = new CreateFileSystemWindowsConfiguration();

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
                if (context.testExpression("ActiveDirectoryId", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setActiveDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelfManagedActiveDirectoryConfiguration", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("DeploymentType", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredSubnetId", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setPreferredSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputCapacity", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setThroughputCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WeeklyMaintenanceStartTime", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setWeeklyMaintenanceStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DailyAutomaticBackupStartTime", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setDailyAutomaticBackupStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutomaticBackupRetentionDays", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setAutomaticBackupRetentionDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToBackups", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setCopyTagsToBackups(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Aliases", targetDepth)) {
                    context.nextToken();
                    createFileSystemWindowsConfiguration.setAliases(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createFileSystemWindowsConfiguration;
    }

    private static CreateFileSystemWindowsConfigurationJsonUnmarshaller instance;

    public static CreateFileSystemWindowsConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFileSystemWindowsConfigurationJsonUnmarshaller();
        return instance;
    }
}
