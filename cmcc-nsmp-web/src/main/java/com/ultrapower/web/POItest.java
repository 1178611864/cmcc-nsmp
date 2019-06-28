package com.ultrapower.web;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class POItest {

    @Test
    public void test1() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("表");
        XSSFRow row = sheet.createRow(1);
        XSSFCell cell = row.createCell(2);
        cell.setCellValue("测试数据");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.xlsx");
        workbook.write(fileOutputStream);
    }

    @Test
    public void test2() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("表");
        XSSFRow row = sheet.getRow(1);
        XSSFCell cell = row.getCell(2);
        String stringCellValue = cell.getStringCellValue();
        System.out.println(stringCellValue);
    }

    @Test
    public void test3() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("表");
        int rows = sheet.getPhysicalNumberOfRows();
        for(int i = 0; i<rows; i ++){
            XSSFRow row = sheet.getRow(i);
            int cells = row.getPhysicalNumberOfCells();
            for(int j=0; j<cells; j ++){
                XSSFCell cell = row.getCell(j);
                System.out.print(cell.getStringCellValue()+"    ");
            }
            System.out.println();
        }
    }

    @Test
    public void test4() throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("表");
        XSSFRow row = sheet.getRow(2);
        XSSFCell cell = row.getCell(3);
        String value = cell.getStringCellValue();
        System.out.println(value);
    }
}
