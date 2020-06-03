drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;

create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(255 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa varchar2(4000) null,
	urlFile VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0)
);

create table alpha_dghl_cauhoi (
	cauHoiId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0),
	boCauHoi number(30,0)
);

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	resourceCode number(30,0),
	resourcePK number(30,0),
	cauHoiId number(30,0),
	traLoiId number(30,0)
);

create table alpha_dghl_traloi (
	traLoiId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	cauHoiId number(30,0),
	noiDung VARCHAR2(75 CHAR) null,
	mucDoHaiLong number(30,0),
	diem number(30,0)
);

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	chuyenMucBieuMauId number(30,0),
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	loai number(30,0),
	hoatDong number(1, 0)
);

create table alpha_dm_cauhinh (
	cauHinhId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	portletId VARCHAR2(75 CHAR) null,
	resourceCodeId number(30,0),
	primKey number(30,0),
	preferences VARCHAR2(75 CHAR) null,
	type_ number(30,0),
	description VARCHAR2(75 CHAR) null
);

create table alpha_dm_filedinhkem (
	resourceCode number(30,0) not null,
	primKey number(30,0) not null,
	fileEntryId number(30,0) not null,
	nhanQuaMang number(1, 0),
	extension VARCHAR2(75 CHAR) null,
	primary key (resourceCode, primKey, fileEntryId)
);

create table alpha_dm_linhvuc (
	linhVucId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0)
);

create table alpha_dm_loaihoso (
	loaiHoSoId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	linhVucId number(30,0),
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	moTa VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0),
	baiVietId number(30,0)
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



quit