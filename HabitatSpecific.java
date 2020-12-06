import java.util.ArrayList;
public class HabitatSpecific extends Habitat {
public HabitatSpecific(ArrayList<CAppareil> lapp, ArrayList<CEnsAppareil> lens, ArrayList<CScenario> lscen, ArrayList<CInterface> lint, ArrayList<CProgrammation> lprog)
{
super(lapp,lens,lscen,lint,lprog);
}
public void execScenarioNum(int num)
{
 System.out.println( "Execution du scenario "+this.l_scenarios.get(num).getNomScenario()+"... ");
 switch(num) {
 case 5:      
 for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"e1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   } 
 else {  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"e1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.DEMI)) {  appareil.appliquer(TypeActionAppareil.ETEINDRE);   }}}} }} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"e2\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {  appareil.appliquer(TypeActionAppareil.TAMISER);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"v1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.OUVERT)) {  appareil.appliquer(TypeActionAppareil.FERMER_PARTIEL);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"v1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.FERME)) {  appareil.appliquer(TypeActionAppareil.OUVRIR_PARTIEL);     System.out.println(\" alors \") ;  } 
 else {  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"v1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.DEMI)) {  appareil.appliquer(TypeActionAppareil.FERMER);   } 
 else {  for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals(\"v1\"))     appareil.appliquer(TypeActionAppareil.OUVRIR); }   System.out.println(\" sinon \") ;  } }}} }}
break;
 case 4:      
for(CEnsAppareil ensAppareil : this.l_ensembles){  if (ensAppareil.nomEnsAppareil.equals(elec_salon)) {   System.out.println(\"Etat de \",e,\" = \",e.ETAT) ;   } } for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.AUTRE_APPAREIL_TV)) {   appareil.appliquer(TypeActionAppareil.ALLUMER);  } }
 this.execScenarioNum(2);
   for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"a1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"a1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.DEMI)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   } 
 else {  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"a1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {  appareil.appliquer(TypeActionAppareil.ETEINDRE);   } 
 else {  for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals(\"a2\"))     appareil.appliquer(TypeActionAppareil.ALLUMER); } } }}} }} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"r1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ECO)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"r1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER_ECO);   } 
 else {  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"r1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {  appareil.appliquer(TypeActionAppareil.ETEINDRE);   } 
 else {   System.out.println(\" bip !\") ;  } }}} }} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"fen\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.OUVERT)) {   System.out.println(\"fenêtre ouverte !\") ;  }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"cafe\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {  appareil.appliquer(TypeActionAppareil.ETEINDRE);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"cafe\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   }}}
break;
 case 2:      

 this.execScenarioNum(1);
   for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals(\"hf\"))     appareil.appliquer(TypeActionAppareil.ALLUMER); } 
break;
 case 3:      
 for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.VOLET)) {   appareil.appliquer(TypeActionAppareil.FERMER);  } } for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.ECLAIRAGE)) {   appareil.appliquer(TypeActionAppareil.ETEINDRE);  } } for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"fen\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.FERME)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   } 
 else {   System.out.println( \"Attention : la fenêtre \",fen,\" est ouverte !\") ;  } }}for(CAppareil appareil : this.l_appareils){  if (appareil.estTypeAutreAppareil())  { appareil.appliquer(TypeActionAppareil.ETEINDRE);  } }
break;
 case 0:      
 for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.VOLET)) {   appareil.appliquer(TypeActionAppareil.OUVRIR);  for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.VOLET)) {   appareil.appliquer(TypeActionAppareil.OUVRIR);  } } } } for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals(\"e1\"))     appareil.appliquer(TypeActionAppareil.ETEINDRE); }  for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals(\"cafe\"))     appareil.appliquer(TypeActionAppareil.ALLUMER); }  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"rad1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals(\"rad1\")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   }}}}}} for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals(\"hf\"))     appareil.appliquer(TypeActionAppareil.ALLUMER); } 
break;
 case 1:      
 for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.VOLET)) {   appareil.appliquer(TypeActionAppareil.FERMER);  } }for(CEnsAppareil ensAppareil : this.l_ensembles){  if (ensAppareil.nomEnsAppareil.equals(mon_eclairage_salon)) { appareil.appliquer(TypeActionAppareil.ALLUMER);  } }
break;
default :     
}
}
}
