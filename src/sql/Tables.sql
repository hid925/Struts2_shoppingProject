
drop table joinTable;
create table joinTable(
id varchar2(15) not null,
password varchar2(15) not null,
pwdQuestion varchar2(30),
pwdAnswer varchar2(10),
name varchar2(10) not null,
address varchar2(50),
postcode varchar2(10),
phone varchar2(15) not null,
email varchar2(20) not null,
primary key (id)
);


drop table productTable;
create table productTable(
pNum number(10) not null,
pName varchar2(20) not null,
pAuthor varchar2(20) not null,
pPrice number(10) not null,
pColor varchar2(10) not null,
pSize varchar2(5) not null,
pInnerContent varchar2(1000) not null,
pOuterContent varchar2(1000) not null,
pAmount number(5) not null,
pCategory varchar2(100) not null,
pFileName1 varchar2(200) null,
pOrgFile1 varchar2(200) null,
pFileName2 varchar2(200) null,
pOrgFile2 varchar2(200) null,
pFileName3 varchar2(200) null,
pOrgFile3 varchar2(200) null,
pWdate Date null,
pReadhit number(10) null,
primary key(pNum)
);

drop sequence productTable_pNum_seq;
create sequence productTable_pNum_seq start with 1 increment by 1 maxvalue 1000000;
commit;




drop table cartTable;
create table cartTable(
	cNo number(10) not null,
	cPnum number(10) not null,
	cAmount number(10) not null,
	cOrderer varchar2(20) not null,
	cPname varchar2(20)not null,
	cPprice number(10)not null,
	primary key(cNo)
);
drop sequence cartTable_cNo_seq;
create sequence cartTable_cNo_seq start with 1 increment by 1 maxvalue 1000000;

commit;



drop table qnaTable;
create table qnaTable(
qnaNum number(10) not null,
pRecNum number(10) not null,
qnaTitle varchar2(50) not null,
qnaName varchar2(10) not null,
qnaContents varchar2(1000) not null,
qnaDate Date not null,
primary key(qnaNum)
);
drop sequence qnaTable_qnaNum_seq;
create sequence qnaTable_qnaNum_seq start with 1 increment by 1 maxvalue 1000000;
commit;


