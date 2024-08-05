CREATE TABLE SCORE(
    SNO NUMBER(10),
    NAME VARCHAR2(30),
    KOR VARCHAR2(30),
    ENG VARCHAR2(30),
    MATH VARCHAR2(30)
);
ALTER TABLE SCORE ADD CONSTRAINT SCORE_SNO_PK PRIMARY KEY (SNO); --PK
CREATE SEQUENCE SCORE_SEQ NOCACHE; --시퀀스

---
create table SBOARD (
    num number(10, 0),
    name varchar2(50),
    title varchar2(50),
    content varchar2(50)
);
alter table SBOARD add CONSTRAINT sboard_pk PRIMARY key (num);
create SEQUENCE SBOARD_SEQ INCREMENT by 1 start with 1 nocache;
---
