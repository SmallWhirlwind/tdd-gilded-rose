package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BackstagePassTest {

    @Test
    void should_SellIn_10_Quality_21_when_BackstagePass_pass_one_day_given_SellIn_11_Quality_20() {
        BackstagePass backstagePass = new BackstagePass(11, 20);

        backstagePass.passOneDay();

        assertThat(backstagePass.getSellIn()).isEqualTo(10);
        assertThat(backstagePass.getQuality()).isEqualTo(21);
    }

    @Test
    void should_SellIn_10_Quality_50_when_BackstagePass_pass_one_day_given_SellIn_11_Quality_50() {
        BackstagePass backstagePass = new BackstagePass(11, 50);

        backstagePass.passOneDay();

        assertThat(backstagePass.getSellIn()).isEqualTo(10);
        assertThat(backstagePass.getQuality()).isEqualTo(50);
    }

    @Test
    void should_SellIn_9_Quality_22_when_BackstagePass_pass_one_day_given_SellIn_10_Quality_20() {
        BackstagePass backstagePass = new BackstagePass(10, 20);

        backstagePass.passOneDay();

        assertThat(backstagePass.getSellIn()).isEqualTo(9);
        assertThat(backstagePass.getQuality()).isEqualTo(22);
    }
}
