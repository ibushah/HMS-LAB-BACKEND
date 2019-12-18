package com.example.HMSPHARMACY.SERVICE;

import com.example.HMSPHARMACY.DTO.FilterSalesByDateDTO;
import com.example.HMSPHARMACY.DTO.SalesDTO;
import com.example.HMSPHARMACY.MODEL.BulkSave;
import com.example.HMSPHARMACY.MODEL.ProductRegistration;
import com.example.HMSPHARMACY.MODEL.Sales;
import com.example.HMSPHARMACY.REPOSITORY.BulkSaveRepository;
import com.example.HMSPHARMACY.REPOSITORY.ProductRegistrationRepository;
import com.example.HMSPHARMACY.REPOSITORY.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SalesService {

    @Autowired
    SalesRepository salesRepository;

    @Autowired
    BulkSaveRepository bulkSaveRepository;

    @Autowired
    ProductRegistrationRepository productRegistrationRepository;



    public ResponseEntity<String> saveSales(List<SalesDTO> salesDTOList){

        List<Sales> sales = new ArrayList<>();
        Double total=0D;
        Long remainingStock = 0L;
        String user = "";
        for(SalesDTO sale:salesDTOList)
            total = total + sale.getTotalSellingPrice();

//        for(SalesDTO salesDTO: salesDTOList){
//            user = salesDTO.getEmail();
//            break;
//        }
        for(int i = 0; i < 1; i++){
          user = salesDTOList.get(i).getEmail();
        }

        BulkSave bulkSave=new BulkSave();
        bulkSave.setCreatedAt(new Date());
        bulkSave.setCreatedBy(user);
        bulkSave.setTotal(total);
        BulkSave bulkSave1= saveBulk(bulkSave);
       

        salesDTOList.forEach(salesDto->{
            Sales sales1 = new Sales();
            sales1.setStatus("Active");
            sales1.setBulksave(bulkSave1);
            sales1.setProductQuantity(salesDto.getProductQuantity());
            sales1.setProductPrice(salesDto.getProductPrice());
            sales1.setProductName(salesDto.getProductRegistration().getProductName());
            sales1.setProductRegistrations(salesDto.getProductRegistration());
            sales1.setCostPrice(salesDto.getCostPrice());
            sales1.setTotalSellingPrice(salesDto.getTotalSellingPrice());
            sales.add(sales1);

        });


        salesRepository.saveAll(sales);



        return new ResponseEntity<String>("\"Sales successfully saved\"", HttpStatus.OK);
    }
    public  BulkSave saveBulk(BulkSave bulkSave)
    {

        bulkSaveRepository.save(bulkSave);

        return bulkSave;
    }

    public List<BulkSave> getBulkSaveData(){
        List<BulkSave> bulkSaves = bulkSaveRepository.findAll();
        return bulkSaves;
    }

    public List<BulkSave> getBulkSalesDataByDate(FilterSalesByDateDTO filterSalesByDateDTO) {



        if(filterSalesByDateDTO.from != null && filterSalesByDateDTO.till !=null){

            List<BulkSave> bulkSaves = bulkSaveRepository.getBulkSaveByCreatedAt(filterSalesByDateDTO.getFrom(),filterSalesByDateDTO.getTill());
            return bulkSaves;

        }
        else{
            return null;
        }

    }

    public ProductRegistration getProductById(Long id)
    {
       Optional<ProductRegistration> productRegistration= productRegistrationRepository.findById(id);

       if(!productRegistration.isPresent())
           return null;
       else
           return productRegistration.get();
    }



    public Date dateformatter(String strDate) throws Exception {
        Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(strDate);
        return date1;
    }

    public double getprofit(){
        return salesRepository.getProfit();
    }
}
