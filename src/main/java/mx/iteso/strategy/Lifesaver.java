package mx.iteso.strategy;

public abstract class Lifesaver {
    public Lifesaver() {}

    public String type;
    public String inflating() { return "I'm inflating!"; }
    public String deflating() { return "I'm deflating!"; }
    public String notInflating() { return "I can't inflate!"; }
    public String notDeflating() { return "I can't deflate!"; }
    public String floating() { return "I'm floating!"; }
    public String display() { return "I'm a " + type; }
}
