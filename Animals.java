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
public class Animals 
{
    public static void main(String[] args)
    {
        Animal[] animals;
        animals = new Animal[] {new AmericanRobin(),new RainbowTrout(),new DomesticCanary(),new SockeyeSalmon(),new RainbowTrout(),new AmericanRobin()};
        for(int i=0;i<animals.length;i++)
        {
            System.out.println();
            System.out.println(animals[i]);
            animals[i].eat();
            animals[i].move();
            System.out.println("<---->");
        }
        
    }
}
