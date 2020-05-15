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
        if (this.quality < 50) {
            if (this.sellIn < 10) {
                this.quality += 2;
            } else {
                this.quality += 1;
            }
        }
    }
}
