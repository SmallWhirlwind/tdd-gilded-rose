package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CommonProductTest {

    @Test
    void should_SellIn_0_Quality_39_when_CommonProduct_pass_one_day_given_SellIn_1_Quality_40() {
        CommonProduct commonProduct = new CommonProduct(1, 40);

        commonProduct.passOneDay();

        assertThat(commonProduct.getSellIn()).isEqualTo(0);
        assertThat(commonProduct.getQuality()).isEqualTo(39);
    }

    @Test
    void should_SellIn_negative_1_Quality_38_when_CommonProduct_pass_one_day_given_SellIn_0_Quality_40() {
        CommonProduct commonProduct = new CommonProduct(0, 40);

        commonProduct.passOneDay();

        assertThat(commonProduct.getSellIn()).isEqualTo(-1);
        assertThat(commonProduct.getQuality()).isEqualTo(38);
    }
}
