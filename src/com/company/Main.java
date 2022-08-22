package com.company;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
        try
        {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            Paragraph rail = new Paragraph("........... Railway...........\nRESERVATION / CANCELLATION / REQUISITION FORM");
            rail.setAlignment(Element.ALIGN_CENTER);

            PdfPTable table = new PdfPTable(2); // 2 columns.
            table.setWidthPercentage(90); //Width 80%
            table.setSpacingBefore(20f); //Space before table
            table.setSpacingAfter(20f); //Space after table

            //Set Column widths
            float[] columnWidths = {2f, 1f};
            table.setWidths(columnWidths);

            PdfPCell cell1 = new PdfPCell(new Paragraph("If you are Medical Practitioner Please tick in Box ( )"));

            cell1.setPaddingLeft(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2 = new PdfPCell(new Paragraph("Dr. .................................."));

            cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3 = new PdfPCell(new Paragraph("If you want Sr, Citizen concession, please write Yes/ No in the box"));

            cell3.setPaddingLeft(10);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell4 = new PdfPCell(new Paragraph(">"));

            cell4.setPaddingLeft(10);
            cell4.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell4.setVerticalAlignment(Element.ALIGN_RIGHT);

            PdfPCell cell5 = new PdfPCell(new Paragraph("Do you want to be upgraded tick the option"));

            cell5.setPaddingLeft(10);
            cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell6 = new PdfPCell(new Paragraph("YES / NO"));

            cell6.setPaddingLeft(10);
            cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);

            //To avoid having the cell border and the content overlap, if you are having thick cell borders
            //cell1.setUserBorderPadding(true);
            //cell2.setUserBorderPadding(true);
            //cell3.setUserBorderPadding(true);

            // TABLE NO.2 (for extra fields of date and time.)

            PdfPTable table2 = new PdfPTable(2); // 2 columns.
            table.setWidthPercentage(90); //Width 80%
            table.setSpacingBefore(20f); //Space before table
            table.setSpacingAfter(20f); //Space after table

            //Set Column widths
            float[] columnWidths2 = {2f, 1f};
            table.setWidths(columnWidths2);

            PdfPCell cell2_1 = new PdfPCell(new Paragraph("Train No. and Name ___________"));

            cell2_1.setPaddingLeft(10);
            cell2_1.setBorderColor(BaseColor.WHITE);
            cell2_1.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2_2 = new PdfPCell(new Paragraph("Date of Journey ______________"));

            cell2_2.setPaddingLeft(10);
            cell2_2.setBorderColor(BaseColor.WHITE);
            cell2_2.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_2.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2_3 = new PdfPCell(new Paragraph("Class _____________"));

            cell2_3.setPaddingLeft(10);
            cell2_3.setBorderColor(BaseColor.WHITE);
            cell2_3.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_3.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2_4 = new PdfPCell(new Paragraph("No. of Seat ______________"));

            cell2_4.setPaddingLeft(10);
            cell2_4.setBorderColor(BaseColor.WHITE);
            cell2_4.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_4.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2_5 = new PdfPCell(new Paragraph("Station From _________________"));

            cell2_5.setPaddingLeft(10);
            cell2_5.setBorderColor(BaseColor.WHITE);
            cell2_5.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_5.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2_6 = new PdfPCell(new Paragraph("To __________________"));

            cell2_6.setPaddingLeft(10);
            cell2_6.setBorderColor(BaseColor.WHITE);
            cell2_6.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_6.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2_7 = new PdfPCell(new Paragraph("Boarding at ______________"));

            cell2_7.setPaddingLeft(10);
            cell2_7.setBorderColor(BaseColor.WHITE);
            cell2_7.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_7.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell2_8 = new PdfPCell(new Paragraph("Reservation up-to _____________"));

            cell2_8.setPaddingLeft(10);
            cell2_8.setBorderColor(BaseColor.WHITE);
            cell2_8.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2_8.setVerticalAlignment(Element.ALIGN_MIDDLE);


            //TABLE NO. 3

            PdfPTable table3 = new PdfPTable(6); // 6 columns.
            table.setWidthPercentage(90); //Width 100%
            table.setSpacingBefore(10f); //Space before table
            table.setSpacingAfter(10f); //Space after table

            //Set Column widths
            float[] columnWidths3 = {2f, 2f, 2f, 2f, 2f, 2f};
            table3.setWidths(columnWidths3);

            PdfPCell cell3_1 = new PdfPCell(new Paragraph("If you are a Medical Practitioner Please ti the box( )"));

            cell3_1.setPaddingLeft(5);
            cell3_1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3_1.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_2 = new PdfPCell(new Paragraph("Dr .........."));

            cell3_2.setPaddingLeft(5);
            cell3_2.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_2.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_3 = new PdfPCell(new Paragraph("If you want Sr. Citizen concession please write Yes / No in the box"));

            cell3_3.setPaddingLeft(5);
            cell3_3.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_3.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_4 = new PdfPCell(new Paragraph("..................."));

            cell3_4.setPaddingLeft(5);
            cell3_4.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_4.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_5 = new PdfPCell(new Paragraph("Do you want to be upgraded without Write Yes / NO iin the box"));

            cell3_5.setPaddingLeft(5);
            cell3_5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3_5.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_6 = new PdfPCell(new Paragraph(">"));

            cell3_6.setPaddingLeft(5);
            cell3_6.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_6.setVerticalAlignment(Element.ALIGN_RIGHT);

            PdfPCell cell3_7 = new PdfPCell(new Paragraph("Sr. NO"));

            cell3_7.setPaddingLeft(5);
            cell3_7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3_7.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_8 = new PdfPCell(new Paragraph("Name (Block Letters"));

            cell3_8.setPaddingLeft(5);
            cell3_8.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3_8.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_9 = new PdfPCell(new Paragraph("Sex ( M / F )"));

            cell3_9.setPaddingLeft(5);
            cell3_9.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3_9.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_10 = new PdfPCell(new Paragraph("Age"));

            cell3_10.setPaddingLeft(5);
            cell3_10.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3_10.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_11 = new PdfPCell(new Paragraph("Travel Authority "));

            cell3_11.setPaddingLeft(5);
            cell3_11.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_11.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_12 = new PdfPCell(new Paragraph("Travel Authority No."));

            cell3_12.setPaddingLeft(5);
            cell3_12.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_12.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_13 = new PdfPCell(new Paragraph("1. \n2."));

            cell3_13.setPaddingLeft(5);
            cell3_13.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_13.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_14 = new PdfPCell(new Paragraph(""));

            cell3_14.setPaddingLeft(10);
            cell3_14.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_14.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_15 = new PdfPCell(new Paragraph(""));

            cell3_15.setPaddingLeft(10);
            cell3_15.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_15.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_16 = new PdfPCell(new Paragraph(""));

            cell3_16.setPaddingLeft(10);
            cell3_16.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_16.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_17 = new PdfPCell(new Paragraph(""));

            cell3_17.setPaddingLeft(10);
            cell3_17.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_17.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_18 = new PdfPCell(new Paragraph(""));

            cell3_18.setPaddingLeft(10);
            cell3_18.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_18.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_19 = new PdfPCell(new Paragraph(""));

            cell3_19.setPaddingLeft(10);
            cell3_19.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_19.setVerticalAlignment(Element.ALIGN_MIDDLE);

            PdfPCell cell3_20 = new PdfPCell(new Paragraph(""));

            cell3_20.setPaddingLeft(10);
            cell3_20.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell3_20.setVerticalAlignment(Element.ALIGN_MIDDLE);





            //FOR TABLE 1
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);
            table.addCell(cell6);

            //FOR TABLE 2
            table2.addCell(cell2_1);
            table2.addCell(cell2_2);
            table2.addCell(cell2_3);
            table2.addCell(cell2_4);
            table2.addCell(cell2_5);
            table2.addCell(cell2_6);
            table2.addCell(cell2_7);
            table2.addCell(cell2_8);

            //FOR TABLE 3
            table3.addCell(cell3_1);
            table3.addCell(cell3_2);
            table3.addCell(cell3_3);
            table3.addCell(cell3_4);
            table3.addCell(cell3_5);
            table3.addCell(cell3_6);
            table3.addCell(cell3_7);
            table3.addCell(cell3_8);
            table3.addCell(cell3_9);
            table3.addCell(cell3_10);
            table3.addCell(cell3_11);
            table3.addCell(cell3_12);
            table3.addCell(cell3_13);
            table3.addCell(cell3_14);
            table3.addCell(cell3_15);
            table3.addCell(cell3_16);
            table3.addCell(cell3_17);
            table3.addCell(cell3_18);
            table3.addCell(cell3_19);
            table3.addCell(cell3_20);

            document.add(rail);
            document.add( Chunk.NEWLINE );
            document.add(table);
            document.add( Chunk.NEWLINE );
            document.add(table2);
            document.add( Chunk.NEWLINE );
            document.add(table3);
            document.close();
            writer.close();
        } catch (DocumentException e)
        {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
       catch (Exception e)
        {
            e.printStackTrace();
        }
        }
}
