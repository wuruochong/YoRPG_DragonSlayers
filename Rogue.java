//Team DragonSlayers -- James Hua, Nick Ng, Ruochong Wu
//APCS1 pd10
//HW31 -- Ye Olde Role Playing Game, Unchained
//2015-11-16

public class Rogue extends Character {
    private String _name = "J. Doe";

    public Rogue(){
	_hitPts = 100;
	_strength = 110;
	_defense = 30;
	_attack = .6;
    }


    public Rogue(String name){
	this();
	_name = name;
    }

    public String getName() {return _name;}

    public void specialize(){
	_attack = .85;
	_defense = 10;
    }

    public void normalize(){
	_attack = .6;
	_defense = 30;
    }

    public String about(){
	return "Rogue: Who needs strength or magic when ur stats are op... (dexterity is nice tho)";
    }
}
