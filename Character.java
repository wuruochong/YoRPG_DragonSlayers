//Team DragonSlayers -- James Hua, Nick Ng, Ruochong Wu
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG
  =============================================*/

public class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    protected String _name;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
    }

    public String getName(){
	return _name;
    }
    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hitPts > 0;
    }


    /*=============================================
      int attack(Character) -- simulates attack on a Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
      Calls opponent's lowerHP() method to inflict damage. 
      Returns damage dealt.
      =============================================*/
    public int attack( Character opponent ) {

	int damage = (int)( (_strength * _attack) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hitPts = _hitPts - damageInflicted;
    }
    public void normalize(){
	_attack = .4;
	_defense = 40;
    }
    public void specialize(){
	_attack = .75;
	_defense =20;
    }
    public static String about(){
	String lol;
	lol = "Warrior: Good all around choice - strong, dexterous, fun \n \n";
        lol += "Mage: Gandalf and Dumbledore - say no more \n \n";
        lol += "Rogue: Who needs strength or magic when ur stats are op... (dexterity is nice tho) \n \n";
	lol += "Marksman: A standard ranger-type character who wields a mighty longbow but who thinks armor is for sissies. \n \n";
	lol += "Deprived: The only truly manly character in the game - no weapons, no armor, just awesomeness. \n \n";
        lol += "Monster: You can't play them but you get to kill a bunch of these guys while completing your quests. YAY";
	return lol;
	
    }

}//end class Character
