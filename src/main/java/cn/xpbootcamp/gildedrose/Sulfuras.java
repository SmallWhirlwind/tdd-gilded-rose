package cn.xpbootcamp.gildedrose;

public class Sulfuras implements TimeConsumption {
    private int quality;

    public Sulfuras(int quality) {
        this.quality = quality;
    }


    public int getQuality() {
        return quality;
    }

    public void passOneDay() {
    }
}
