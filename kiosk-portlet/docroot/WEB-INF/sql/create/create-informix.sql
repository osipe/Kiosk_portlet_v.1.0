database sysmaster;
drop database lportal;
create database lportal WITH LOG;

create procedure 'lportal'.isnull(test_string varchar)
returning boolean;
IF test_string IS NULL THEN
	RETURN 't';
ELSE
	RETURN 'f';
END IF
end procedure;


create table alpha_bdqh_bieudoquyhoach (
	bieuDoQuyHoachId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(255),
	ma varchar(75),
	moTa lvarchar,
	urlFile varchar(75),
	hoatDong boolean,
	doUuTien int
)
extent size 16 next size 16
lock mode row;

create table alpha_dghl_cauhoi (
	cauHoiId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong boolean,
	doUuTien int,
	boCauHoi int
)
extent size 16 next size 16
lock mode row;

create table alpha_dghl_danhgiahailong (
	danhGiaHaiLongId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	resourceCode int8,
	resourcePK int8,
	cauHoiId int8,
	traLoiId int8
)
extent size 16 next size 16
lock mode row;

create table alpha_dghl_traloi (
	traLoiId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	cauHoiId int8,
	noiDung varchar(75),
	mucDoHaiLong int,
	diem int
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_bieumaubaocao (
	bieuMauBaoCaoId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	chuyenMucBieuMauId int8,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	loai int,
	hoatDong boolean
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_cauhinh (
	cauHinhId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	portletId varchar(75),
	resourceCodeId int8,
	primKey int8,
	preferences varchar(75),
	type_ int,
	description varchar(75)
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_filedinhkem (
	resourceCode int8 not null,
	primKey int8 not null,
	fileEntryId int8 not null,
	nhanQuaMang boolean,
	extension varchar(75),
	primary key (resourceCode, primKey, fileEntryId)
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_linhvuc (
	linhVucId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong boolean,
	doUuTien int
)
extent size 16 next size 16
lock mode row;

create table alpha_dm_loaihoso (
	loaiHoSoId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	linhVucId int8,
	ten varchar(75),
	ma varchar(75),
	moTa varchar(75),
	hoatDong boolean,
	doUuTien int,
	baiVietId int8
)
extent size 16 next size 16
lock mode row;


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


