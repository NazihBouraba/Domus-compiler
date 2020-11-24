// Specification JFlex

import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column
%{
	public int getYyLine(){
		return yyline+1;
	}
	public int getYyColumn(){
		return yycolumn+1;
	}
	public String getYyText(){
		return yytext();
	}
%}

date = "(" ([0-9]* | _ ) ","([0-9]*  | _ ) "," ([0-9]*) "," ([0-9]*) "," ([0-9]*) ")"


type_appareil = ("volet"|"eclairage"|"interrupteur"|"fenetre"|"alarme"|"chauffage")

type_interface = ("mobile"|"telephone"|"telecommande"|"tablette"|"interrupteur")

autre_appareil = "autre_appareil("("tv"|"hifi"|"cafeteria")")"

acti = ("ouvrir" |"fermer" | "eteindre" | "allumer" | "tamiser" |"allumer_partiel"|"allumer_éco"|"fermer partiel"|"eco" |"demi")

etats = ("allumé"|"éteint"|"demi"|"éco"|"fermé"|"ouvert")

pourtout = "pourtout" 

faire= "faire"

fait = "fait"

si = "si"

alors = "alors"

sinon = "sinon"

fsi = "fsi"



pdo = "<PROGRAMME_DOMUS>"
pdf = "</PROGRAMME_DOMUS>"
dao = "<DECLARATION_APPAREILS>"
daf = "</DECLARATION_APPAREILS>"
dio = "<DECLARATION_INTERFACES>"
dif = "</DECLARATION_INTERFACES>"
dso = "<DECLARATION_SCENARII>"
dsf = "</DECLARATION_SCENARII>"

nom = (([a-zA-Z] |  [0-9] | "_")+ | ("(" ([a-zA-Z] |  [0-9] | "_") +  ")"))

dco = "<DECLARATION_COMMANDES>"
dcf = "</DECLARATION_COMMANDES>"
dsceno = "<SCENARIO "([a-zA-Z] |  [0-9] | "_")+ ">"
dscenf = "</SCENARIO "([a-zA-Z] |  [0-9] | "_")+ ">"
WHITE_SPACE_CHAR = [\ \n\r\t\f]

h = "//".* 
cote= \"


chaine = \".* \"

%%

{cote} {return new Symbol(sym.COTE);}

{chaine} {return new Symbol(sym.cm);}

{date} {return new Symbol(sym.DATE);}

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

 

{WHITE_SPACE_CHAR}  { }


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
{h} {  }
     

 
"definir" { return new Symbol(sym.DEFINIR, new String(yytext())); }    // definir
"executer_scenario" { return new Symbol(sym.EXECUTER_SCENARIO, new String(yytext())); }   
"associer" { return new Symbol(sym.ASSOCIER, new String(yytext())); }  
"programmer" { return new Symbol(sym.PROGRAMMER, new String(yytext())); }  


{type_appareil} {return new Symbol(sym.APPAREIL_TYPE, new String(yytext())); }    // type d'appareil
{type_interface} {return new Symbol(sym.INTERFACE_TYPE, new String(yytext())); }    // type d'appareil
{autre_appareil} {return new Symbol(sym.AUTRE_APPAREIL, new String(yytext())); }    // autre_appareil
{acti} {return new Symbol(sym.ACTION, new String(yytext())); }    // Action
{etats} {return new Symbol(sym.ETATS, new String(yytext())); }    // etat allumé
"etat" {return new Symbol(sym.ETAT, new String(yytext())); }    // .etat
"message" {return new Symbol(sym.MESSAGE, new String(yytext())); }    // .etat
{si} {return new Symbol(sym.SI, new String(yytext())); }    
{alors} {return new Symbol(sym.ALORS, new String(yytext())); } 
{pourtout} {return new Symbol(sym.POURTOUT, new String(yytext())); } 
{sinon} {return new Symbol(sym.SINON, new String(yytext())); } 
{fsi} {return new Symbol(sym.FSI, new String(yytext())); } 
{fait} {return new Symbol(sym.FAIT, new String(yytext())); } 
{faire} {return new Symbol(sym.FAIRE, new String(yytext())); } 

{nom} {return new Symbol(sym.nom, new String(yytext())); }  // n'import quel mot 

              
\n {  }
. {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => caractÃšre inconnu ! "); } 

