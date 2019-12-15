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
public abstract class Animal implements Countable
{
    private String kind;
    private String appearance;
    
    public Animal(String kind,String app)
    {
        this.kind=kind;
        appearance=app;
    }
    
    public abstract void eat();
    public abstract void move();
    
    @Override
    public String toString()
    {
        return "The Species Is: "+kind+" \nIts Appearance As Follows: "+appearance ;
    }
    
    @Override
    public String getID()
    {
        return kind;
    }
    
    /**
     * Abstract Classes Allowed To Have Abstract and normal Methods
     */
}