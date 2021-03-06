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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists the channels to which app instance users belong.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AppInstanceUserMembershipSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceUserMembershipSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of channel summary,
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time at which a summary was last read.
     * </p>
     */
    private java.util.Date readMarkerTimestamp;

    /**
     * <p>
     * The type of channel summary,
     * </p>
     * 
     * @param type
     *        The type of channel summary,
     * @see ChannelMembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of channel summary,
     * </p>
     * 
     * @return The type of channel summary,
     * @see ChannelMembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of channel summary,
     * </p>
     * 
     * @param type
     *        The type of channel summary,
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public AppInstanceUserMembershipSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of channel summary,
     * </p>
     * 
     * @param type
     *        The type of channel summary,
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public AppInstanceUserMembershipSummary withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time at which a summary was last read.
     * </p>
     * 
     * @param readMarkerTimestamp
     *        The time at which a summary was last read.
     */

    public void setReadMarkerTimestamp(java.util.Date readMarkerTimestamp) {
        this.readMarkerTimestamp = readMarkerTimestamp;
    }

    /**
     * <p>
     * The time at which a summary was last read.
     * </p>
     * 
     * @return The time at which a summary was last read.
     */

    public java.util.Date getReadMarkerTimestamp() {
        return this.readMarkerTimestamp;
    }

    /**
     * <p>
     * The time at which a summary was last read.
     * </p>
     * 
     * @param readMarkerTimestamp
     *        The time at which a summary was last read.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserMembershipSummary withReadMarkerTimestamp(java.util.Date readMarkerTimestamp) {
        setReadMarkerTimestamp(readMarkerTimestamp);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getReadMarkerTimestamp() != null)
            sb.append("ReadMarkerTimestamp: ").append(getReadMarkerTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceUserMembershipSummary == false)
            return false;
        AppInstanceUserMembershipSummary other = (AppInstanceUserMembershipSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getReadMarkerTimestamp() == null ^ this.getReadMarkerTimestamp() == null)
            return false;
        if (other.getReadMarkerTimestamp() != null && other.getReadMarkerTimestamp().equals(this.getReadMarkerTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getReadMarkerTimestamp() == null) ? 0 : getReadMarkerTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public AppInstanceUserMembershipSummary clone() {
        try {
            return (AppInstanceUserMembershipSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AppInstanceUserMembershipSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
