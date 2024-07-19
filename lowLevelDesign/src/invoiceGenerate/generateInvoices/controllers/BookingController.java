package invoiceGenerate.generateInvoices.controllers;

import invoiceGenerate.generateInvoices.dtos.GenerateInvoiceRequestDTO;
import invoiceGenerate.generateInvoices.dtos.GenerateInvoiceResponseDTO;
import invoiceGenerate.generateInvoices.services.BookingService;

public class BookingController {
    BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }
    public GenerateInvoiceResponseDTO generateInvoice(GenerateInvoiceRequestDTO requestDTO){
        return null;
    }
}
