class Pandav extends Bharatvanshi {
    private String name;
    public Pandav(String name) {
        this.name = name;
    }
    @Override
    public void obey() {
        System.out.println(name + " is obedient.");
    }
    public void kind() {
        System.out.println(name + " is kind.");
    }
}
