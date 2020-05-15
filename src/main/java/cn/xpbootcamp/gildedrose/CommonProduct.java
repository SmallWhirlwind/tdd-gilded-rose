package cn.xpbootcamp.gildedrose;

public class CommonProduct {
    private int sellIn;
    private int quality;

    public CommonProduct(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void passOneDay() {
        this.sellIn -= 1;

        if (this.sellIn == -1) {
            this.quality -= 2;
        } else {
            this.quality -= 1;
        }
    }
}
