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
public class AmericanRobin extends Bird
{
    public AmericanRobin()
    {
        super("AmericanRobin","Red Breast");
        
    }
}


class DomesticCanary extends Bird
{
    public DomesticCanary()
    {
        super("DomesticCanary","Yellow,Orange,Black,Brown,White,Red");
    }
}

class RainbowTrout  extends Fish
{
    public RainbowTrout()
    {
        super("RainbowTrout","Bands of Multiclored Stripes running nearly the Whole Length of its Body");
    }
}

class SockeyeSalmon extends Fish
{
    public SockeyeSalmon()
    {
        super("SockeyeSalmon","Bright Red With a green Head");
    }
}