/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
       
        // Demonstrate Eager Singleton
        System.out.println("\nEager Singleton Test:");
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        
        System.out.println("Are both EagerSingleton instances equal? " + (eagerSingleton1 == eagerSingleton2));
    }
}

