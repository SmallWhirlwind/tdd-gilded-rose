package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AgedBrieTest {

    @Test
    void should_SellIn_29_Quality_41_when_AgedBrie_pass_one_day_given_SellIn_30_Quality_40() {
        AgedBrie agedBrie = new AgedBrie(30, 40);

        agedBrie.passOneDay();

        assertThat(agedBrie.getSellIn()).isEqualTo(29);
        assertThat(agedBrie.getQuality()).isEqualTo(41);
    }

    @Test
    void should_SellIn_29_Quality_50_when_AgedBrie_pass_one_day_given_SellIn_30_Quality_50() {
        AgedBrie agedBrie = new AgedBrie(30, 50);

        agedBrie.passOneDay();

        assertThat(agedBrie.getSellIn()).isEqualTo(29);
        assertThat(agedBrie.getQuality()).isEqualTo(50);
    }
}
