class Two extends One {
    Two(int x) {
        super(x);  // Calling the parameterized constructor of class One
        System.out.println("Constructor of class Two with value: " + x);
    }
}