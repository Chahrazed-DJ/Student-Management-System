# Gestion des étudiants
Ceci est la version française du README. Pour l'anglais, veuillez consulter [README.md](./README.md).


## Description 

> Ce projet présente une application desktop très simple pour la gestion des étudiants.
Cette application est programmée en Java SE sous Eclipse et reliée à une base de données ORACLE/SQL. Son but est de permettre le stockage et le traitement des notes des étudiants , la recherche rapide ( des étudiants et des enseignants ) ainsi que quelques requêtes.

##  Outils et environnement de développement 

<div align="center">
       <b> ORACLE/SQL </b>
    -- <b> JAVA ( JDK + JRE ) </b>
    -- <b> IDE ( Eclipse ) </b>
</div>

## Ce qu'on peut faire avec l'application ( Les fonctionnalités )

1) L'application est utilisée par les administrateurs de l'établissement scolaire et ils peuvent utiliser les fonctionnalités suivantes:

   - Enregistrer les informations sur chaque étudiant dans la base de données ( Insertion )
   - Enregistrer les  informations sur chaque enseignant dans la base de données ( Insertion )
   - Afficher la liste des étudiants et des enseignants 
   - Afficher les moyennes générales des etudiants
   - Exécuter certaines requêtes
  
<table align="center">
  <tr>
    <th> User </th>
    <th> Password </th>
  </tr>
  <tr>
    <td> BDDAdmin </td>
    <td> TPAdmin </td>
  </tr>
</table>

###### Présentation des interfaces 

<table align="center">
  <tr>
    <th  colspan="3"> Authentification </th>
  </tr>
  <tr>
    <td> <img src="captures/capt_1.PNG" />  </td> <td> <img src="captures/capt_2.PNG" /> </td> <td>  <img src="captures/capt_3.PNG" /> </td>
  </tr>
 </table>
<table align="center">
   <tr>
    <th colspan="3"> Home Page, Insertion et Affichage </th>
  </tr>
  <tr>
    <td > <img src="captures/capt_4.PNG" /> </td> <td> <img src="captures/capt_5.PNG" />  </td>  <td > <img src="captures/capt_7.PNG" /> </td>
  </tr>
 </table>
 <table align="center">
  <tr>
    <th colspan="2">  Requêtes </th>
  </tr>
  <tr>
   <td> <img src="captures/capt_8.PNG" />  </td> <td> <img src="captures/capt_9.PNG" /> </td>  
  </tr>
</table>

2)  L'application est utilisée aussi par les étudiants, Où chaque étudiant peut faire que ça:

     - Accéder à ses informations en saisisssant son numéro étudiant 

<table align="center">
  <tr>
    <th> User </th>
    <th> Password </th>
  </tr>
  <tr>
    <td> Etudiant </td>
    <td> TPEtudiant </td>
  </tr>
</table>

###### Présentation des interfaces 

<table align="center">
  <tr>
   <td> <img src="captures/capt_10.PNG" />  </td> <td> <img src="captures/capt_11.PNG" /> </td>  
  </tr>
</table>

3) L'enseignant peut lui aussi accéder à l'aplication et : 

    - Accéder à ses informations en saisisssant son code identifiant
    - Insérer un enseignant dans la base de données 
 
<table align="center">
  <tr>
    <th> User </th>
    <th> Password </th>
  </tr>
  <tr>
    <td> Enseignant </td>
    <td> TPEnseignant </td>
  </tr>
</table>

###### Présentation des interfaces 
   
<table align="center">
   <tr>
    <th colspan="3">  <img src="captures/capt_12.PNG" /> </th>
  </tr>
  <tr>
   <td> <img src="captures/capt_13.PNG" />  </td>  <td > <img src="captures/capt_14.PNG" /> </td>
  </tr>
 </table>

## Tables de la base de données : Schéma relationnel 

La modélisation est une étape fondamentale de la conception de la BD dans la mesure où, d’une part, on y détermine le contenu de la BD et, 
d’autre part, on y définit la nature des relations entre les concepts principaux.

- ( * : désigne une Clé étrangère / Gris : Clé primaire ) 

   - Etudiant (`matricule_etu`, nom_etu, prenom_etu, date_naissance)
   - Unité (`code_Unité`, libelle, nbr_heures, matricule_ens*)
   - Enseignant (`matricule_ens`, nom_ens, prenom_ens, âge)
   - EtudiantUnité (`matricule_etu*,code_Unité*`, note_CC, note_TP, note_examen)

</br></br>
<table align="center">
  <tr>
    <th>
    📝 Tous les scripts SQL et les fichiers nécessaires pour la création de la BD sont disponibles. Cette petite application peut avoir préalablement 
           prévus des modifications, tel qu'on peut rajouter les traitements qui manquent comme la modification et la suppression de données.
    </th>
  </tr>
</table>
