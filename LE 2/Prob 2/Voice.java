/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Voice {
    
    void prepareVoice() {
        Animal[] animals = new Animal[5];
        
        
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        
        hear(animals);
    }

    
    void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice();  
        }
    }
}
