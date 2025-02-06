/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav("Arjun");
        Pandav bheem = new Pandav("Bheem");
        
        
        Kaurav duryodhan = new Kaurav("Duryodhan");
        Vikarn vikarn = new Vikarn();


        arjun.fight();  
        arjun.obey();   
        arjun.kind();   

        bheem.fight();  
        bheem.obey();   
        bheem.kind();   

        
        duryodhan.fight(); 
        duryodhan.obey();  
        vikarn.fight();    
        vikarn.obey();     
        vikarn.kind();     
    }
}
