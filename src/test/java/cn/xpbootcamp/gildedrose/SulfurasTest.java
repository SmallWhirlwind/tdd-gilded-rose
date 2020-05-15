package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SulfurasTest {

    @Test
    void should_Quality_40_when_Sulfuras_pass_one_day_given_Quality_40() {
        Sulfuras sulfuras = new Sulfuras(40);

        sulfuras.passOneDay();

        assertThat(sulfuras.getQuality()).isEqualTo(40);
    }
}
