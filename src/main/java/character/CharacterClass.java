package character;

public class CharacterClass {

    //character classes with constructor, getter and setters

    private String cleric;
    private String fighter;
    private String ranger;
    private String rogue;
    private String warlock;
    private String wizard;
    private String monk;
    private String druid;
    private String bard;
    private String paladin;
    private String barbarian;

    public CharacterClass(String cleric, String fighter, String ranger,
                          String rogue, String warlock, String wizard,
                          String monk, String druid, String bard,
                          String paladin, String barbarian) {
        this.cleric = cleric;
        this.fighter = fighter;
        this.ranger = ranger;
        this.rogue = rogue;
        this.warlock = warlock;
        this.wizard = wizard;
        this.monk = monk;
        this.druid = druid;
        this.bard = bard;
        this.paladin = paladin;
        this.barbarian = barbarian;
    }

    public String getCleric() {
        return cleric;
    }

    public void setCleric(String cleric) {
        this.cleric = cleric;
    }

    public String getFighter() {
        return fighter;
    }

    public void setFighter(String fighter) {
        this.fighter = fighter;
    }

    public String getRanger() {
        return ranger;
    }

    public void setRanger(String ranger) {
        this.ranger = ranger;
    }

    public String getRogue() {
        return rogue;
    }

    public void setRogue(String rogue) {
        this.rogue = rogue;
    }

    public String getWarlock() {
        return warlock;
    }

    public void setWarlock(String warlock) {
        this.warlock = warlock;
    }

    public String getWizard() {
        return wizard;
    }

    public void setWizard(String wizard) {
        this.wizard = wizard;
    }

    public String getMonk() {
        return monk;
    }

    public void setMonk(String monk) {
        this.monk = monk;
    }

    public String getDruid() {
        return druid;
    }

    public void setDruid(String druid) {
        this.druid = druid;
    }

    public String getBard() {
        return bard;
    }

    public void setBard(String bard) {
        this.bard = bard;
    }

    public String getPaladin() {
        return paladin;
    }

    public void setPaladin(String paladin) {
        this.paladin = paladin;
    }

    public String getBarbarian() {
        return barbarian;
    }

    public void setBarbarian(String barbarian) {
        this.barbarian = barbarian;
    }
}
