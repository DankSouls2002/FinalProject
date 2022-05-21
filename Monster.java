import java.util.Arrays;

public class Monster {
    
    private int HP;
    private int mana;
    private int stamina;
    private int max_HP;
    private int max_mana;
    private int max_stamina;

    //write in an array function
    String name;

    public Monster(int mons) {

        switch(mons) {
             //Mons will insitatie base stats based on a randomized integer passed to it 
             //that determines the type of mons it is.

            case 0: 
                this.name = "Blood Wraith";
                this.HP = 20; this.max_HP = 20;
                this.mana = 30; this.max_mana = 30;
                this.stamina = 10; this.max_stamina = 10;
            case 1:
                this.name = "Golum";
                this.HP = 25; this.max_HP = 25;
                this.mana = 5; this.max_mana = 5;
                this.stamina = 20; this.max_stamina = 20;
            case 2:
                this.name = "Hellhound";
                this.HP = 20; this.max_HP = 20;
                this.mana = 10; this.max_mana = 10;
                this.stamina = 25; this.max_stamina = 25;
            case 3:
                this.name = "Skellie";
                this.HP = 15; this.max_HP = 15;
                this.mana = 10; this.max_mana = 10;
                this.stamina = 25; this.max_stamina = 25;
            case 4:
                this.name = "Ragdoll";
                this.HP = 25; this.max_HP = 25;
                this.mana = 20; this.max_mana = 20;
                this.stamina = 25; this.max_stamina = 25;
        }

    }

    //get methods for all mons stats
    public int getHP() {
        return this.HP;
    }

    public int getMaxHP() {
        return this.max_HP;
    }

    public int getMana() {
        return this.mana;
    }

    public int getMaxMana() {
        return this.max_mana;
    }

    public int getStamina() {
        return this.stamina;
    }

    public int getMaxStamina() {
        return this.max_stamina;
    }

    public String getName() {
        return this.name;
    }

    //set methods for values that can change: HP, Mana, Stmina, name
    public void setHP(int inHP) {
        this.HP = inHP;
    }

    public void setMana(int inMana) {
        this.mana = inMana;
    }

    public void setStamina(int inStamina) {
        this.stamina = inStamina;
    }

    public void setName(String mons) {
        this.name = mons;
    }

    public List<String> getStats() {
        //returns the mons stats in an array

       // List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");
//System.out.println(supplierNames.get(1));

        List<String> stats_array = Arrays.asList(
            String.valueOf(this.HP) , String.valueOf(this.max_HP),
            String.valueOf(this.stamina), String.valueOf(this.max_stamina),
            String.valueOf(this.mana), String.valueOf( this.max_mana));

            return stats_array;
        ));

   //idea: add to string method to print the mons stats?

   //idea: Ability class next? Confused how the battle rounds work currently in regareds to the
   //battle actions/choices. Where are we with story?
   //Playtesting? I have expereince with this so I should work on the 
   //playtesting/balancing...  ._.
   //how do you gain new abilities?
   //abilities based on your max stats aka strengths in different areas

   //Build you own spells? Weapons?
   //You have four slots of different types (spell or weapon? and different classes have
   //a different assortment of slots)
   //mons drops scrolls or words of power with different affects you can add to your weapons or spells
   //to customize your own attack
   //make this into a typing game where the words of the spells are generated for difficulty to
   //type and attacking is typing out the spell fast enough

   //Spell character spell damanage = max mana
   // max gem - choose what stat
   // checks what your maxes are and what new abilites you can access
   //change your load out

   //min max stats to unlock
   //math/damage
   //affect

// simple attack
//power attack
// heal
// change gems to choose stat
// 

}
