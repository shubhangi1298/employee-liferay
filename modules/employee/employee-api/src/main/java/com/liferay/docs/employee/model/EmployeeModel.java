/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.employee.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;EMP_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.employee.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.employee.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author Liferay
 * @see Employee
 * @see com.liferay.docs.employee.model.impl.EmployeeImpl
 * @see com.liferay.docs.employee.model.impl.EmployeeModelImpl
 * @generated
 */
@ProviderType
public interface EmployeeModel extends BaseModel<Employee>, GroupedModel,
	ShardedModel, StagedAuditedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the emp ID of this employee.
	 *
	 * @return the emp ID of this employee
	 */
	public long getEmpId();

	/**
	 * Sets the emp ID of this employee.
	 *
	 * @param empId the emp ID of this employee
	 */
	public void setEmpId(long empId);

	/**
	 * Returns the group ID of this employee.
	 *
	 * @return the group ID of this employee
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this employee.
	 *
	 * @param groupId the group ID of this employee
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this employee.
	 *
	 * @return the company ID of this employee
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this employee.
	 *
	 * @param companyId the company ID of this employee
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this employee.
	 *
	 * @return the user ID of this employee
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this employee.
	 *
	 * @param userId the user ID of this employee
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this employee.
	 *
	 * @return the user uuid of this employee
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this employee.
	 *
	 * @param userUuid the user uuid of this employee
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this employee.
	 *
	 * @return the user name of this employee
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this employee.
	 *
	 * @param userName the user name of this employee
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this employee.
	 *
	 * @return the create date of this employee
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this employee.
	 *
	 * @param createDate the create date of this employee
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this employee.
	 *
	 * @return the modified date of this employee
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this employee.
	 *
	 * @param modifiedDate the modified date of this employee
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this employee.
	 *
	 * @return the status of this employee
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this employee.
	 *
	 * @param status the status of this employee
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this employee.
	 *
	 * @return the status by user ID of this employee
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this employee.
	 *
	 * @param statusByUserId the status by user ID of this employee
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this employee.
	 *
	 * @return the status by user uuid of this employee
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this employee.
	 *
	 * @param statusByUserUuid the status by user uuid of this employee
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this employee.
	 *
	 * @return the status by user name of this employee
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this employee.
	 *
	 * @param statusByUserName the status by user name of this employee
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this employee.
	 *
	 * @return the status date of this employee
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this employee.
	 *
	 * @param statusDate the status date of this employee
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the psno of this employee.
	 *
	 * @return the psno of this employee
	 */
	public long getPsno();

	/**
	 * Sets the psno of this employee.
	 *
	 * @param psno the psno of this employee
	 */
	public void setPsno(long psno);

	/**
	 * Returns the fname of this employee.
	 *
	 * @return the fname of this employee
	 */
	@AutoEscape
	public String getFname();

	/**
	 * Sets the fname of this employee.
	 *
	 * @param fname the fname of this employee
	 */
	public void setFname(String fname);

	/**
	 * Returns the lname of this employee.
	 *
	 * @return the lname of this employee
	 */
	@AutoEscape
	public String getLname();

	/**
	 * Sets the lname of this employee.
	 *
	 * @param lname the lname of this employee
	 */
	public void setLname(String lname);

	/**
	 * Returns the email of this employee.
	 *
	 * @return the email of this employee
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this employee.
	 *
	 * @param email the email of this employee
	 */
	public void setEmail(String email);

	/**
	 * Returns the emp address of this employee.
	 *
	 * @return the emp address of this employee
	 */
	@AutoEscape
	public String getEmpAddress();

	/**
	 * Sets the emp address of this employee.
	 *
	 * @param empAddress the emp address of this employee
	 */
	public void setEmpAddress(String empAddress);

	/**
	 * Returns <code>true</code> if this employee is approved.
	 *
	 * @return <code>true</code> if this employee is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this employee is denied.
	 *
	 * @return <code>true</code> if this employee is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this employee is a draft.
	 *
	 * @return <code>true</code> if this employee is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this employee is expired.
	 *
	 * @return <code>true</code> if this employee is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this employee is inactive.
	 *
	 * @return <code>true</code> if this employee is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this employee is incomplete.
	 *
	 * @return <code>true</code> if this employee is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this employee is pending.
	 *
	 * @return <code>true</code> if this employee is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this employee is scheduled.
	 *
	 * @return <code>true</code> if this employee is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Employee employee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Employee> toCacheModel();

	@Override
	public Employee toEscapedModel();

	@Override
	public Employee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}