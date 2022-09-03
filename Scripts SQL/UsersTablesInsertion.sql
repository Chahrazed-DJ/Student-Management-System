    /****    TACHE O1    ***/
	
CREATE USER BDDAdmin IDENTIFIED BY TPAdmin
/
grant all privileges to BDDAdmin
/
connect BDDAdmin/TPAdmin
/
create table Etudiant( 
  matricule_etu int not null,
  nom_etu varchar2(30) not null,
  prenom_etu varchar2(30) not null,
  date_naissance date ,
  constraint matricule primary key (matricule_etu))
 /
create table Enseignant(
  matricule_ens int not null,
  nom_ens varchar2(30) not null,
  prenom_ens varchar2(30) not null,
  âge int ,
  constraint matricule_ensg primary key (matricule_ens))
/ 
create table Unite(
  code_Unite  varchar2(30) not null,
  libelle  varchar2(30) not null,
  nbr_heures  number not null ,
  matricule_ens int not null,
  constraint code_U primary key (code_Unite),
  constraint mat_ensg foreign key (matricule_ens)references Enseignant(matricule_ens))
/  
create table EtudiantUnite(
  matricule_etu int not null,
  code_Unite varchar2(40) not null,
  note_CC float check(note_cc >=0 and note_cc <=20) ,
  note_TP float check(note_TP >=0 and note_TP <=20),
  note_examen float check(note_examen >=0 and note_examen <=20),
  constraint mat_code primary key (matricule_etu,code_Unite),
  constraint mat foreign key (matricule_etu) references Etudiant(matricule_etu),
  constraint code foreign key (code_Unite) references  Unite(code_Unite))
/ 
create index  Etu on Etudiant( nom_etu ASC )
/
create index  Ensg on Enseignant( nom_ens DESC )
/

    /***    TACHE 02   ***/
	
create user Etudiant identified by TPEtudiant
/
grant select on Etudiant to Etudiant
/
create user Enseignant identified by TPEnseignant
/
grant select,insert on Enseignant to Enseignant
/

    /***    TACHE 03   ***/
	
alter table Etudiant add  Adresse varchar2(100)
/
alter table Enseignant drop column âge 
/
alter table Etudiant add constraint cond_mat check (matricule_etu >= 20190000 and matricule_etu <= 20199999) 
/
alter table Etudiant add constraint cond_matr check (matricule_etu between 20190000 and  20199999) 
/
alter table Etudiant modify nom_etu varchar2(35)
/

    /***    TACHE 04   ***/
	
insert into Etudiant values(20190001,'BOUSSAI' ,'MOHAMED','12/01/2000','Alger')
/
insert into Etudiant values(20190002,'CHAID','LAMIA','01/10/1999','Batna' )
/
insert into Etudiant values(20190003,'BRAHIMI','SOUAD','18/11/2000','Sétif')
/
insert into Etudiant values(20190004,'LAMA','SAID','23/05/1999','Oran' )
/

insert into Enseignant values(20000001,'HAROUNI','AMINE')
/
insert into Enseignant values(19990011,'FATHI','OMAR')
/
insert into Enseignant values(19980078,'BOUZIDANE','FARAH')
/
insert into Enseignant values(20170015,'ARABI','ZOUBIDA')
/

insert into Unite values('FEI0001','POO',6,20000001)
/
insert into Unite values('FEI0002','BDD',6,19990011)
/
insert into Unite values('FEI0003','RESEAU',3,20170015)
/
insert into Unite values('FEI0004','SYSTEME',6,19980078)
/

insert into EtudiantUnite values(20190001,'FEI0001',10,15,9)
/
insert into EtudiantUnite values(20190002,'FEI0001',20,13,10)
/
insert into EtudiantUnite values(20190004,'FEI0001',13,17,16)
/
insert into EtudiantUnite values(20190002,'FEI0002',10,16,17)
/
insert into EtudiantUnite values(20190003,'FEI0002',9,8,15)
/
insert into EtudiantUnite values(20190004,'FEI0002',15,9,20)
/
insert into EtudiantUnite values(20190002,'FEI0004',12,18,14)
/
insert into EtudiantUnite values(20190003,'FEI0004',17,12,15)
/
insert into EtudiantUnite values(20190004,'FEI0004',12,13,20)
/

update EtudiantUnite set note_CC=note_CC+2 where matricule_etu 
 in ( select matricule_etu from Etudiant where nom_etu like 'B%')
/
update EtudiantUnite set note_examen=0 where code_Unite 
  in (select code_Unite from Unite where libelle='SYSTEME')
/

    /***   TACHE 05  ***/
	
select nom_etu,prenom_etu from Etudiant where matricule_etu
 in(select matricule_etu from EtudiantUnite where note_examen=20)
/
select nom_etu,prenom_etu from Etudiant where matricule_etu 
  not in (select matricule_etu from EtudiantUnite where code_Unite 
    in ( select code_Unite from unite where libelle='POO'))
/
select libelle from unite where code_Unite
  not in(select code_Unite from EtudiantUnite)
/  
select nom_etu,prenom_etu,libelle,(note_CC+note_TP+note_examen*2)/4 as moyenne 
    from etudiant,etudiantunite,unite 
        where etudiant.matricule_etu=etudiantunite.matricule_etu and
            etudiantunite.code_Unite=unite.code_Unite
/
 
    /***   requete en plus   ***/
	
/*drop table EtudiantUnite
/
drop table Etudiant
/
drop table Unite
/
drop table Enseignant 
/
drop index Etu
/
drop index Ensg
/	
drop user Etudiant
/
drop user Enseingant
/
*/ 
  

