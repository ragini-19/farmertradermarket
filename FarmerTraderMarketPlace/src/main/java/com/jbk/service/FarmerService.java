package com.jbk.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jbk.model.Farmer;
import com.jbk.repository.FarmerRepository;

@Service
public class FarmerService {
	@Autowired
	FarmerRepository FarmerRepo;

	public List<Farmer> GetFarmer(MultipartFile multipartFile,
            File file) throws Exception {

		List<Farmer> list = new ArrayList<Farmer>();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\RAHUL\\gitproject\\farmertradermarket\\FarmerTraderMarketPlace\\src\\main\\resources\\Farmer.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Farmer farmer = new Farmer();
			Row row = sheet.getRow(i);

			farmer.setId((int) row.getCell(0).getNumericCellValue());
			farmer.setName(row.getCell(1).getStringCellValue());
			farmer.setDistrict(row.getCell(2).getStringCellValue());
			farmer.setState(row.getCell(3).getStringCellValue());
			farmer.setCountry(row.getCell(4).getStringCellValue());
			farmer.setQuantity((int) row.getCell(5).getNumericCellValue());
			// farmer.setQuantity( (long) row.getCell(4).getNumericCellValue());
			list.add(FarmerRepo.save(farmer));
		}

		return list;

	}

}
