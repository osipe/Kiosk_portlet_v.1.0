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

package com.alpha.portlet.dmdc.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for FileDinhKem. This utility wraps
 * {@link com.alpha.portlet.dmdc.service.impl.FileDinhKemLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author darkn
 * @see FileDinhKemLocalService
 * @see com.alpha.portlet.dmdc.service.base.FileDinhKemLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.impl.FileDinhKemLocalServiceImpl
 * @generated
 */
public class FileDinhKemLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.alpha.portlet.dmdc.service.impl.FileDinhKemLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the file dinh kem to the database. Also notifies the appropriate model listeners.
	*
	* @param fileDinhKem the file dinh kem
	* @return the file dinh kem that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem addFileDinhKem(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFileDinhKem(fileDinhKem);
	}

	/**
	* Creates a new file dinh kem with the primary key. Does not add the file dinh kem to the database.
	*
	* @param fileDinhKemPK the primary key for the new file dinh kem
	* @return the new file dinh kem
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem createFileDinhKem(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK) {
		return getService().createFileDinhKem(fileDinhKemPK);
	}

	/**
	* Deletes the file dinh kem with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem that was removed
	* @throws PortalException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem deleteFileDinhKem(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFileDinhKem(fileDinhKemPK);
	}

	/**
	* Deletes the file dinh kem from the database. Also notifies the appropriate model listeners.
	*
	* @param fileDinhKem the file dinh kem
	* @return the file dinh kem that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem deleteFileDinhKem(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFileDinhKem(fileDinhKem);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchFileDinhKem(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFileDinhKem(fileDinhKemPK);
	}

	/**
	* Returns the file dinh kem with the primary key.
	*
	* @param fileDinhKemPK the primary key of the file dinh kem
	* @return the file dinh kem
	* @throws PortalException if a file dinh kem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem getFileDinhKem(
		com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK fileDinhKemPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFileDinhKem(fileDinhKemPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the file dinh kems.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alpha.portlet.dmdc.model.impl.FileDinhKemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of file dinh kems
	* @param end the upper bound of the range of file dinh kems (not inclusive)
	* @return the range of file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> getFileDinhKems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFileDinhKems(start, end);
	}

	/**
	* Returns the number of file dinh kems.
	*
	* @return the number of file dinh kems
	* @throws SystemException if a system exception occurred
	*/
	public static int getFileDinhKemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFileDinhKemsCount();
	}

	/**
	* Updates the file dinh kem in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fileDinhKem the file dinh kem
	* @return the file dinh kem that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.alpha.portlet.dmdc.model.FileDinhKem updateFileDinhKem(
		com.alpha.portlet.dmdc.model.FileDinhKem fileDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFileDinhKem(fileDinhKem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.alpha.portlet.dmdc.model.FileDinhKem addFileDinhKem(
		long userId, long resourceCode, long primKey, long repositoryId,
		java.lang.String pathParentFolder, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addFileDinhKem(userId, resourceCode, primKey, repositoryId,
			pathParentFolder, sourceFileName, mimeType, title, description,
			changeLog, is, size, serviceContext);
	}

	public static com.liferay.portal.kernel.repository.model.Folder createFolderParent(
		long userId, long repositoryId, java.lang.String path,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .createFolderParent(userId, repositoryId, path,
			serviceContext);
	}

	public static int countByR_P(long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByR_P(resourceCode, primKey);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByR_P(resourceCode, primKey);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByR_P(resourceCode, primKey, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByR_P(
		long resourceCode, long primKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByR_P(resourceCode, primKey, start, end, obc);
	}

	public static void removeByR_P(long resourceCode, long primKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByR_P(resourceCode, primKey);
	}

	public static int countByFileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByFileEntryId(fileEntryId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFileEntryId(fileEntryId);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFileEntryId(fileEntryId, start, end);
	}

	public static java.util.List<com.alpha.portlet.dmdc.model.FileDinhKem> findByFileEntryId(
		long fileEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByFileEntryId(fileEntryId, start, end, obc);
	}

	public static void removeByFileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByFileEntryId(fileEntryId);
	}

	public static com.alpha.portlet.dmdc.model.FileDinhKem fetchByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByR_P_F(resourceCode, primKey, fileEntryId);
	}

	public static com.alpha.portlet.dmdc.model.FileDinhKem findByR_P_F(
		long resourceCode, long primKey, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByR_P_F(resourceCode, primKey, fileEntryId);
	}

	public static void removeByR_P_F(long resourceCode, long primKey,
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeByR_P_F(resourceCode, primKey, fileEntryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FileDinhKemLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FileDinhKemLocalService.class.getName());

			if (invokableLocalService instanceof FileDinhKemLocalService) {
				_service = (FileDinhKemLocalService)invokableLocalService;
			}
			else {
				_service = new FileDinhKemLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FileDinhKemLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(FileDinhKemLocalService service) {
	}

	private static FileDinhKemLocalService _service;
}