package salon.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import salon.backend.dto.SalonCustDto;
import salon.backend.mapper.SalonMgmtMapper;

@Service
public class SalonMgmtService {
    SalonMgmtMapper salonMgmtMapper;
    
    public SalonCustDto selectCustBasicInfo(SalonCustDto salonCustDto) throws Exception {
        return salonMgmtMapper.selectCustBasicInfo(salonCustDto);
    }
}

/*
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.mortbay.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import ssg.dto.constant.CodeD;
import ssg.framework.domain.FrontUserInfo;
import ssg.framework.support.Profiles;
import ssg.framework.support.core.PageDto;
import ssg.front.comm.dto.DispCtgDto;
import ssg.front.comm.util.DispUtils;
import ssg.front.cornr.dto.CommonCornrCmptTgtItemDto;
import ssg.front.cornr.dto.ReqCommonCornrDto;
import ssg.front.disp.dto.CornrCmptTgtBanrDto;
import ssg.front.disp.dto.CornrDto;
import ssg.front.disp.dto.CornrSetCmptDto;
import ssg.front.disp.dto.TemplDto;
import ssg.front.disp.service.DispService;
import ssg.front.itemunit.ItemUnit;
import ssg.front.itemunit.ItemUnitFactory;
import ssg.front.itemunit.dto.ItemUnitParams;
import ssg.front.trip.city.dao.CityHomeDao;
import ssg.front.trip.city.dto.CityCornrDto;
import ssg.front.trip.city.dto.CityFtkPrcVrbDto;
import ssg.front.trip.city.dto.CityHomeDto;
import ssg.front.trip.city.dto.CityImgDto;
import ssg.front.trip.city.dto.CityRcmdFtDto;
import ssg.front.trip.city.dto.CityTipDto;
import ssg.front.trip.city.dto.CityWthrDto;
import ssg.front.trip.common.service.TripMallCommonService;

@Service
public class CityHomeService {
	@Autowired
	private Environment environment;

	@Autowired
	private CityHomeDao cityHomeDao;

	@Autowired
	private DispService dispService;

	@Autowired
	private TripMallCommonService tripMallCommonService;
	
	private static final int CITYHOME_PACKAGE_INDEX = 0;
	private static final int CITYHOME_ACTIVITY_INDEX = 1;

	private final String NEXT_PKG_DATA_URL = "m.apps.ssg.com/api/trip/package/datas.ssg";
    private final String NEXT_ACT_DATA_URL = "m.apps.ssg.com/api/trip/activity/datas.ssg";

	public CityHomeDto selectCityHomeInfo(CityHomeDto cityHomeDto) {
		cityHomeDto.setUpperSvcCityId(cityHomeDto.getSvcCityId().toUpperCase());
		return cityHomeDao.selectCityHomeInfo(cityHomeDto);
	}
*/