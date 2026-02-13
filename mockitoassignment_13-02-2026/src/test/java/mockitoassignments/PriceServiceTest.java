package mockitoassignments;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import mockitoassignment.DiscountRepository;
import mockitoassignment.PriceService;

public class PriceServiceTest {

@Test
public void testCalculateFinalPrice_Mobile() {
        // Step 1: Create mock object
DiscountRepository repoMock = mock(DiscountRepository.class);
// Step 2: Define behavior
when(repoMock.getDiscountPercentage("MOB")).thenReturn(10.0);
// Step 3: Inject mock into service
PriceService service = new PriceService(repoMock);
// Step 4: Call method
double result = service.calculateFinalPrice(1000, "MOB");

// Step 5: Assert result
 assertEquals(900.0, result);

// Step 6: Verify method call
verify(repoMock).getDiscountPercentage("MOB");
    }
    @Test
public void testCalculateFinalPrice_Laptop() {
DiscountRepository repoMock = mock(DiscountRepository.class);
when(repoMock.getDiscountPercentage("LAP")).thenReturn(20.0);
PriceService service = new PriceService(repoMock);
double result = service.calculateFinalPrice(2000, "LAP");
assertEquals(1600.0, result);
verify(repoMock).getDiscountPercentage("LAP");
    }

    @Test
  public void testDiscountRepositoryThrowsException() {
DiscountRepository repoMock = mock(DiscountRepository.class);
when(repoMock.getDiscountPercentage("ERR"))
                .thenThrow(new RuntimeException("Product not found"));
PriceService service = new PriceService(repoMock);
assertThrows(RuntimeException.class, () -> {
service.calculateFinalPrice(1000, "ERR");
        });
    }
}
