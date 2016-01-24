package modul62;

public class Directory extends File {

    File[] fileArray;

    public Directory(File[] myArray) {
        fileArray = myArray;
    }

    public Directory() {

    }

    public void print() {
        for (int i = 0; i < fileArray.length; i++)
            System.out.println(fileArray[i]);
    }

}
