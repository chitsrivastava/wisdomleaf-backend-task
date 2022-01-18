package com.wisdomleaf.task;

import org.springframework.beans.factory.annotation.Autowired;
import com.wisdomleaf.task.services.ClockService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WisdomleafApplicationTests {

	@Test
	void whenTimeIsValid() {
		ClockService clockService = new ClockService();
		String expectedTime = clockService.getSpokenTime("08:34");
		assertThat(expectedTime).isEqualTo("It's eight thirty four");
	}
	@Test
	void whenTimeIsInValid() {
		ClockService clockService = new ClockService();
		String expectedTime = clockService.getSpokenTime("45:34");
		assertThat(expectedTime).isEqualTo("Incorrect Time passed");
	}
	@Test
	void whenTimeIsMidday() {
		ClockService clockService = new ClockService();
		String expectedTime = clockService.getSpokenTime("12:00");
		assertThat(expectedTime).isEqualTo("It's Midday");
	}
	@Test
	void whenTimeIsMidnight() {
		ClockService clockService = new ClockService();
		String expectedTime = clockService.getSpokenTime("00:00");
		assertThat(expectedTime).isEqualTo("It's Midnight");
	}
}
