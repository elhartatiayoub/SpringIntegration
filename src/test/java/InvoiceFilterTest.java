import com.intelcia.invoice.Invoice;
import com.intelcia.invoice.InvoiceFilter;
import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;



public class InvoiceFilterTest extends TestCase{

    @Test
    public void testAccept() {
        InvoiceFilter filter = new InvoiceFilter();

        assertTrue(filter.accept(invoice("0")));
        assertTrue(filter.accept(invoice("100")));
        assertTrue(filter.accept(invoice("9999")));

        assertFalse(filter.accept(invoice("10000")));
        assertFalse(filter.accept(invoice("100000")));
        assertFalse(filter.accept(invoice("13337")));
    }

    private Invoice invoice(String amount) {
        return new Invoice("some-iban", "some-addr", "some-acc", new BigDecimal(amount));
    }

}