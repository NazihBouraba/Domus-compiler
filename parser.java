
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java.util.HashMap;
import java_cup.runtime.*;
import java.lang.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\054\000\002\002\007\000\002\002\004\000\002\003" +
    "\005\000\002\004\006\000\002\004\006\000\002\004\012" +
    "\000\002\004\002\000\002\005\005\000\002\006\006\000" +
    "\002\006\002\000\002\007\014\000\002\007\006\000\002" +
    "\007\006\000\002\007\017\000\002\007\005\000\002\007" +
    "\002\000\002\013\005\000\002\017\006\000\002\017\002" +
    "\000\002\014\005\000\002\020\010\000\002\020\012\000" +
    "\002\020\012\000\002\020\010\000\002\020\002\000\002" +
    "\015\005\000\002\015\003\000\002\021\004\000\002\021" +
    "\003\000\002\010\005\000\002\010\003\000\002\011\003" +
    "\000\002\011\003\000\002\012\004\000\002\012\007\000" +
    "\002\012\006\000\002\012\002\000\002\022\006\000\002" +
    "\023\005\000\002\023\005\000\002\023\003\000\002\023" +
    "\003\000\002\023\005\000\002\023\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\004\006\004\001\002\000\004\011\010\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\013\036\001\002\000\012\012\ufffb\043\011\044" +
    "\014\045\012\001\002\000\004\025\015\001\002\000\004" +
    "\025\024\001\002\000\004\012\023\001\002\000\004\025" +
    "\015\001\002\000\010\023\021\024\uffe3\030\uffe3\001\002" +
    "\000\004\024\017\001\002\000\012\012\ufffb\043\011\044" +
    "\014\045\012\001\002\000\004\012\ufffd\001\002\000\004" +
    "\025\015\001\002\000\006\024\uffe4\030\uffe4\001\002\000" +
    "\004\013\uffff\001\002\000\004\033\025\001\002\000\004" +
    "\027\026\001\002\000\004\025\015\001\002\000\004\030" +
    "\030\001\002\000\004\024\031\001\002\000\012\012\ufffb" +
    "\043\011\044\014\045\012\001\002\000\004\012\ufffc\001" +
    "\002\000\004\024\034\001\002\000\012\012\ufffb\043\011" +
    "\044\014\045\012\001\002\000\004\012\ufffe\001\002\000" +
    "\006\014\uffef\046\076\001\002\000\004\017\041\001\002" +
    "\000\004\007\075\001\002\000\010\020\uffe9\047\042\050" +
    "\044\001\002\000\004\025\063\001\002\000\004\020\062" +
    "\001\002\000\004\025\045\001\002\000\004\033\046\001" +
    "\002\000\006\005\050\027\047\001\002\000\004\005\054" +
    "\001\002\000\004\024\051\001\002\000\010\020\uffe9\047" +
    "\042\050\044\001\002\000\004\020\uffea\001\002\000\004" +
    "\030\057\001\002\000\006\023\055\030\uffe7\001\002\000" +
    "\004\005\054\001\002\000\004\030\uffe8\001\002\000\004" +
    "\024\060\001\002\000\010\020\uffe9\047\042\050\044\001" +
    "\002\000\004\020\uffeb\001\002\000\004\007\uffee\001\002" +
    "\000\004\033\064\001\002\000\006\025\065\027\066\001" +
    "\002\000\004\024\073\001\002\000\004\025\015\001\002" +
    "\000\004\030\070\001\002\000\004\024\071\001\002\000" +
    "\010\020\uffe9\047\042\050\044\001\002\000\004\020\uffec" +
    "\001\002\000\010\020\uffe9\047\042\050\044\001\002\000" +
    "\004\020\uffed\001\002\000\004\002\001\001\002\000\004" +
    "\025\015\001\002\000\004\014\100\001\002\000\004\017" +
    "\ufff1\001\002\000\004\024\102\001\002\000\006\014\uffef" +
    "\046\076\001\002\000\004\014\ufff0\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\004\002\004\001\001\000\004\003\006\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\013\036" +
    "\001\001\000\004\004\012\001\001\000\004\010\032\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\015" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\017\001\001\000\002\001\001\000\004\010\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\026\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\031\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\034\001\001\000\002" +
    "\001\001\000\004\017\076\001\001\000\004\014\037\001" +
    "\001\000\002\001\001\000\004\020\042\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\052\001\001\000\002" +
    "\001\001\000\004\020\051\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\055\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\020\060\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\066\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\020\071" +
    "\001\001\000\002\001\001\000\004\020\073\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\100\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\017\102\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public static void main(String args[]) throws Exception {
		new parser(new Yylex(System.in)).parse();
	}

	public void syntax_error(Symbol cur_token) { 
		// n'interrompt pas la compil... 
		// on est par defaut dans l'etat error qui permet ensuite la recup
		// par défaut : report_error("syntax error", null);
		report_error("Syntaxe incorrecte <"+tokenToString(cur_token)+">", null);        
	}

	public void report_error(String message, Object info) {   
		// n'interrompt pas la compil
		if (info == null) System.err.println("Mon erreur <"+ ptext()+ "> ligne "+ pline() + ", colonne " + pcolumn() + " : " + message);
		else System.err.println("Mon erreur <"+ptext()+ "> ligne "+ pline() + ", colonne " + pcolumn() + " : " +message+" : "+info);
		System.err.println("-> mais on continue l'analyse... ");
	}

	public void unrecovered_syntax_error(Symbol cur_token) {
    	// par defaut : report_fatal_error("Couldn't repair and continue parse", null);
		// on n'a pas reussi a faire de la recup
		report_fatal_error("Recuperation impossible <"+tokenToString(cur_token)+">", null);   // interrompt la compil     
	}

	public void report_fatal_error(String message, Object info) {  
		// qd cette fct est appelee, message vaut par defaut "Couldn't repair and continue parse"
		String m = "Mon erreur fatale <"+ ptext()+ "> ligne " + pline() + ", colonne " + pcolumn() + " : " + message;
		if (info == null) System.err.println(m);
		else System.err.println(m+" : "+info);
		System.err.println("-> arrêt de l'analyse...");
		done_parsing(); // interrompt la compil
  	}

	public int pline(){
		return ((Yylex)getScanner()).getYyLine();
	}
	public int pcolumn(){
		return ((Yylex)getScanner()).getYyColumn();
	}
	public String ptext(){
		return ((Yylex)getScanner()).getYyText();
	}

	public String tokenToString (Symbol token) {
// qqs exemples pour voir...
   //  switch (token.sym) {
//	case sym.SI : return "SI"; 
//	case sym.CHAINE : return "CHAINE "+token.value;  
//	case sym.ENTIER : return "ENTIER "+token.value;  
	//  ... A compléter !!
	return "Token imprévu ou error";
	//}
}





