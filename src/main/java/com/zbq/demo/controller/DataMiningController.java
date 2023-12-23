package com.zbq.demo.controller;

import com.alibaba.fastjson.JSON;
import com.zbq.demo.domain.MobileFoodFacilityPermit;
import com.zbq.demo.domain.MobileFoodFacilityPermitExample;
import com.zbq.demo.dto.*;
import com.zbq.demo.mapper.MobileFoodFacilityPermitMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(name = "query", description = "Management APIs")
@RestController
public class DataMiningController {
    private static final Logger logger = LoggerFactory.getLogger(UserPermissionsController.class);

    @Autowired
    private MobileFoodFacilityPermitMapper mobileFoodFacilityPermitMapper;

    @Operation( summary = "all data", description = "list all data.", tags = {"get"} )
    @GetMapping("/getAllItems")
    public ResponseEntity<List<MobileFoodFacilityPermit>> getAllItems() {
        try {
            List<MobileFoodFacilityPermit> list = mobileFoodFacilityPermitMapper.selectByExample(null);
            logger.info(JSON.toJSONString(list));
            return ResponseEntity.success(list);
        }catch(Exception e){
            logger.error("getAllItems error:{}", e.getMessage());
            return ResponseEntity.failure(null);
        }
    }

    @Operation(summary = "Location KeyWord", description = "Get Data By Location KeyWord", tags = {"post"})
    @PostMapping("/getDataByLocationKeyWord")
    public ResponseEntity<List<MobileFoodFacilityPermit>> getDataByLocationKeyWord(@RequestBody List<String> requestEntity) {
        MobileFoodFacilityPermitExample criteria = new MobileFoodFacilityPermitExample();
        try {
            requestEntity.stream().forEach( keyword -> criteria.createCriteria().andLocationdescriptionLike("%"+keyword+"%") );

            List<MobileFoodFacilityPermit> list = mobileFoodFacilityPermitMapper.selectByExample(criteria);
            logger.info("getDataByLocationKeyWord:{}",JSON.toJSONString(list));

            return ResponseEntity.success(list);

        }catch(Exception e){
            logger.error("getDataByLocationKeyWord error:{}", e.getMessage());
            return ResponseEntity.failure(null);
        }
    }

    @Operation(summary = "FoodName", description = "Get Data By Food Name", tags = {"post"})
    @PostMapping("/getDataByFoodName")
    public ResponseEntity<List<MobileFoodFacilityPermit>> getDataFoodName(@RequestBody List<String> requestEntity) {

        MobileFoodFacilityPermitExample criteria = new MobileFoodFacilityPermitExample();
        try {
            requestEntity.stream().forEach( foodName -> criteria.createCriteria().andFooditemsLike("%"+foodName+"%") );

            List<MobileFoodFacilityPermit> list = mobileFoodFacilityPermitMapper.selectByExample(criteria);
            logger.info("getDataByFoodName:{}",JSON.toJSONString(list));
            return ResponseEntity.success(list);

        }catch(Exception e){
            logger.error("getDataByFoodName error:{}", e.getMessage());
            return ResponseEntity.failure(null);
        }
    }

    @Operation(summary = "Coordinate", description = "Get Data By Coordinate(latitude,longitude)", tags = {"post"})
    @PostMapping("/getDataByCoordinate")
    public ResponseEntity<List<MobileFoodFacilityPermit>> getDataByCoordinate(@RequestBody Coordinate requestEntity) {

        MobileFoodFacilityPermitExample criteria = new MobileFoodFacilityPermitExample();
        try {
            criteria.createCriteria().andLatitudeEqualTo(requestEntity.getLatitude());
            criteria.createCriteria().andLatitudeEqualTo(requestEntity.getLongitude());

            List<MobileFoodFacilityPermit> list = mobileFoodFacilityPermitMapper.selectByExample(criteria);
            logger.info("getDataByCoordinate:{}",JSON.toJSONString(list));
            return ResponseEntity.success(list);

        }catch(Exception e){
            logger.error("getDataByCoordinate error:{}", e.getMessage());
            return ResponseEntity.failure(null);
        }
    }

    @Operation(summary = "multiple conditions", description = "Get Data By multiple conditions defined", tags = {"post"})
    @PostMapping("/getDataByMultipleConditions")
    public ResponseEntity<List<MobileFoodFacilityPermit>> getDataFoodName(@RequestBody RequestEntity requestEntity) {

        MobileFoodFacilityPermitExample criteria = new MobileFoodFacilityPermitExample();
        try {
            criteria.createCriteria().andFooditemsLike("%" + requestEntity.getFoodName() + "%");
            if(null != requestEntity.getCoordinate()) {
                criteria.createCriteria().andLatitudeEqualTo(requestEntity.getCoordinate().getLatitude());
                criteria.createCriteria().andLatitudeEqualTo(requestEntity.getCoordinate().getLongitude());
            }
            criteria.createCriteria().andLocationdescriptionLike("%" + requestEntity.getLocationKeyWord() + "%");

            List<MobileFoodFacilityPermit> list = mobileFoodFacilityPermitMapper.selectByExample(criteria);
            logger.info("getDataByMultipleConditions:{}", JSON.toJSONString(list));
            return ResponseEntity.success(list);

        }catch(Exception e){
            logger.error("getDataByMultipleConditions error:{}", e.getMessage());
            return ResponseEntity.failure(null);
        }
    }
}
