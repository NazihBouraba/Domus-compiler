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
 for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals("e2")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {  appareil.appliquer(TypeActionAppareil.TAMISER);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals("v1")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.OUVERT)) {  appareil.appliquer(TypeActionAppareil.FERMER_PARTIEL);   }}}
break;
 case 4:      
 for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.AUTRE_APPAREIL_TV)) {   ensAppareil.appliquer(TypeActionAppareil.ALLUMER);  } } this.execScenarioNum(2);  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals("a1")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals("r1")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ECO)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals("cafe")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)) {  appareil.appliquer(TypeActionAppareil.ETEINDRE);   }}} for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals("cafe")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   }}}
break;
 case 2:      
 this.execScenarioNum(1);  for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals("hf"))     appareil.appliquer(TypeActionAppareil.ALLUMER); } 
break;
 case 3:      
 for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.VOLET)) {   ensAppareil.appliquer(TypeActionAppareil.FERMER);  } } for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.ECLAIRAGE)) {   ensAppareil.appliquer(TypeActionAppareil.ETEINDRE);  } }for(CAppareil appareil : this.l_appareils){  if (appareil.estTypeAutreAppareil())  { ensAppareil.appliquer(TypeActionAppareil.ETEINDRE);  } }
break;
 case 0:      
 for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.VOLET)) {   appareil.appliquer(TypeActionAppareil.OUVRIR);  } } for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals("e1"))     appareil.appliquer(TypeActionAppareil.ETEINDRE); }  for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals("cafe"))     appareil.appliquer(TypeActionAppareil.ALLUMER); }  for(CAppareil appareil : this.l_appareils){   if (appareil.getNomAppareil().equals("rad1")){ if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)) {  appareil.appliquer(TypeActionAppareil.ALLUMER);   }}} for(CAppareil appareil : this.l_appareils)   {  if (appareil.getNomAppareil().equals("hf"))     appareil.appliquer(TypeActionAppareil.ALLUMER); } 
break;
 case 1:      
 for(CAppareil appareil : this.l_appareils) {  if (appareil.typeAppareil.equals(TypeAppareil.VOLET)) {   appareil.appliquer(TypeActionAppareil.FERMER);  } }for(CEnsAppareil ensAppareil : this.l_ensembles){  if (ensAppareil.nomEnsAppareil.equals("mon_eclairage_salon")) { ensAppareil.appliquer(TypeActionAppareil.ALLUMER);  } }
break;
default :     
break;
}
}
}
