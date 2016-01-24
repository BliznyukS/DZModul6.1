package modul62;

public class Directory extends File {

    File[] fileArray;

    public Directory(File[] myArray) {
        fileArray = myArray;
    }

    public Directory() {
        fileArray = new File[0];
    }

    public void print() {
        for (int i = 0; i < fileArray.length; i++)
            System.out.println(fileArray[i]);
    }

}
