package thigk2.hoxuanphuc;

public class HistoricalFigure {
    private String name;
    private String birthplace;
    private int imageResource;

    public HistoricalFigure(String name, String birthplace, int imageResource) {
        this.name = name;
        this.birthplace = birthplace;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public int getImageResource() {
        return imageResource;
    }
}