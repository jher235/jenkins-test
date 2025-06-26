package hello.testjenkins.controller;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HealthControllerTest {

	@Autowired
	private HealthController healthController;

	@DisplayName("헬스 체킹은 서버가 동작 중인 경우 항상 200을 리턴함.")
	@Test
	void healthTest() {
		assertThat(healthController.healthCheck()).isEqualTo("200");
	}

}