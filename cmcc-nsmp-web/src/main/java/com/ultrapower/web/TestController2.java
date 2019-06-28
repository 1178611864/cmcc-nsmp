package com.ultrapower.web;

import com.ultrapower.dao.AmAssetMapper;
import com.ultrapower.pojo.AmAsset;
import com.ultrapower.utils.PkUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class TestController2 {

    @Autowired
    AmAssetMapper amAssetMapper;

    @RequestMapping("/test3")
    public ModelAndView test3(MultipartFile assetExcel) throws IOException {
        InputStream inputStream = assetExcel.getInputStream();
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("表");
        int rows = sheet.getPhysicalNumberOfRows();
        for(int i =0; i<rows; i ++){
            XSSFRow row = sheet.getRow(i);
            AmAsset amAsset = assetVO(row);
            amAssetMapper.insert(amAsset);
        }
        return null;
    }

    public AmAsset assetVO(XSSFRow row) {
        AmAsset amAsset = new AmAsset();
        amAsset.setPkAsset(PkUtils.getPrimaryKey());
        amAsset.setProvCode(row.getCell(0).getStringCellValue());
        amAsset.setAssetName(row.getCell(1).getStringCellValue());
        amAsset.setAssetCode(row.getCell(2).getStringCellValue());
        amAsset.setAssetIp(row.getCell(3).getStringCellValue());
        return amAsset;
    }

    @RequestMapping("/test4")
    public ResponseEntity<byte[]> test4() throws UnsupportedEncodingException {
        List<AmAsset> list = amAssetMapper.selectByExample(null);

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();

        //省份编码	资产名称	资产编码	资产ip
        XSSFRow row = sheet.getRow(0);
        row.createCell(0).setCellValue("省份编码");
        row.createCell(1).setCellValue("资产名称");
        row.createCell(2).setCellValue("资产编码");
        row.createCell(3).setCellValue("资产ip");

        for(int i=0;i<list.size();i ++){
            XSSFRow rowAsset = sheet.createRow(i + 1);
            rowAsset.createCell(0).setCellValue(list.get(i).getProvCode());
            rowAsset.createCell(1).setCellValue(list.get(i).getAssetName());
            rowAsset.createCell(2).setCellValue(list.get(i).getAssetCode());
            rowAsset.createCell(3).setCellValue(list.get(i).getAssetIp());
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpHeaders headers=new HttpHeaders();
        String fileName=new String("资产数据.xlsx".getBytes("UTF-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        ResponseEntity<byte[]> returnFile=new ResponseEntity<byte[]>
                (outputStream.toByteArray(),headers,HttpStatus.CREATED);
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnFile;
    }

}
