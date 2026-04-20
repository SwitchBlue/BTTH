package thigk2.hoxuanphuc;

public class Student {
    private String fullName;
    private String className;
    private String address;
    private int photoResource;

    public Student(String fullName, String className, String address, int photoResource) {
        this.fullName = fullName;
        this.className = className;
        this.address = address;
        this.photoResource = photoResource;
    }

    public String getFullName() {
        return fullName;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    public int getPhotoResource() {
        return photoResource;
    }
}