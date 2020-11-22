// Specification JFlex

import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column

date = "(" ([0-9]* | _ ) ","([0-9]*  | _ ) "," ([0-9]*) "," ([0-9]*) "," ([0-9]*) ")"

acti = "."("ouvrir" |"fermer" | "eteindre" | "allumer" | "tamiser" |"allumer_partiel"|"allumer_éco"|"fermer partiel")
pdo = "<PROGRAMME_DOMUS>"
pdf = "</PROGRAMME_DOMUS>"
dao = "<DECLARATION_APPAREILS>"
daf = "</DECLARATION_APPAREILS>"
dio = "<DECLARATION_INTERFACES>"
dif = "</DECLARATION_INTERFACES>"
dso = "<DECLARATION_SCENARII>"
dsf = "</DECLARATION_SCENARII>"
nom = (([a-zA-Z] |  [0-9] | "_")+ | ("(" ([a-zA-Z] |  [0-9] | "_") +  ")"))
appareil = ([a-zA-Z] |  [0-9] | "_")+ "(" ([a-zA-Z] |  [0-9] | "_") +  ")"
dco = "<DECLARATION_COMMANDES>"
dcf = "</DECLARATION_COMMANDES>"
dsceno = "<SCENARIO "(([a-zA-Z])+([0-9])*)">"
dscenf = "</SCENARIO "(([a-zA-Z])+([0-9])*)">"

h = \"      // le "

%%

{pdo}  { return new Symbol(sym.PDO); }            //PROGRAMME DOMUS
{pdf}  { return new Symbol(sym.PDF); }
   
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


"=="  { return new Symbol(sym.DEGAL); }
"="  { return new Symbol(sym.EGAL); }
":"  { return new Symbol(sym.DP); }
";"  { return new Symbol(sym.PV); }
"."  { return new Symbol(sym.PT); }
","  { return new Symbol(sym.VG); }
"("  { return new Symbol(sym.PO); }
")"  { return new Symbol(sym.PF); }
"{"  { return new Symbol(sym.AO); }
"}"  { return new Symbol(sym.AF); }
{h} { return new Symbol(sym.H); }     

".etat" { return new Symbol(sym.ETAT); }    

{nom} {return new Symbol(sym.nom, new String(yytext())); }  // n'import quel mot 
{appareil} {return new Symbol(sym.APPAREIL, new String(yytext())); }    // autre_appareil
{acti} {return new Symbol(sym.ACTION, new String(yytext())); }    // autre_appareil


                  




\n {  }
. {}
