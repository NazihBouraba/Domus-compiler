// Specification JFlex

import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column

date = "(" ([0-9]{4} | _ ) ","([0-9]{2}  | _ ) "," ([0-9]{2}) "," ([0-9]{2}) "," ([0-9]{2}) ")"


pdo = "<PROGRAMME_DOMUS>"
pdf = "</PROGRAMME_DOMUS>"

dao = "<DECLARATION_APPAREILS>"
daf = "</DECLARATION_APPAREILS>"

dio = "<DECLARATION_INTERFACES>"
dif = "</DECLARATION_INTERFACES>"

dso = "<DECLARATION_SCENARII>"
dsf = "</DECLARATION_SCENARII>"



dco = "<DECLARATION_COMMANDES>"
dcf = "</DECLARATION_COMMANDES>"

dsceno = "<SCENARIO "(([a-zA-Z])+([0-9])+)">"
dscenf = "</SCENARIO "(([a-zA-Z])+([0-9])+)">"

type = ("eclairage" | "volet" | "chauffage" | "alarme" | "fenetre" )

ap = "autre_appareil"  

nap = "("(([a-zA-Z])+)")"

nom_ens = (([a-zA-Z])+)"="

id = (([a-zA-Z])+)[0-9]+

h = \"      // le "

%%


{pdo}  { return new Symbol(sym.PDO); }            //PROGRAMME DOMUS
{pdf}  { return new Symbol(sym.PDF); }


        
{id}  { return new Symbol(sym.ID); }
{nom_ens}  { return new Symbol(sym.ENS); }
{nap}  { return new Symbol(sym.nap); }


{dao}  { return new Symbol(sym.DAO); }           // DECLARATION_APPAREILS
{daf}  { return new Symbol(sym.DAF); }

{dio}  { return new Symbol(sym.DIO); }              // DECLARATION_INTERFACES
{dif}  { return new Symbol(sym.DIF); } 

{dso}  { return new Symbol(sym.DSO); }              // DECLARATION_SCENARII
{dsf}  { return new Symbol(sym.DSF); }

{dco}  { return new Symbol(sym.DCO); }             // DECLARATION_COMMANDES
{dcf}  { return new Symbol(sym.DCF); }

{dsceno}  { return new Symbol(sym.DSCO); }         // DECLARATION_SCENARIO
{dscenf}  { return new Symbol(sym.DSCF); }

scenario_id  { return new Symbol(sym.scenario_id); }

"=="  { return new Symbol(sym.EGAL); }
":"  { return new Symbol(sym.DP); }
";"  { return new Symbol(sym.PV); }
"."  { return new Symbol(sym.PT); }
","  { return new Symbol(sym.VG); }
"("  { return new Symbol(sym.PO); }
")"  { return new Symbol(sym.PF); }
"{"  { return new Symbol(sym.AO); }
"}"  { return new Symbol(sym.AF); }
{h} { return new Symbol(sym.H); }     



//{mot} {return new Symbol(sym.MOT, new String(yytext())); }  // pour interfaces aussi

{ap} { return new Symbol(sym.TYPEAUTRE); }                     // autre_appareil

"definir" { return new Symbol(sym.DEF); }                             // les noms des symboles a remplir comme le mot en fichier .cup
"executer" { return new Symbol(sym.EXE); }
"associer" { return new Symbol(sym.b); }

{type}  {return new Symbol(sym.TYPE, new String(yytext())); } 


"programmer" { return new Symbol(sym.b); }
"message" { return new Symbol(sym.b); }
"pourtout" { return new Symbol(sym.Loop); }
"faire" { return new Symbol(sym.DO); }
"fait" { return new Symbol(sym.Done); }
"si" { return new Symbol(sym.b); }
"alors" { return new Symbol(sym.b); }
"sinon" { return new Symbol(sym.b); }
"fsi" { return new Symbol(sym.b); }
("ouvrir" |"fermer" | "eteindre" | "allumer" | "tamiser") { return new Symbol(sym.Action); }


"etat" { return new Symbol(sym.b); }
"allumer_partiel" { return new Symbol(sym.b); }
"allumer_eco" { return new Symbol(sym.b); }
"ouvrir_partiel" { return new Symbol(sym.b); }
"fermer_partiel" { return new Symbol(sym.b); }
"allume" { return new Symbol(sym.b); }
"eteint" { return new Symbol(sym.b); }
"demi" { return new Symbol(sym.b); }
"eco" { return new Symbol(sym.b); }
"ouvert" { return new Symbol(sym.b); }
"ferme" { return new Symbol(sym.b); }

"telephone" { return new Symbol(sym.b); }

"tablette" { return new Symbol(sym.b); }
"tv" { return new Symbol(sym.b); }
"hif" { return new Symbol(sym.b); }
"cafetiere" { return new Symbol(sym.b); }
"video_proj" { return new Symbol(sym.b); }
"lave_vaisselle" { return new Symbol(sym.b); }
"lave_linge" { return new Symbol(sym.b); }
"seche_linge" { return new Symbol(sym.b); }
"ordinateur" { return new Symbol(sym.b); }
"portail" { return new Symbol(sym.b); }



\n {  }
. {}
