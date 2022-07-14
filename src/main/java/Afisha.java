public class Afisha { //менеджер афиши
    private String[] movies = new String[0];
    private int limit;

    public Afisha() {
        limit = 10;

    }

    public Afisha(int limit) {
        this.limit = limit;

    }

    public void add(String film) {  //добавление нового фильма
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public String[] findAll() { //Вывод всех фильмов в порядке добавления

        return movies;

    }

    public String[] findLast() { //Вывод максимум лимит последних добавленных фильмов в обратном от добавления порядке
        int limit = 10;
        String[] ans;
        if (limit < movies.length) {
            ans = new String[limit];

        } else {
            ans = new String[movies.length];

        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - i - 1];
        }
        return ans;
    }
}
