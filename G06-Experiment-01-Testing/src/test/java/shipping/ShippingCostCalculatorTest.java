package shipping;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShippingCostCalculatorTest {

    private final ShippingCostCalculator calculator = new ShippingCostCalculator();

    // BVA Tests
    @Test
    void testBoundaryPurchaseAmount() {
        assertEquals(25, calculator.calculateShippingCost(100, 3, DeliveryOption.NEXT_DAY));
        assertEquals(35, calculator.calculateShippingCost(101, 3, DeliveryOption.NEXT_DAY));
    }

    @Test
    void testBoundaryNumItems() {
        assertEquals(25, calculator.calculateShippingCost(100, 3, DeliveryOption.NEXT_DAY));
        assertEquals(0, calculator.calculateShippingCost(100, 4, DeliveryOption.WEEK)); // 4 * 1.50
    }

    // EP Tests
    @Test
    public void testInvalidPurchaseAmount() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateShippingCost(-10, 3, DeliveryOption.NEXT_DAY));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateShippingCost(0, 3, DeliveryOption.NEXT_DAY));
    }

    @Test
    public void testInvalidNumItems() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateShippingCost(100, -1, DeliveryOption.NEXT_DAY));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateShippingCost(100, 0, DeliveryOption.NEXT_DAY));
    }

    @Test
    public void testInvalidDeliveryOption() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateShippingCost(100, 3, null));
    }
    
    // Decision Table Tests
    @Test
    void testDecisionTableScenario1() {
        // purchaseAmount <= 100, numItems <= 3, NEXT_DAY
        assertEquals(25, calculator.calculateShippingCost(100, 3, DeliveryOption.NEXT_DAY));
    }
    
    @Test
    void testDecisionTableScenario2() {
    	// purchaseAmount <= 100, numItems <= 3, SECOND_DAY
    	assertEquals(10, calculator.calculateShippingCost(100, 3, DeliveryOption.SECOND_DAY));
    }
    
    @Test
    void testDecisionTableScenario3() {
    	// purchaseAmount <= 100, numItems <= 3, WEEK
    	assertEquals(4.5, calculator.calculateShippingCost(100, 3, DeliveryOption.WEEK));
    }
    
    @Test
    void testDecisionTableScenario4() {
        // purchaseAmount <= 100, numItems > 3, NEXT_DAY
        assertEquals(24, calculator.calculateShippingCost(100, 4, DeliveryOption.NEXT_DAY));
    }
    
    @Test
    void testDecisionTableScenario5() {
    	// purchaseAmount <= 100, numItems > 3, SECOND_DAY
    	assertEquals(10, calculator.calculateShippingCost(100, 4, DeliveryOption.SECOND_DAY));
    }
    
    @Test
    void testDecisionTableScenario6() {
    	// purchaseAmount <= 100, numItems > 3, WEEK
    	assertEquals(0, calculator.calculateShippingCost(100, 4, DeliveryOption.WEEK));
    }
    
    @Test
    void testDecisionTableScenario7() {
        // purchaseAmount > 100, numItems <= 3, NEXT_DAY
        assertEquals(35, calculator.calculateShippingCost(101, 3, DeliveryOption.NEXT_DAY));
    }
    
    @Test
    void testDecisionTableScenario8() {
    	// purchaseAmount > 100, numItems <= 3, SECOND_DAY
    	assertEquals(15, calculator.calculateShippingCost(101, 3, DeliveryOption.SECOND_DAY));
    }
    
    @Test
    void testDecisionTableScenario9() {
    	// purchaseAmount > 100, numItems <= 3, WEEK
    	assertEquals(10, calculator.calculateShippingCost(101, 3, DeliveryOption.WEEK));
    }
    
    @Test
    void testDecisionTableScenario10() {
        // purchaseAmount > 100, numItems > 3, NEXT_DAY
        assertEquals(30, calculator.calculateShippingCost(101, 4, DeliveryOption.NEXT_DAY));
    }
    
    @Test
    void testDecisionTableScenario11() {
    	// purchaseAmount > 100, numItems > 3, SECOND_DAY
    	assertEquals(14, calculator.calculateShippingCost(101, 4, DeliveryOption.SECOND_DAY));
    }
    
    @Test
    void testDecisionTableScenario12() {
    	// purchaseAmount > 100, numItems > 3, WEEK
    	assertEquals(10, calculator.calculateShippingCost(101, 4, DeliveryOption.WEEK));
    }
    
}
