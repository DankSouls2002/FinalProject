import java.util.Arrays;
import java.util.List;

public class Abilities {
    
//can use a gem 7 times 40 + 30
//final max would be... 30 + 70 = 100 sooo 100, 30, 30 or 30,100,30 or 30, 30, 1000
// or mid classes: 70, 60, 30 or 60, 70, 30 or 30, 60, 70 or  30 30
//maxallstat = 160
/*

40 = 1, 50 = 2, 60 = 3, 70 = 4, 80 = 5
*/
/*
Class = most used gem (1 2 4 ) (1, 3, 3) (1, 3, 4) most ideal for mixed class

/*
public void movename(character player, character mons) {
    //description
    List<Integer> Min_stats = Arrays.asList(HP,MN,ST);
    int cost = #; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?
}
*/


/*



HP, MN, ST



/*
Warrior (ST) = 30, 30, 100 or at least 80 in HP
[30, 30, 30], [30, 30, 40], [30, 30, 50], [30, 30, 60], [30, 30, 70], 

Assasin (ST + MN) = 30, 60, 70 or 30, 70, 60
[30, 40, 40], [30, 50, 40] or [30, 40, 50], [30, 60, 50] or [30, 50, 60], [30, 60, 70] or [30, 70, 60]
first one is power level two automatically

Mage (MN) = 30, 30, 100 
[30, 40, 30], [30, 50, 30], [30, 60, 30], [30, 70, 30], [30, 80, 30],


Necromancer (MN + HP) = 70, 60, 30 or 60, 70, 30
[40, 40, 30], [40, 50, 30] or [50, 40, 30], [50, 60, 20] or [60, 50, 30], [70, 60, 30] or [60, 70, 30]
first one is power level two automatically

Cleric (HP) = 100, 30, 30
[30, 30, 30], [40, 30, 30], [50, 30, 30], [60, 30, 30], [70, 30, 30]

Paladin (HP + ST) = 70, 30, 60 or 60, 30, 70
[40, 30, 40], [50, 30, 40] or [40, 30, 50], [60, 30, 50] or [50, 30, 60], [60, 30, 70] or [70, 30, 60]
first one is power level two automatically


*/

public void movename(character player, Monster mons) {
    //description
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 30, 30 );
    int cost = #; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

/* **********************************************************************
                       WARRIOR MOVESET
                (Stamina Based)
            Unlocks 1 move every gem used in health
*************************************************************************/

public void Quick_Slash(character player, Monster mons) {
    String descript = "A fast swing of a plain bastard sword.";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30,30,30);
    int cost = 1; //1-5 cost equivalent to power
    String pow_type = "ST"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Mountain_Split(character player, Monster mons) {
    String descript = "A heavy slice of a huge broadsword that could cut mountains like cake.";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 30, 40);
    int cost = 2; //1-5 cost equivalent to power
    String pow_type = "ST"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Sonic_Whip(character player, Monster mons) {
    String descript = "A whiip so quick your foe bleeds faster than the sound of it's crack";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 30, 50);
    int cost = 3; //1-5 cost equivalent to power
    String pow_type = "ST"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Rapiers_Dance(character player, Monster mons) {
    String descript = "Two swords become one in your hands, slicing your foe to ribbons";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 30, 60);
    int cost = 4; //1-5 cost equivalent to power
    String pow_type = "ST"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Mjornirs_Wrath(character player, Monster mons) {
    String descript = "A mighty hammer that strikes fear into it's foes";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 30, 70);
    int cost = 5; //1-5 cost equivalent to power
    String pow_type = "ST"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

/* **********************************************************************
                       Mage MOVESET
                (Mana Based)
            Unlocks 1 move every gem used in mana
*************************************************************************/

public void Firebolt(character player, Monster mons) {
    String descript = "From your hands releases a torrent of fire.";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30,30,30);
    int cost = 1; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Sun_Razor (character player, Monster mons) {
    String descript = "Unleash the heat of the sun in a powerful targeted attack";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 40, 30);
    int cost = 2; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Meteror_Strike(character player, Monster mons) {
    String descript = "You call down the fury of the sky to rain down in fire upon your enemy.";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 50, 30);
    int cost = 3; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP" //type of damage?

}

public void Lightning_Touch(character player, Monster mons) {
    String descript = "Lighning springs from your fingertips to electricute your foe like they dropped a toaster in their bathtub";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 60, 30);
    int cost = 4; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Ice_Cruxifixition(character player, Monster mons) {
    String descript = "Summon a volley of icicles to pierce through you foe at every angle";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 70, 30);
    int cost = 5; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

/* **********************************************************************
                       CLERIC MOVESET
                (HP Based)
            Unlocks 1 move every gem used in HP
*************************************************************************/

