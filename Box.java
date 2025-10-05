 
package com.mycompany.volume;

 
public class Box {
    public double length;
    public double width;
    public double height;
    public double volume;
    
    public Box(double length,double width,double height){
        this.height=height;
        this.length=length;
        this.width=width;
    }
    public double getVolume(){
        volume = length*width*height;
        System.out.print("The volume");
        return volume;
    }
    
}
