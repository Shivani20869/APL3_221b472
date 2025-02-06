class Kaurav extends Bharatvanshi {
    private String name;
    public Kaurav(String name) {
        this.name = name;
    }
    @Override
    public void obey() {
        System.out.println(name + " disobeys.");
    }
}
