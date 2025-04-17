public class DocumentRegistry {
    private Document pdfPrototype;
    private Document textDocumentPrototype;
    private Document spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150);

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdf() {
        return pdfPrototype.clone();
    }

    public Document createText() {
        return textDocumentPrototype.clone();
    }

    public Document createSpreadsheet() {
        return spreadsheetPrototype.clone();
    }
}
