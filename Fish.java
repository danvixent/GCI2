/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4.Excercises;

/**
 *
 * @author DANIEL
 */
public abstract class Fish extends Animal {
    private String kind;
    private String appearance;

    public Fish(String kind, String app) {
        super(kind, app);
        this.setKind(kind);
        setAppearance(app);
    }

    /**
     * @return the appearance
     */
    public String getAppearance() {
        return appearance;
    }

    /**
     * @param appearance the appearance to set
     */
    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    /**
     * @return the kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind the kind to set
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public void eat()
    {
        System.out.println("Eats Krill, Algae and Insects");
    }
    
    @Override
    public void move()
    {
        System.out.println("Swims through the Water");
    }
}
