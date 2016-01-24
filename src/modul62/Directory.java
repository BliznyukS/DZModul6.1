package modul62;

public class Directory extends File {

    File[] fileArray;

    public Directory(File[] myArray) {
        fileArray = myArray;
    }

    public Directory() {

    }

    public File[] print() {
    for (int i = 0; i < fileArray.length; i++)
        System.out.println(fileArray);

    }
}
