//Team DragonSlayers -- James Hua, Nick Ng, Ruochong Wu
//APCS1 pd10
//HW31 -- Ye Olde Role Playing Game, Unchained
//2015-11-16

/*=============================================
  class Marksman -- protagonist of Ye Olde RPG
  =============================================*/
 
public class Marksman extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Marksman() {
	_hitPts = 100;
	_strength = 110;
	_defense = 25;
	_attack = .5;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Marksman( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    //prepare a Marksman for a special attack
    public void specialize() {
	_attack = .8;
	_defense = 15;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .5;
	_defense = 25;
    }

    public String about(){
	return "Marksman: A standard ranger-type character who wields a mighty longbow but who thinks armor is for the weak.";
    }
}//end class Marksman
