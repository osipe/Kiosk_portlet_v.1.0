drop database lportal;
create database lportal pagesize 8192;
connect to lportal;
create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(255),
	ma varchar(75),
	moTa varchar(750),
	urlFile varchar(75),
	hoatDong smallint,
	doUuTien integer
);

create table alpha_dghl_cauhoi (
	cauHoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong smallint,
	doUuTien integer,
	boCauHoi integer
);

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceCode bigint,
	resourcePK bigint,
	cauHoiId bigint,
	traLoiId bigint
);

create table alpha_dghl_traloi (
	traLoiId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	cauHoiId bigint,
	noiDung varchar(75),
	mucDoHaiLong integer,
	diem integer
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	chuyenMucBieuMauId bigint,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	loai integer,
	hoatDong smallint
);

create table alpha_dm_cauhinh (
	cauHinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	portletId varchar(75),
	resourceCodeId bigint,
	primKey bigint,
	preferences varchar(75),
	type_ integer,
	description varchar(75)
);

create table alpha_dm_filedinhkem (
	resourceCode bigint not null,
	primKey bigint not null,
	fileEntryId bigint not null,
	nhanQuaMang smallint,
	extension varchar(75),
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong smallint,
	doUuTien integer
);

create table alpha_dm_loaihoso (
	loaiHoSoId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	linhVucId bigint,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong smallint,
	doUuTien integer,
	baiVietId bigint
);


create index IX_FD689B89 on alpha_bdqh_bieudoquyhoach (hoatDong);

create index IX_503CD1C0 on alpha_dghl_cauhoi (companyId);
create index IX_EF407660 on alpha_dghl_cauhoi (groupId, boCauHoi, hoatDong);
create index IX_A0E12754 on alpha_dghl_cauhoi (groupId, hoatDong);
create index IX_1521E44A on alpha_dghl_cauhoi (groupId, ma);

create index IX_496087C7 on alpha_dghl_danhgiahailong (companyId);
create index IX_C16B610D on alpha_dghl_danhgiahailong (resourceCode, resourcePK);

create index IX_11AA81FA on alpha_dghl_traloi (cauHoiId);
create index IX_3F3F7308 on alpha_dghl_traloi (companyId);

create index IX_753A7B8C on alpha_dm_bieumaubaocao (chuyenMucBieuMauId);
create index IX_B9E9EBCC on alpha_dm_bieumaubaocao (companyId);
create index IX_7A74E65E on alpha_dm_bieumaubaocao (companyId, hoatDong);
create index IX_9C0C32D4 on alpha_dm_bieumaubaocao (companyId, ma);
create index IX_BC52F54E on alpha_dm_bieumaubaocao (groupId);
create index IX_F4097560 on alpha_dm_bieumaubaocao (groupId, hoatDong);
create index IX_520F63FB on alpha_dm_bieumaubaocao (loai);

create index IX_5FB7B42B on alpha_dm_cauhinh (companyId, portletId, resourceCodeId, type_);
create index IX_29A89FDE on alpha_dm_cauhinh (groupId, portletId);
create index IX_7B233568 on alpha_dm_cauhinh (groupId, portletId, resourceCodeId);
create index IX_5A633661 on alpha_dm_cauhinh (groupId, portletId, resourceCodeId, primKey);
create index IX_313A7454 on alpha_dm_cauhinh (groupId, portletId, resourceCodeId, primKey, type_);
create index IX_AE75CF6D on alpha_dm_cauhinh (groupId, portletId, resourceCodeId, type_);
create index IX_AEAFD437 on alpha_dm_cauhinh (groupId, portletId, type_);
create index IX_18A46C71 on alpha_dm_cauhinh (groupId, resourceCodeId);
create index IX_BBE4D978 on alpha_dm_cauhinh (groupId, resourceCodeId, primKey);
create index IX_166795D on alpha_dm_cauhinh (groupId, resourceCodeId, primKey, type_);
create index IX_15634C44 on alpha_dm_cauhinh (groupId, resourceCodeId, type_);
create index IX_A3597AA9 on alpha_dm_cauhinh (portletId, resourceCodeId, type_);

create index IX_E100BD58 on alpha_dm_filedinhkem (fileEntryId);
create index IX_FFE0C1F1 on alpha_dm_filedinhkem (resourceCode, primKey);
create index IX_9A7A69B0 on alpha_dm_filedinhkem (resourceCode, primKey, fileEntryId);

create index IX_351D21AA on alpha_dm_linhvuc (companyId);
create index IX_4A8FED3E on alpha_dm_linhvuc (groupId, hoatDong);
create index IX_432DE1B4 on alpha_dm_linhvuc (groupId, ma);

create index IX_1B07BADF on alpha_dm_loaihoso (companyId);
create index IX_3EFC8173 on alpha_dm_loaihoso (groupId, hoatDong);
create index IX_58D701A9 on alpha_dm_loaihoso (groupId, ma);
create index IX_B76BC06F on alpha_dm_loaihoso (linhVucId);


