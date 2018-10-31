package practice.polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats a lotta people.";
    }
}

class Arrival extends Movie {
    public Arrival() {
        super("Arrival");
    }

    @Override
    public String plot() {
        return "Aliens teach people a language.";
    }
}

class Castlevania extends Movie {
    public Castlevania() {
        super("Castlevania");
    }

    @Override
    public String plot() {
        return "Dracula wants revenge on all humans because his wife was murdered.";
    }
}

class Forgot extends Movie {
    public Forgot() {
        super("Forgot");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie: " + i + " " + movie.getName() + "\n" +
                    "Plot: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new Arrival();

            case 3:
                return new Castlevania();

            case 4:
                return new Forgot();
        }

        return null;
    }
}
