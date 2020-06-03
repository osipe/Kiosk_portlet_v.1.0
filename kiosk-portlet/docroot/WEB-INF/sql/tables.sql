create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(255) null,
	ma VARCHAR(75) null,
	moTa STRING null,
	urlFile VARCHAR(75) null,
	hoatDong BOOLEAN,
	doUuTien INTEGER
);

create table alpha_dghl_cauhoi (
	cauHoiId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	moTa VARCHAR(75) null,
	hoatDong BOOLEAN,
	doUuTien INTEGER,
	boCauHoi INTEGER
);

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	resourceCode LONG,
	resourcePK LONG,
	cauHoiId LONG,
	traLoiId LONG
);

create table alpha_dghl_traloi (
	traLoiId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cauHoiId LONG,
	noiDung VARCHAR(75) null,
	mucDoHaiLong INTEGER,
	diem INTEGER
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	chuyenMucBieuMauId LONG,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	moTa VARCHAR(75) null,
	loai INTEGER,
	hoatDong BOOLEAN
);

create table alpha_dm_cauhinh (
	cauHinhId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	portletId VARCHAR(75) null,
	resourceCodeId LONG,
	primKey LONG,
	preferences VARCHAR(75) null,
	type_ INTEGER,
	description VARCHAR(75) null
);

create table alpha_dm_filedinhkem (
	resourceCode LONG not null,
	primKey LONG not null,
	fileEntryId LONG not null,
	nhanQuaMang BOOLEAN,
	extension VARCHAR(75) null,
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	moTa VARCHAR(75) null,
	hoatDong BOOLEAN,
	doUuTien INTEGER
);

create table alpha_dm_loaihoso (
	loaiHoSoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	linhVucId LONG,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	moTa VARCHAR(75) null,
	hoatDong BOOLEAN,
	doUuTien INTEGER,
	baiVietURL VARCHAR(75) null
);