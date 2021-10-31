public class Main {
    public static void main(String[] args) {
        Games rdr = new Games();
        rdr.title = "Red Dead Redemption 2";
        rdr.genre = "action-adventure";
        rdr.price = 55;
        rdr.score = 85;

        Games gta = new Games();
        gta.title = "GTA 5";
        gta.genre = "action-adventure";
        gta.price = 65;
        gta.score = 87;

        Games tes = new Games();
        tes.title = "Skyrim";
        tes.genre = "RPG";
        tes.price = 45;
        tes.score = 90;

        System.out.println("********************");
        rdr.gameTitle();
        rdr.gameGenre();
        rdr.gamePrice();
        rdr.gameScore();

        System.out.println("********************");
        gta.gameTitle();
        gta.gameGenre();
        gta.gamePrice();
        gta.gameScore();

        System.out.println("********************");
        tes.gameTitle();
        tes.gameGenre();
        tes.gamePrice();
        tes.gameScore();

        Games counting = new Games();

        counting.gamePriceDiference(rdr.price, gta.price);
        counting.gamePriceDiference(gta.price, tes.price);

    }



}