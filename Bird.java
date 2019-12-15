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
public abstract class Bird extends Animal {
    private String kind;

    public Bird(String kind, String app) {
        super(kind, app);
        this.setKind(kind);
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
        System.out.println("Eats Seeds And Insects");
    }
    
    @Override
    public void move()
    {
        System.out.println("Flies Through The Air");
    }
    
    
}
