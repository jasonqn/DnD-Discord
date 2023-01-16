package character;

public class CharacterRace {

    //character races allows PC's to select their character
    private String human;
    private String elf;
    private String halfElf;
    private String dwarf;
    private String gnome;
    private String orc;
    private String halfOrc;
    private String drow;
    private String thiefling;

    //constructor, getter and setters
    public CharacterRace(String human, String elf, String halfElf,
                         String dwarf, String gnome, String orc,
                         String halfOrc, String drow, String thiefling) {

        this.human = human;
        this.elf = elf;
        this.halfElf = halfElf;
        this.dwarf = dwarf;
        this.gnome = gnome;
        this.orc = orc;
        this.halfOrc = halfOrc;
        this.drow = drow;
        this.thiefling = thiefling;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public String getElf() {
        return elf;
    }

    public void setElf(String elf) {
        this.elf = elf;
    }

    public String getHalfElf() {
        return halfElf;
    }

    public void setHalfElf(String halfElf) {
        this.halfElf = halfElf;
    }

    public String getDwarf() {
        return dwarf;
    }

    public void setDwarf(String dwarf) {
        this.dwarf = dwarf;
    }

    public String getGnome() {
        return gnome;
    }

    public void setGnome(String gnome) {
        this.gnome = gnome;
    }

    public String getOrc() {
        return orc;
    }

    public void setOrc(String orc) {
        this.orc = orc;
    }

    public String getHalfOrc() {
        return halfOrc;
    }

    public void setHalfOrc(String halfOrc) {
        this.halfOrc = halfOrc;
    }

    public String getDrow() {
        return drow;
    }

    public void setDrow(String drow) {
        this.drow = drow;
    }

    public String getThiefling() {
        return thiefling;
    }

    public void setThiefling(String thiefling) {
        this.thiefling = thiefling;
    }
}