/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {







  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= PDO da di dc PDF 
            {
              Object RESULT =null;
		System.out.println("analyse terminée"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // da ::= DAO dad DAF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("da",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // dad ::= APPAREIL_TYPE MOT PT dad 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // dad ::= AUTRE_APPAREIL MOT PT dad 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // dad ::= DEFINIR nom EGAL AO MOT AF PT dad 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // dad ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // ds ::= DSO dsd DSF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ds",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // dsd ::= DSCO scenario DSCF dsd 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dsd",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // dsd ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dsd",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // scenario ::= nom nom DP x nom mesgouact PV nom PV scenario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("scenario",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // scenario ::= nom ACTION PV scenario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("scenario",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // scenario ::= nom nom PV scenario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("scenario",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // scenario ::= nom PO nom ETAT DEGAL nom PF nom mesgouact PV sinon PV scenario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("scenario",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // scenario ::= msgs PV scenario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("scenario",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // scenario ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("scenario",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // di ::= DIO did DIF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("di",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // did ::= INTERFACE_TYPE MOT PT did 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("did",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // did ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("did",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // dc ::= DCO dcd DCF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dc",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // dcd ::= ASSOCIER nom EGAL nom PT dcd 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dcd",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // dcd ::= ASSOCIER nom EGAL AO MOT AF PT dcd 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dcd",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // dcd ::= PROGRAMMER nom EGAL AO dat AF PT dcd 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dcd",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // dcd ::= PROGRAMMER nom EGAL DATE PT dcd 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dcd",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // dcd ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dcd",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // dat ::= DATE VG dat 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dat",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // dat ::= DATE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("dat",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // mesgouact ::= nom ACTION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mesgouact",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // mesgouact ::= msgs 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mesgouact",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // MOT ::= nom VG MOT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MOT",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // MOT ::= nom 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MOT",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // x ::= nom 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("x",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // x ::= APPAREIL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("x",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // sinon ::= nom scenario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sinon",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // sinon ::= nom nom ACTION PV nom 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sinon",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // sinon ::= nom msgs PV nom 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sinon",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // sinon ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sinon",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // msgs ::= nom PO msg PF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("msgs",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // msg ::= nom VG msg 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("msg",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // msg ::= cm VG msg 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("msg",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // msg ::= nom 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("msg",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // msg ::= cm 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("msg",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // msg ::= nom ETAT msg 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("msg",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // msg ::= nom ETAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("msg",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
