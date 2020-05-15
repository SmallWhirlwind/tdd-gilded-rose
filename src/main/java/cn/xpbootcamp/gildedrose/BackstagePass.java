package cn.xpbootcamp.gildedrose;

public class BackstagePass {
    private int sellIn;
    private int quality;

    public BackstagePass(int sellIn, int quality) {
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
        if (this.sellIn < 0) {
            this.quality = 0;
        } else if (this.sellIn < 5) {
            this.quality += 3;
        } else if (this.sellIn < 10) {
            this.quality += 2;
        } else {
            this.quality += 1;
        }
        if (this.quality > 50) {
            this.quality = 50;
        }
    }
}
