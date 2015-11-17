//Team DragonSlayers -- James Hua, Nick Ng, Ruochong Wu
//APCS1 pd10
//HW31 -- Ye Olde Role Playing Game, Unchained
//2015-11-16

public class Mage extends Character{

    private String _name = "Gandalf";

    public Mage() {
	_hitPts = 110;
	_strength = 90;
	_defense = 50;
	_attack = .4;
    }

    public Mage(String name){
	this();
	_name = name;
    }

    public String getName() { return _name;}
    
    public void specialize(){
	_attack = .6;
	_defense = 30;
    }

    public void normalize(){
	_attack = .4;
	_defense = 50;
    }

    public String about(){
	return "Mage: Gandalf and Dumbledore - say no more";
    }
}
