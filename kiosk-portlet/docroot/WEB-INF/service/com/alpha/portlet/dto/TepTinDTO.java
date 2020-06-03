package com.alpha.portlet.dto;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.liferay.portal.kernel.util.Validator;

public class TepTinDTO {

	private long id;
	private long fileEntryId;
	private long size;
	private String uuid;
	private String title;
	private String changeLog;
	private String extension;
	private String description;
	private String contentType;
	private String sizeFormatted;
	private String sourceFileName;
	private String downloadFileURL;
	private String version;
	private boolean hassOldVersion;
	private String folderName;
	private String owner;
	private Date createDate;
	private DateFormat df;
	private int doDaiTenTepTin = 37;
	private boolean phatHanh;
	private boolean check;

	private InputStream inputStream;
	private String pathName;
	private boolean hasDeletePermission;
	private boolean fileBocTach;

	public TepTinDTO(long id, long fileEntryId, long size, String sizeFormatted, String contentType, String sourceFileName, String title, String extension, String description, String changeLog,
			InputStream inputStream, boolean check) {

		super();
		this.id = id;
		this.fileEntryId = fileEntryId;
		this.size = size;
		this.sizeFormatted = sizeFormatted;
		this.contentType = contentType;
		this.sourceFileName = sourceFileName;
		this.title = title;
		this.extension = extension;
		this.description = description;
		this.changeLog = changeLog;
		this.inputStream = inputStream;
		this.check = check;
	}

	public String getFileNameFormatted() {

		String result;
		if (title.length() > doDaiTenTepTin) {
			result = title.substring(0, doDaiTenTepTin) + "... (" + sizeFormatted + ")";
		} else {
			result = title + " (" + sizeFormatted + ")";
		}
		return result;
	}

	public String getDetail() {

		String result = "";
		if (Validator.isNotNull(title)) {
			String temp = "";
			if (title.lastIndexOf(".") > -1) {
				temp = title.substring(0, title.lastIndexOf("."));
			} else {
				temp = title;
			}
			if ((doDaiTenTepTin > 0) && (temp.length() > doDaiTenTepTin)) {
				result = temp.substring(0, doDaiTenTepTin) + "...";
			} else {
				result = temp;
			}
		}
		// Gan them owner va createDate
		if (df == null) {
			df = new SimpleDateFormat("dd/MM/yyyy_HH'h'mm");
		}
		result += "_" + owner + "_" + (createDate != null ? df.format(createDate) : "") + " (" + sizeFormatted + ")";

		return result;
	}

	public String getContentType() {

		return contentType;
	}

	public long getSize() {

		return size;
	}

	public void setContentType(String contentType) {

		this.contentType = contentType;
	}

	public void setSize(long size) {

		this.size = size;
	}

	public InputStream getInputStream() {

		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {

		this.inputStream = inputStream;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public String getChangeLog() {

		return changeLog;
	}

	public void setChangeLog(String changeLog) {

		this.changeLog = changeLog;
	}

	public String getSizeFormatted() {

		return sizeFormatted;
	}

	public long getId() {

		return id;
	}

	public long getFileEntryId() {

		return fileEntryId;
	}

	public String getSourceFileName() {

		return sourceFileName;
	}

	public void setSourceFileName(String sourceFileName) {

		this.sourceFileName = sourceFileName;
	}

	public String getExtension() {

		return extension;
	}

	public void setExtension(String extension) {

		this.extension = extension;
	}

	public String getDownloadFileURL() {

		return downloadFileURL;
	}

	public void setDownloadFileURL(String downloadFileURL) {

		this.downloadFileURL = downloadFileURL;
	}

	public boolean isHassOldVersion() {

		return hassOldVersion;
	}

	public void setHassOldVersion(boolean hassOldVersion) {

		this.hassOldVersion = hassOldVersion;
	}

	public String getUuid() {

		return uuid;
	}

	public void setUuid(String uuid) {

		this.uuid = uuid;
	}

	public String getVersion() {

		return version;
	}

	public void setVersion(String version) {

		this.version = version;
	}

	public String getFolderName() {

		return folderName;
	}

	public void setFolderName(String folderName) {

		this.folderName = folderName;
	}

	public String getOwner() {

		return owner;
	}

	public void setOwner(String owner) {

		this.owner = owner;
	}

	public Date getCreateDate() {

		return createDate;
	}

	public void setCreateDate(Date createDate) {

		this.createDate = createDate;
	}

	public boolean isCheck() {

		return check;
	}

	public void setCheck(boolean check) {

		this.check = check;
	}

	public void setId(long id) {

		this.id = id;
	}

	public void setFileEntryId(long fileEntryId) {

		this.fileEntryId = fileEntryId;
	}

	public void setSizeFormatted(String sizeFormatted) {

		this.sizeFormatted = sizeFormatted;
	}

	public String getPathName() {

		return pathName;
	}

	public void setPathName(String pathName) {

		this.pathName = pathName;
	}

	public boolean isPhatHanh() {

		return phatHanh;
	}

	public void setPhatHanh(boolean phatHanh) {

		this.phatHanh = phatHanh;
	}

	public boolean isHasDeletePermission() {
		return hasDeletePermission;
	}

	public void setHasDeletePermission(boolean hasDeletePermission) {
		this.hasDeletePermission = hasDeletePermission;
	}

	public boolean isFileBocTach() {
		return fileBocTach;
	}

	public void setFileBocTach(boolean fileBocTach) {
		this.fileBocTach = fileBocTach;
	}

}
