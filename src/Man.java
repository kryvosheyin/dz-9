public class Man extends Person {
    public Man(String firstName, String lastNAme, int age, boolean married) {
        super(firstName, lastNAme, age, married);
    }

    @Override
    public boolean isRetired() {
        if (this.age >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public void listenMusic() {
        System.out.println("🎵🎶♬");
    }

    @Override
    public void printFavoriteThings() {
        System.out.println("As a Man I like beer, squash and bikes");
    }
}
