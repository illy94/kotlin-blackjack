package blackJack.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WinOrLoseTest {
    @Test
    fun get_win_draw_lose() {
        assertThat(WinOrLose.values()).hasSize(3)
    }
}