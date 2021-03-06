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
package com.amazonaws.services.codecommit.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostCommentForPullRequestResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCommentForPullRequestResultJsonUnmarshaller implements Unmarshaller<PostCommentForPullRequestResult, JsonUnmarshallerContext> {

    public PostCommentForPullRequestResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostCommentForPullRequestResult postCommentForPullRequestResult = new PostCommentForPullRequestResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postCommentForPullRequestResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("repositoryName", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pullRequestId", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setPullRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("beforeCommitId", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setBeforeCommitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterCommitId", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setAfterCommitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("beforeBlobId", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setBeforeBlobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("afterBlobId", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setAfterBlobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setLocation(LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("comment", targetDepth)) {
                    context.nextToken();
                    postCommentForPullRequestResult.setComment(CommentJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return postCommentForPullRequestResult;
    }

    private static PostCommentForPullRequestResultJsonUnmarshaller instance;

    public static PostCommentForPullRequestResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostCommentForPullRequestResultJsonUnmarshaller();
        return instance;
    }
}
