package modul62;

public class Main {
    public static void main(String[] args) {

        File[] fileInDirectory = {new File(), new Picture(), new Audio(), new Text(), new Video()};

        Directory newDirectory = new Directory(fileInDirectory);
        newDirectory.print();


    }

}
