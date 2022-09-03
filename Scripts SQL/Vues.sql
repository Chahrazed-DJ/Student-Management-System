
 drop view v_etudiant_liste
 /
 drop view v_moyenne
 /
 drop view v_moygenerale
 /
 
 /* TP9 (tache 2) */

 /* 01*/
 create or replace view v_moy as select etudiant.matricule_etu 
 as mat,nom_etu,prenom_etu,libelle, unite.code_unite as code,(note_cc+note_tp+note_examen*2)/4 as moy 
 from etudiant,unite,etudiantunite where etudiant.matricule_etu=etudiantunite.matricule_etu 
 and unite.code_unite=etudiantunite.code_unite
 /

 create or replace view v_moy_generale as 
 select mat,nom_etu,prenom_etu,avg(moy) as moyenne from v_moy
 group by mat,nom_etu,prenom_etu
 /
 
 select mat,moyenne from v_moy_generale
 /
 
 /* 02 */
 select libelle,avg(moy) as moy_section from v_moy group by libelle
 /
 
 /* 03 */
 select avg(moyenne) as moy_gen_section from v_moy_generale
 /
 
 /* 04 */
 select libelle, max(moy) as max_moy from v_moy group by libelle
 /
 
 /* 05 */
 select libelle, min(moy) as min_moy from v_moy group by libelle
 /
 
 /* 06 */
 select mat,prenom_etu,nom_etu,moyenne from  v_moy_generale
 where moyenne >=( select avg(moyenne) from v_moy_generale )
 /
 
 /* 07 */
 select nom_etu,prenom_etu from etudiant where 
 matricule_etu in (select matricule_etu from etudiantunite 
 group by matricule_etu having 
 count(note_examen)=(select count(code_unite) from unite))
 /

select nom_etu,prenom_etu from etudiant where 
 matricule_etu in (select matricule_etu from etudiantunite 
 group by matricule_etu having 
 count(note_examen)=4)
 /
