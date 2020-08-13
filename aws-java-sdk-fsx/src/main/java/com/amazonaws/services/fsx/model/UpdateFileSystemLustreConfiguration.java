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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration object for Amazon FSx for Lustre file systems used in the <code>UpdateFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystemLustreConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemLustreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     */
    private String weeklyMaintenanceStartTime;

    private String dailyAutomaticBackupStartTime;

    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3 data
     * repository. You use AutoImport to update the contents of your FSx for Lustre file system automatically with
     * changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the
     * FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist in the
     * FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file
     * system. Files deleted from the linked data repository are not deleted from the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not currently
     * exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository
     * are also automatically imported to the FSx file system. Files deleted from the linked data repository are not
     * deleted from the FSx file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     */
    private String autoImportPolicy;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the
     *        weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @return The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the
     *         weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the
     *        weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemLustreConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * @return
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemLustreConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * @param automaticBackupRetentionDays
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * @return
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * @param automaticBackupRetentionDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemLustreConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3 data
     * repository. You use AutoImport to update the contents of your FSx for Lustre file system automatically with
     * changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the
     * FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist in the
     * FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file
     * system. Files deleted from the linked data repository are not deleted from the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not currently
     * exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository
     * are also automatically imported to the FSx file system. Files deleted from the linked data repository are not
     * deleted from the FSx file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3
     *        data repository. You use AutoImport to update the contents of your FSx for Lustre file system
     *        automatically with changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can
     *        have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected
     *        on the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist
     *        in the FSx file system are automatically imported. Updates to existing FSx files are not imported to the
     *        FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not
     *        currently exist in the FSx file system are automatically imported. Changes to existing FSx files in the
     *        linked repository are also automatically imported to the FSx file system. Files deleted from the linked
     *        data repository are not deleted from the FSx file system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @see AutoImportPolicyType
     */

    public void setAutoImportPolicy(String autoImportPolicy) {
        this.autoImportPolicy = autoImportPolicy;
    }

    /**
     * <p>
     * (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3 data
     * repository. You use AutoImport to update the contents of your FSx for Lustre file system automatically with
     * changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the
     * FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist in the
     * FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file
     * system. Files deleted from the linked data repository are not deleted from the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not currently
     * exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository
     * are also automatically imported to the FSx file system. Files deleted from the linked data repository are not
     * deleted from the FSx file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @return (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3
     *         data repository. You use AutoImport to update the contents of your FSx for Lustre file system
     *         automatically with changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can
     *         have the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected
     *         on the FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist
     *         in the FSx file system are automatically imported. Updates to existing FSx files are not imported to the
     *         FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not
     *         currently exist in the FSx file system are automatically imported. Changes to existing FSx files in the
     *         linked repository are also automatically imported to the FSx file system. Files deleted from the linked
     *         data repository are not deleted from the FSx file system.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *         updates from your S3 bucket</a>.
     * @see AutoImportPolicyType
     */

    public String getAutoImportPolicy() {
        return this.autoImportPolicy;
    }

    /**
     * <p>
     * (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3 data
     * repository. You use AutoImport to update the contents of your FSx for Lustre file system automatically with
     * changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the
     * FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist in the
     * FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file
     * system. Files deleted from the linked data repository are not deleted from the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not currently
     * exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository
     * are also automatically imported to the FSx file system. Files deleted from the linked data repository are not
     * deleted from the FSx file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3
     *        data repository. You use AutoImport to update the contents of your FSx for Lustre file system
     *        automatically with changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can
     *        have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected
     *        on the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist
     *        in the FSx file system are automatically imported. Updates to existing FSx files are not imported to the
     *        FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not
     *        currently exist in the FSx file system are automatically imported. Changes to existing FSx files in the
     *        linked repository are also automatically imported to the FSx file system. Files deleted from the linked
     *        data repository are not deleted from the FSx file system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoImportPolicyType
     */

    public UpdateFileSystemLustreConfiguration withAutoImportPolicy(String autoImportPolicy) {
        setAutoImportPolicy(autoImportPolicy);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3 data
     * repository. You use AutoImport to update the contents of your FSx for Lustre file system automatically with
     * changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected on the
     * FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist in the
     * FSx file system are automatically imported. Updates to existing FSx files are not imported to the FSx file
     * system. Files deleted from the linked data repository are not deleted from the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not currently
     * exist in the FSx file system are automatically imported. Changes to existing FSx files in the linked repository
     * are also automatically imported to the FSx file system. Files deleted from the linked data repository are not
     * deleted from the FSx file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        (Optional) Use this property to configure the AutoImport feature on the file system's linked Amazon S3
     *        data repository. You use AutoImport to update the contents of your FSx for Lustre file system
     *        automatically with changes that occur in the linked S3 data repository. <code>AutoImportPolicy</code> can
     *        have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Changes in the linked data repository are not reflected
     *        on the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. New files in the linked data repository that do not currently exist
     *        in the FSx file system are automatically imported. Updates to existing FSx files are not imported to the
     *        FSx file system. Files deleted from the linked data repository are not deleted from the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. New files in the linked S3 data repository that do not
     *        currently exist in the FSx file system are automatically imported. Changes to existing FSx files in the
     *        linked repository are also automatically imported to the FSx file system. Files deleted from the linked
     *        data repository are not deleted from the FSx file system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoImportPolicyType
     */

    public UpdateFileSystemLustreConfiguration withAutoImportPolicy(AutoImportPolicyType autoImportPolicy) {
        this.autoImportPolicy = autoImportPolicy.toString();
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: ").append(getDailyAutomaticBackupStartTime()).append(",");
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: ").append(getAutomaticBackupRetentionDays()).append(",");
        if (getAutoImportPolicy() != null)
            sb.append("AutoImportPolicy: ").append(getAutoImportPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemLustreConfiguration == false)
            return false;
        UpdateFileSystemLustreConfiguration other = (UpdateFileSystemLustreConfiguration) obj;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getAutomaticBackupRetentionDays() == null ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null && other.getAutomaticBackupRetentionDays().equals(this.getAutomaticBackupRetentionDays()) == false)
            return false;
        if (other.getAutoImportPolicy() == null ^ this.getAutoImportPolicy() == null)
            return false;
        if (other.getAutoImportPolicy() != null && other.getAutoImportPolicy().equals(this.getAutoImportPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getAutoImportPolicy() == null) ? 0 : getAutoImportPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemLustreConfiguration clone() {
        try {
            return (UpdateFileSystemLustreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.UpdateFileSystemLustreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
