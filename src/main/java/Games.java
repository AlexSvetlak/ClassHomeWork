public class Games {
    public String title, genre;
    public int price, score;


    public void gameTitle(){
        System.out.println("Название игры: " + title);
    }

    public void gamePrice(){
        System.out.println("Стоимость: " + price);
    }

    public void gameGenre(){
        System.out.println("Жанр: " + genre);
    }

    public void gameScore(){
        System.out.println("Оценка пользователей: " + score);
    }

    public void gamePriceDiference(int a, int b){
        int c;
        c = a - b;
    System.out.println("Разница в цене: " + c + "баксов");

    }


}
