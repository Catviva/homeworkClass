public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author LauraBarnell = new Author("Laura", "Barnell");
        Author PauloCoelho = new Author("Paulo", "Coelho");

        Book TheVersionsOfUs = new Book("The Version of us", LauraBarnell, 2017);
        Book TheAlchemist = new Book("The Alchemist", PauloCoelho, 1988);

        System.out.println(TheVersionsOfUs.getTitle() + ", " + LauraBarnell.getAuthorName() + " " + LauraBarnell.getAuthorSurname() + ", " + TheVersionsOfUs.getPublishingYear());
        System.out.println(TheAlchemist.getTitle() + ", " + PauloCoelho.getAuthorName() + " " + PauloCoelho.getAuthorSurname() + ", " + TheAlchemist.getPublishingYear());

        TheVersionsOfUs.setPublishingYear(2014);
        System.out.println("TheVersionsOfUs.getPublishingYear() = " + TheVersionsOfUs.getPublishingYear());


        System.out.println("TheVersionsOfUs.equals(TheAlchemist) = " + TheVersionsOfUs.equals(TheAlchemist));
        System.out.println("LauraBarnell.equals(PauloCoelho) = " + LauraBarnell.equals(PauloCoelho));


    }






}