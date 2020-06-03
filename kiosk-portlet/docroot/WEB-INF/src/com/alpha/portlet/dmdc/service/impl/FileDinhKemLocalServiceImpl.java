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

package com.alpha.portlet.dmdc.service.impl;

import com.alpha.portlet.dmdc.model.FileDinhKem;
import com.alpha.portlet.dmdc.service.base.FileDinhKemLocalServiceBaseImpl;
import com.alpha.portlet.dmdc.service.persistence.FileDinhKemPK;
import com.alpha.portlet.enums.ResourceCodeKiokEnum;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the file dinh kem local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alpha.portlet.dmdc.service.FileDinhKemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author darkn
 * @see com.alpha.portlet.dmdc.service.base.FileDinhKemLocalServiceBaseImpl
 * @see com.alpha.portlet.dmdc.service.FileDinhKemLocalServiceUtil
 */
public class FileDinhKemLocalServiceImpl extends FileDinhKemLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.alpha.portlet.dmdc.service.FileDinhKemLocalServiceUtil} to access the file dinh kem local service.
	 */
	public FileDinhKem addFileDinhKem(
		long userId, long resourceCode, long primKey, long repositoryId, String pathParentFolder, String sourceFileName, String mimeType, String title, String description, String changeLog,
		InputStream is, long size, ServiceContext serviceContext)
		throws PortalException, SystemException {

		Folder folder = getFolder(userId, repositoryId, pathParentFolder, resourceCode, primKey, serviceContext);

		long folderId = folder.getFolderId();

		boolean update = false;
		FileDinhKemPK pk = null;
		try {
			DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.getFileEntry(repositoryId, folderId, title);
			if (dlFileEntry != null) {
				DLAppLocalServiceUtil.updateFileEntry(userId, dlFileEntry.getFileEntryId(), sourceFileName, mimeType, title, description, changeLog, true, is, size, serviceContext);
				update = true;
				pk = new FileDinhKemPK(resourceCode, primKey, dlFileEntry.getFileEntryId());
			}
		}
		catch (Exception e) {
		}
		if (!update) {
			FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, repositoryId, folderId, sourceFileName, mimeType, title, description, changeLog, is, size, serviceContext);
			pk = new FileDinhKemPK(resourceCode, primKey, fileEntry.getFileEntryId());
		}

		FileDinhKem fileDinhKem = fileDinhKemPersistence.create(pk);

		fileDinhKemPersistence.update(fileDinhKem);

		return fileDinhKem;
	}
	
	private Folder getFolder(long userId, long repositoryId, String pathParentFolder, 
			long resourceCodeId, long primKey, ServiceContext serviceContext)
			throws PortalException, SystemException {
			
		ServiceContext serviceContextFolder = new ServiceContext();
		serviceContextFolder.setCompanyId(serviceContext.getCompanyId());
		serviceContextFolder.setScopeGroupId(serviceContext.getScopeGroupId());
		serviceContextFolder.setUserId(serviceContext.getUserId());
		serviceContextFolder.setAddGroupPermissions(true);
		serviceContextFolder.setGroupPermissions(new String[] { ActionKeys.VIEW });
		Folder rootFolder, folderParent, folder;

		rootFolder = createFolderParent(userId, repositoryId, pathParentFolder.trim(), serviceContext);
		String resourceCodeName = null;
		for(ResourceCodeKiokEnum en : ResourceCodeKiokEnum.values()){
			if(en.getCodeId() == resourceCodeId){
				resourceCodeName = en.getName();
			}
		}
		try {
			folderParent = DLAppLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(), /*resourceCode.getName()*/resourceCodeName);
		}
		catch (Exception e) {
			String description = "folder " + /*resourceCode.getName()*/resourceCodeName;
			folderParent = DLAppLocalServiceUtil.addFolder(userId, repositoryId, rootFolder.getFolderId(), /*resourceCode.getName()*/resourceCodeName, description, serviceContextFolder);
		}
		try {
			folder = DLAppLocalServiceUtil.getFolder(repositoryId, folderParent.getFolderId(), String.valueOf(primKey));
		}
		catch (Exception e) {
			folder = DLAppLocalServiceUtil.addFolder(userId, repositoryId, folderParent.getFolderId(), String.valueOf(primKey), "", serviceContextFolder);
		}
		return folder;
	}
	
	public Folder createFolderParent(long userId, long repositoryId, String path, ServiceContext serviceContext)
			throws PortalException, SystemException {
			
		ServiceContext serviceContextFolder = new ServiceContext();
		serviceContextFolder.setCompanyId(serviceContext.getCompanyId());
		serviceContextFolder.setScopeGroupId(serviceContext.getScopeGroupId());
		serviceContextFolder.setUserId(serviceContext.getUserId());
		serviceContextFolder.setAddGroupPermissions(true);
		serviceContextFolder.setGroupPermissions(new String[] { ActionKeys.VIEW });
		
		Folder rootFolder, folderParent;
		if (path.startsWith("/")) {
			path = path.substring(1);
		}
		if (path.endsWith("/")) {
			path = path.substring(0, path.length() - 1);
		}
		String[] folderNames = path.split("/");
		try {
			rootFolder = DLAppLocalServiceUtil.getFolder(repositoryId, 0, folderNames[0]);
		}
		catch (Exception e) {
			String description = "root parent " + folderNames[0];
			rootFolder = DLAppLocalServiceUtil.addFolder(userId, repositoryId, 0, folderNames[0], description, serviceContextFolder);
		}

		for (int i = 1; i < folderNames.length; i++) {
			try {
				folderParent = DLAppLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(), folderNames[i]);
			}
			catch (Exception e) {
				String description = "folder parent " + folderNames[i];
				folderParent = DLAppLocalServiceUtil.addFolder(userId, repositoryId, rootFolder.getFolderId(), folderNames[i], description, serviceContextFolder);
			}
			rootFolder = folderParent;
		}
		return rootFolder;
	}

	public int countByR_P(long resourceCode, long primKey)
		throws SystemException {
		return fileDinhKemPersistence.countByR_P(resourceCode, primKey);
	}

	public List<FileDinhKem> findByR_P(long resourceCode, long primKey)
		throws SystemException {
		return fileDinhKemPersistence.findByR_P(resourceCode, primKey);
	}

	public List<FileDinhKem> findByR_P(long resourceCode, long primKey,
		int start, int end) throws SystemException {
		return fileDinhKemPersistence.findByR_P(resourceCode, primKey, start,
			end);
	}

	public List<FileDinhKem> findByR_P(long resourceCode, long primKey,
		int start, int end, OrderByComparator obc) throws SystemException {
		return fileDinhKemPersistence.findByR_P(resourceCode, primKey, start,
			end, obc);
	}

	public void removeByR_P(long resourceCode, long primKey)
		throws SystemException {
		fileDinhKemPersistence.removeByR_P(resourceCode, primKey);
	}

	public int countByFileEntryId(long fileEntryId) throws SystemException {
		return fileDinhKemPersistence.countByFileEntryId(fileEntryId);
	}

	public List<FileDinhKem> findByFileEntryId(long fileEntryId)
		throws SystemException {
		return fileDinhKemPersistence.findByFileEntryId(fileEntryId);
	}

	public List<FileDinhKem> findByFileEntryId(long fileEntryId, int start,
		int end) throws SystemException {
		return fileDinhKemPersistence.findByFileEntryId(fileEntryId, start, end);
	}

	public List<FileDinhKem> findByFileEntryId(long fileEntryId, int start,
		int end, OrderByComparator obc) throws SystemException {
		return fileDinhKemPersistence.findByFileEntryId(fileEntryId, start,
			end, obc);
	}

	public void removeByFileEntryId(long fileEntryId) throws SystemException {
		fileDinhKemPersistence.removeByFileEntryId(fileEntryId);
	}

	public FileDinhKem fetchByR_P_F(long resourceCode, long primKey,
		long fileEntryId) throws SystemException {
		return fileDinhKemPersistence.fetchByR_P_F(resourceCode, primKey,
			fileEntryId);
	}

	public FileDinhKem findByR_P_F(long resourceCode, long primKey,
		long fileEntryId) throws SystemException, PortalException {
		return fileDinhKemPersistence.findByR_P_F(resourceCode, primKey,
			fileEntryId);
	}

	public void removeByR_P_F(long resourceCode, long primKey, long fileEntryId)
		throws SystemException, PortalException {
		FileDinhKem fileDinhKem = fetchByR_P_F(resourceCode, primKey, fileEntryId);
		if (fileDinhKem != null) {
			deleteFileDinhKem(fileDinhKem);
		}
	}
}