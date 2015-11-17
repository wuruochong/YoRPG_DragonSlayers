//Team DragonSlayers -- James Hua, Nick Ng, Ruochong Wu
//APCS1 pd10
//HW31 -- Ye Olde Role Playing Game, Unchained
//2015-11-16

/*=============================================
  class Monster -- Represents random incarnations of 
  the adventurer's natural enemy in Ye Olde RPG
  =============================================*/

public class Monster extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // inherited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Monster() {
	super();
	_hitPts = 150;
	_strength = 20 + (int)( Math.random() * 45 ); // [20,65)
	_defense = 20;
	_attack = 1;
    }
    
    public String about(){
	return "Monster: You can't play them but you get to kill a bunch of these guys while completing your quests. YAY!";
    }
    public void specialize(){
	_attack = .75;
	_defense = 20;
    }
    public void normalize(){
	_strength = 20 + (int)( Math.random() * 45 ); // [20,65)
	_defense = 20;
    }
	

}//end class Monster