public void Blessed_Prayers(character player, Monster mons) {
    String descript = "With sacred words, heal thyself";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30,30,30);
    int cost = 1; //1-5 cost equivalent to power
    String pow_type = "HP"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Purify(character player, Monster mons) {
    String descript = "Bless this battleground, healing theyself and damaging dark forces";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(40, 30, 30);
    int cost = 2; //1-5 cost equivalent to power
    String pow_type = "HP"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Sacrifice(character player, Monster mons) {
    String descript = "Offer a piece of your foe to the gods to recieve their favor in healing";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(50, 30, 30);
    int cost = 3; //1-5 cost equivalent to power
    String pow_type = "HP"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Cleric4(character player, Monster mons) {
    //description
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(60, 30, 30);
    int cost = 4; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

public void Illuminate(character player, Monster mons) {
    String descript = "Harness blessed light against your foe, blinding them in a ray of holiness";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(70, 30, 30);
    int cost = 5; //1-5 cost equivalent to power
    String pow_type = "HP" //what stat is used as it's multiplier
    String dam_type = "HP" //type of damage?

}

/* **********************************************************************
                       PALADIN MOVESET
                (HP + ST Based)
            Unlocks 1 move every 2 gems used in HP/St split
*************************************************************************/

public void Darkwood_Bow(character player, Monster mons) {
    String descript = "Fire a poisoned tip arrow from a bow made of the twisted limbs of the darkwood forest ";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList([40, 30, 40);
    int cost = 2; //1-5 cost equivalent to power
    String pow_type = "ST"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Paladin3(character player, Monster mons) {
    //description
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(50, 30, 40] or [40, 30, 50]);
    int cost = 3; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

public void Paladin4(character player, Monster mons) {
    //description
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(60, 30, 50] or [50, 30, 60);
    int cost = 4; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

public void Paladin5(character player, Monster mons) {
    //description
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(60, 30, 70] or [70, 30, 60);
    int cost = 5; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

/* **********************************************************************
                       NECROMANCER MOVESET
                (HP + MN Based)
            Unlocks 1 move every 2 gems used in HP/MN split
*************************************************************************/

public void Soul_Summon(character player, Monster mons) {
    String descript = "Summon the souls  of your undead army to suck away the life of your foe";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(40, 40, 30);
    int cost = 2; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP + MN"; //type of damage?

}

public void Curse(character player, Monster mons) {
    String descript = "Use mana to steal health";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(40, 50, 30] or [50, 40, 30]);
    int cost = 3; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Dark_Burial(character player, Monster mons) {
    String descript = "Summon the earth around to bury your foe 6 feet under";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(50, 60, 30] or [60, 50, 30);
    int cost = 4; //1-5 cost equivalent to power
    String pow_type = "MN"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

public void Afterlife(character player, Monster mons) {
    String descript = "Swap HP with your opponent and heal yourself in the process";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(70, 60, 30] or [60, 70, 30);
    int cost = 5; //1-5 cost equivalent to power
    String pow_type = "HP"; //what stat is used as it's multiplier
    String dam_type = "HP"; //type of damage?

}

/* **********************************************************************
                       ASSASSIN MOVESET
                (ST + MN Based)
            Unlocks 1 move every 2 gems used in ST/MNsplit
*************************************************************************/

public void Double_Strike(character player, Monster mons) {
    String descript = "strike twice in a row on your next move for the cost of one";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList([30, 40, 40);
    int cost = 2; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

public void Evade(character player, Monster mons) {
    String descript = "Take a magically-enhanced evasive stance, halving damage for this round";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 50, 40] or [30, 50, 50]);
    int cost = 3; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

public void Backstab(character player, Monster mons) {
    String descript = "Appear behind the enemy and stick them in the spine, dealing double damage";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 60, 50] or [30, 60, 60);
    int cost = 4; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

public void Shadow Clones(character player, Monster mons) {
    String descript = "Summon five shadow clones that repeat your next action, multiplying its effects fivefold";
    boolean active = false;
    List<Integer> Min_stats = Arrays.asList(30, 60, 70] or [30, 70, 60);
    int cost = 5; //1-5 cost equivalent to power
    String pow_type = stat //what stat is used as it's multiplier
    String dam_type = stat //type of damage?

}

public Integer calc_damage(int max_stat, int power){
    //include a randomly generated int percentage that times the normal damage by .85-110% for
    //a chance of accuracy or critical damage
    int damage = (1 + max_stat/10) * power; //*hit_chance


    return damage;
}

public double calc_defense(int stat_lvl){
    double defense = .1 + ((stat_lvl - 90)/10 *.05);

    return defense;
}


}
