package access_system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class AccessSystemTest {
	
	// BVA Test
	@Test
	void BVAtests() {
		
		// Week Days LocalDateTime datas
		LocalDateTime weekDayEightFiftyNine = LocalDateTime.of(2024, 12, 9, 8, 59);
		LocalDateTime weekDayNine = LocalDateTime.of(2024, 12, 9, 9, 0);
		LocalDateTime weekDayNineOhOne = LocalDateTime.of(2024, 12, 9, 9, 1);
		LocalDateTime weekDayFourteen = LocalDateTime.of(2024, 12, 9, 14, 0);
		LocalDateTime weekDaySixteenFiftyOne = LocalDateTime.of(2024, 12, 9, 16, 59);
		LocalDateTime weekDaySeventeen = LocalDateTime.of(2024, 12, 9, 17, 0);
		LocalDateTime weekDaySeventeenOhOne = LocalDateTime.of(2024, 12, 9, 17, 1);
		LocalDateTime weekDayTwentyThree = LocalDateTime.of(2024, 12, 9, 23, 0);
		
		// Weekend Days LocalDateTime datas
		LocalDateTime weekendDayEightFiftyNine = LocalDateTime.of(2024, 12, 7, 8, 59);
		LocalDateTime weekendDayNine = LocalDateTime.of(2024, 12, 7, 9, 0);
		LocalDateTime weekendDayNineOhOne = LocalDateTime.of(2024, 12, 7, 9, 1);
		LocalDateTime weekendDayFourteen = LocalDateTime.of(2024, 12, 7, 14, 0);
		LocalDateTime weekendDaySixteenFiftyOne = LocalDateTime.of(2024, 12, 7, 16, 59);
		LocalDateTime weekendDaySeventeen = LocalDateTime.of(2024, 12, 7, 17, 0);
		LocalDateTime weekendDaySeventeenOhOne = LocalDateTime.of(2024, 12, 7, 17, 1);
		LocalDateTime weekendDayTwentyThree = LocalDateTime.of(2024, 12, 7, 23, 0);
		
		// BVA Tests for NOT_EMPLOYEE
		
		// Week Days
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDayEightFiftyNine));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDayNine));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDayNineOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDayFourteen));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDaySixteenFiftyOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDaySeventeen));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDaySeventeenOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekDayTwentyThree));
		
		// Weekend Days
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDayEightFiftyNine));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDayNine));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDayNineOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDayFourteen));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDaySixteenFiftyOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDaySeventeen));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDaySeventeenOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, weekendDayTwentyThree));
		
		// BVA Tests for EMPLOYEE
		
		// Week Days
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDayEightFiftyNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDayNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDayNineOhOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDayFourteen));
		assertEquals(true, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDaySixteenFiftyOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDaySeventeen));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDaySeventeenOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekDayTwentyThree));
		
		// Weekend Days
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDayEightFiftyNine));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDayNine));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDayNineOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDayFourteen));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDaySixteenFiftyOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDaySeventeen));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDaySeventeenOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, weekendDayTwentyThree));
		
		// BVA Tests for SPECIAL_EMPLOYEE
		
		// Week Days
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDayEightFiftyNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDayNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDayNineOhOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDayFourteen));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDaySixteenFiftyOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDaySeventeen));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDaySeventeenOhOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekDayTwentyThree));
				
		// Weekend Days
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDayEightFiftyNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDayNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDayNineOhOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDayFourteen));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDaySixteenFiftyOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDaySeventeen));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDaySeventeenOhOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, weekendDayTwentyThree));
		
		// BVA Tests for AUDITOR
		
		// Week Days
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, weekDayEightFiftyNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekDayNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekDayNineOhOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekDayFourteen));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekDaySixteenFiftyOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekDaySeventeen));
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, weekDaySeventeenOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, weekDayTwentyThree));
				
		// Weekend Days
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, weekendDayEightFiftyNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekendDayNine));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekendDayNineOhOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekendDayFourteen));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekendDaySixteenFiftyOne));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, weekendDaySeventeen));
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, weekendDaySeventeenOhOne));
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, weekendDayTwentyThree));
		
	}
	
	// EP Test
	
	@Test
	void testInvalidPersonStatus() {
		assertThrows(IllegalArgumentException.class, () -> AccessSystem.Access(null, LocalDateTime.of(2024, 12, 9, 8, 59)));
	}
	
	@Test
	void testInvalidLocalDateTime() {
		assertThrows(IllegalArgumentException.class, () -> AccessSystem.Access(PersonStatus.AUDITOR, null));
	}
	
	@Test
	void testInvalidForNotEmployee() {
		LocalDateTime invalidWeekend = LocalDateTime.of(2024, 12, 7, 10, 0);
		LocalDateTime invalidTime = LocalDateTime.of(2024, 12, 9, 7, 0);
		
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, invalidWeekend));
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, invalidTime));
	}
	
	@Test
	void testInvalidForEmployee() {
		LocalDateTime invalidWeekend = LocalDateTime.of(2024, 12, 7, 10, 0);
		LocalDateTime invalidTime = LocalDateTime.of(2024, 12, 9, 7, 0);
		
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, invalidWeekend));
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, invalidTime));
	}
	
	@Test
	void testValidForEmployee() {
		LocalDateTime validTime = LocalDateTime.of(2024, 12, 9, 12, 0);
		
		assertEquals(true, AccessSystem.Access(PersonStatus.EMPLOYEE, validTime));
	}
	
	@Test
	void testValidForSpecialEmployee() {
		LocalDateTime validWeekend = LocalDateTime.of(2024, 12, 7, 10, 0);
		LocalDateTime validWeek = LocalDateTime.of(2024, 12, 9, 14, 0);
		
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, validWeekend));
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, validWeek));		
	}
	
	@Test
	void testInvalidForAuditor() {
		LocalDateTime invalidWeekend = LocalDateTime.of(2024, 12, 7, 7, 0);
		LocalDateTime invalidWeek = LocalDateTime.of(2024, 12, 9, 18, 0);
		
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, invalidWeekend));
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, invalidWeek));
	}

	@Test
	void testValidForAuditor() {
		LocalDateTime validWeekend = LocalDateTime.of(2024, 12, 7, 10, 0);
		LocalDateTime validWeek = LocalDateTime.of(2024, 12, 9, 14, 0);
		
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, validWeekend));
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, validWeek));	
	}
	
	// Decision Table Testing
	
	@Test
	void testDecisionTableScenario1() {
		// Person Status: NOT_EMPLOYEE, Time before 09:00, WeekDay
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, LocalDateTime.of(2024, 12, 9, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario2() {
		// Person Status: NOT_EMPLOYEE, Time between 09:00 and 17.00, WeekDay
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, LocalDateTime.of(2024, 12, 9, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario3() {
		// Person Status: NOT_EMPLOYEE, Time after 17.00, WeekDay
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, LocalDateTime.of(2024, 12, 9, 18, 0)));
	}
	
	@Test
	void testDecisionTableScenario4() {
		// Person Status: NOT_EMPLOYEE, Time before 09:00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, LocalDateTime.of(2024, 12, 7, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario5() {
		// Person Status: NOT_EMPLOYEE, Time between 09:00 and 17.00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, LocalDateTime.of(2024, 12, 7, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario6() {
		// Person Status: NOT_EMPLOYEE, Time after 17.00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.NOT_EMPLOYEE, LocalDateTime.of(2024, 12, 7, 18, 0)));
	}
	
	@Test
	void testDecisionTableScenario7() {
		// Person Status: EMPLOYEE, Time before 09:00, WeekDay
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, LocalDateTime.of(2024, 12, 9, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario8() {
		// Person Status: EMPLOYEE, Time between 09:00 and 17.00, WeekDay
		assertEquals(true, AccessSystem.Access(PersonStatus.EMPLOYEE, LocalDateTime.of(2024, 12, 9, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario9() {
		// Person Status: EMPLOYEE, Time after 17.00, WeekDay
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, LocalDateTime.of(2024, 12, 9, 18, 0)));
	}
	
	@Test
	void testDecisionTableScenario10() {
		// Person Status: EMPLOYEE, Time before 09:00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, LocalDateTime.of(2024, 12, 7, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario11() {
		// Person Status: EMPLOYEE, Time between 09:00 and 17.00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, LocalDateTime.of(2024, 12, 7, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario12() {
		// Person Status: EMPLOYEE, Time after 17.00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.EMPLOYEE, LocalDateTime.of(2024, 12, 7, 18, 0)));
	}
	
	@Test
	void testDecisionTableScenario13() {
		// Person Status: SPECIAL_EMPLOYEE, Time before 09:00, WeekDay
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, LocalDateTime.of(2024, 12, 9, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario14() {
		// Person Status: SPECIAL_EMPLOYEE, Time between 09:00 and 17.00, WeekDay
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, LocalDateTime.of(2024, 12, 9, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario15() {
		// Person Status: SPECIAL_EMPLOYEE, Time after 17.00, WeekDay
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, LocalDateTime.of(2024, 12, 9, 18, 0)));
	}
	
	@Test
	void testDecisionTableScenario16() {
		// Person Status: SPECIAL_EMPLOYEE, Time before 09:00, WeekendDay
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, LocalDateTime.of(2024, 12, 7, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario17() {
		// Person Status: SPECIAL_EMPLOYEE, Time between 09:00 and 17.00, WeekendDay
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, LocalDateTime.of(2024, 12, 7, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario18() {
		// Person Status: SPECIAL_EMPLOYEE, Time after 17.00, WeekendDay
		assertEquals(true, AccessSystem.Access(PersonStatus.SPECIAL_EMPLOYEE, LocalDateTime.of(2024, 12, 7, 18, 0)));
	}
	
	@Test
	void testDecisionTableScenario19() {
		// Person Status: AUDITOR, Time before 09:00, WeekDay
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, LocalDateTime.of(2024, 12, 9, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario20() {
		// Person Status: AUDITOR, Time between 09:00 and 17.00, WeekDay
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, LocalDateTime.of(2024, 12, 9, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario21() {
		// Person Status: AUDITOR, Time after 17.00, WeekDay
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, LocalDateTime.of(2024, 12, 9, 18, 0)));
	}
	
	@Test
	void testDecisionTableScenario22() {
		// Person Status: AUDITOR, Time before 09:00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, LocalDateTime.of(2024, 12, 7, 7, 0)));
	}
	
	@Test
	void testDecisionTableScenario23() {
		// Person Status: AUDITOR, Time between 09:00 and 17.00, WeekendDay
		assertEquals(true, AccessSystem.Access(PersonStatus.AUDITOR, LocalDateTime.of(2024, 12, 7, 12, 0)));
	}
	
	@Test
	void testDecisionTableScenario24() {
		// Person Status: AUDITOR, Time after 17.00, WeekendDay
		assertEquals(false, AccessSystem.Access(PersonStatus.AUDITOR, LocalDateTime.of(2024, 12, 7, 18, 0)));
	}
	
}